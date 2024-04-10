package ex3;

import ex1.Person;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiTwoWindows extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo input window");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new MovieInputWindow("Add person", stage);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();

    private final ListView<Person> lvwPersons = new ListView<>();

    private MovieInputWindow personWindow;

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 0);
        GridPane.setValignment(lblPersons, VPos.TOP);

        pane.add(lvwPersons, 0, 1);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);

        // add a button to the pane (at col=4, row=0)
        Button btnAdd = new Button("Add person");
        pane.add(btnAdd, 1, 1);
        GridPane.setMargin(btnAdd, new Insets(10, 10, 0, 10));
        btnAdd.setOnAction(event -> this.addAction());

    }

    // -----------------------------------------------------
    // Button action

    private void addAction() {
        personWindow.showAndWait();

        // wait for the dialog to close ...

        if (personWindow.getActualPerson() != null) {
            ex3.Person person = MovieInputWindow.getActualPerson();
            txfName.setText(person.toString());
        }
    }
}
