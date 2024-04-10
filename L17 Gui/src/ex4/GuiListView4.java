package ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiListView4 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo4");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final ListView<Person> lvwBoys = new ListView<>();
    private final ArrayList<Person> boys = new ArrayList<>();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 1);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        GridPane.setValignment(lblNames, VPos.TOP);

        pane.add(txfName, 1, 1);

        pane.add(lvwBoys, 1, 0);
        lvwBoys.setPrefWidth(200);
        lvwBoys.setPrefHeight(200);
        lvwBoys.getItems().addAll(boys);

        lvwBoys.getSelectionModel().selectedItemProperty().addListener((ov, o, n) -> this.personsItemSelected());

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 2, 1);
        btnAdd.setOnAction(event -> this.addAction());

    }

    // -------------------------------------------------------------------------
    // Selected item changed in lvwPersons

    private void personsItemSelected() {
        Person selected = lvwBoys.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txfName.setText(selected.getName());
        } else {
            // You may choose not to clear the text field here
        }
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        if (!name.isEmpty()) {
            Person p = new Person(name);
            boys.add(p);
            lvwBoys.getItems().add(p); // Add the new person to the list directly
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add person");
            alert.setHeaderText("No name typed");
            alert.setContentText("Type the name of the person");
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}