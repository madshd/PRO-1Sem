package ex1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Optional;

public class ex1Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final  TextField txfTitle = new TextField();
    private final CheckBox chkbzSenior = new CheckBox();
    private final ArrayList<Person> persons = new ArrayList<Person>();
    private final ListView<Person> lvwPersons = new ListView<>();

    private void initContent(GridPane pane) {
//        this.initNames();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);

        Label lblTitle = new Label("Title: ");
        pane.add(lblTitle, 0,1);
        pane.add(txfTitle, 1, 1);

        Label lblSenior = new Label("Senior");
        pane.add(chkbzSenior, 1,3);

        HBox senior = new HBox(chkbzSenior, lblSenior);
        pane.add(senior, 1,3);

        // add a text field to the pane (at col=1, row=0)
        // add a listView to the pane(at col=1, row=1)

        // add a label to the pane (at col=0, row=1)
        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 4);
        GridPane.setValignment(lblPersons, VPos.TOP);

        pane.add(lvwPersons, 1, 4);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);

        // add a button to the pane (at col=4, row=0)
        Button btnAdd = new Button("Add person");
        pane.add(btnAdd, 4, 3);
       // btnAdd.setDefaultButton(true);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());

    }

    // -------------------------------------------------------------------------
        private Person initNames() {
            return null;
        }
    private void addAction() {
        if (txfName.getLength() == 0 || txfTitle.getLength() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Name or title field is empty!");
            alert.setContentText("You need to input a name and a title, to add a person.");

            alert.showAndWait();
        } else {
            boolean isOld = chkbzSenior.isSelected();
            persons.add(new Person(txfName.getText().trim(), txfTitle.getText(), isOld));
            lvwPersons.getItems().setAll(persons);
        }
    }
}
