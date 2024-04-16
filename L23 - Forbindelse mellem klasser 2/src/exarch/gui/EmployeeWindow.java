package exarch.gui;

import exarch.controller.Controller;
import exarch.model.Company;
import exarch.model.Employee;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeWindow extends Stage {
    private final Employee employee; // nullable


    /** Note: Nullable param company. */
    public EmployeeWindow(String title, Employee employee) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.employee = employee;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------
    private final TextField txfName = new TextField();
    private final TextField txfHourlyWage = new TextField();
    private final CheckBox cbxCompany = new CheckBox("Company");
    private final ComboBox comBkzCompanies = new ComboBox();
    private final Label lblError = new Label();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblName = new Label("Name");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 0, 1);
        txfName.setPrefWidth(200);

        Label lblHourlyWage = new Label("Hourly Wage");
        pane.add(lblHourlyWage, 0, 2);
        pane.add(txfHourlyWage, 0, 3);

        // Company checkbox
        pane.add(cbxCompany, 0, 4);
        cbxCompany.setOnAction(event -> this.cbxAction());
        pane.add(comBkzCompanies, 0,5);

        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 0, 6);
        GridPane.setHalignment(btnCancel, HPos.LEFT);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        pane.add(btnOK, 0, 6);
        GridPane.setHalignment(btnOK, HPos.RIGHT);
        btnOK.setOnAction(event -> this.okAction());

        pane.add(lblError, 0, 7);
        lblError.setStyle("-fx-text-fill: red");

        this.initControls();
    }

    // -------------------------------------------------------------------------

    private void initControls() {
        if (employee != null) {
            txfName.setText(employee.getName());
            txfHourlyWage.setText(String.valueOf(employee.getWage()));
        } else {
            txfName.clear();
            txfHourlyWage.clear();
        }
    }

    // -------------------------------------------------------------------------


    private void cbxAction() {
        if (cbxCompany.isSelected()) {
            comBkzCompanies.setDisable(false);
            ArrayList<Company> comboCompanies = Controller.getCompanies();
            comBkzCompanies.getItems().clear();
            comBkzCompanies.getItems().addAll(comboCompanies);
            if (!comboCompanies.isEmpty()) {
                comBkzCompanies.getSelectionModel().selectFirst();
            }
            comBkzCompanies.setVisible(true);
        } else {
          comBkzCompanies.getItems().clear();
          comBkzCompanies.setVisible(false);
        }
    }

    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        Company selectedCompany = null;
        if (cbxCompany.isSelected()) {
            selectedCompany = (Company) comBkzCompanies.getValue();
        }
        String name = txfName.getText().trim();
        if (name.length() == 0) {
            lblError.setText("Name is empty");
            return;
        }
        int wage = -1;
        try {
            wage = Integer.parseInt(String.valueOf(txfHourlyWage.getText().trim()));
        } catch (NumberFormatException ex) {
            // do nothing
        }
        if (wage < 0) {
            lblError.setText("Hourly wage is not a positive number, nobody works for free.");
            return;
        }

        if (employee != null) {
            Controller.updateEmployee(employee, name, wage);
            if (selectedCompany != null) {
                Controller.addEmployeeToCompany(selectedCompany, employee);
            }
        } else {
            if (selectedCompany != null) {
                Controller.createEmployee(name, wage, selectedCompany);
            } else {
                Controller.createEmployee(name, wage);
            }
        }
        this.hide();
    }
}
