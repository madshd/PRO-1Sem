package ex3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class MovieInputWindow extends Stage {

    public MovieInputWindow(String title, Stage owner) {
        this.persons = persons;
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox chkbzSenior = new CheckBox();
    private ArrayList<Person> persons = new ArrayList<Person>();
    private final ListView<Person> lvwPersons = new ListView<>();
    private Movie actualMovie = null;
    private static Person actualPerson = null;

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name: ");
        pane.add(lblName, 0, 0);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);
        Label lblSenior = new Label("Senior");
        pane.add(chkbzSenior, 1,3);

        HBox senior = new HBox(chkbzSenior, lblSenior);
        pane.add(senior, 1,3);
        pane.add(txfName, 1, 0);

        pane.add(txfTitle, 1, 1);

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 2, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction());
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void cancelAction() {
        txfTitle.clear();
        txfTitle.requestFocus();
        txfName.clear();
        actualMovie = null;
        MovieInputWindow.this.hide();
    }

    private void okAction() {
        String title = txfTitle.getText().trim();
        String actor = txfName.getText().trim();

        if (title.length() > 0 && actor.length() > 0) {
            boolean isOld = chkbzSenior.isSelected();
            persons.add(new Person(txfName.getText().trim(), txfTitle.getText(), isOld));
            lvwPersons.getItems().setAll(persons);
            txfTitle.clear();
            txfName.clear();
            txfTitle.requestFocus();
            MovieInputWindow.this.hide();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Create movie");
            alert.setHeaderText("Information missing");
            alert.setContentText("Type title and actor");
            alert.show();
        }
    }

    // -------------------------------------------------------------------------

    public static Person getActualPerson() {
        return actualPerson;
    }

    public void clearActualMovie() {
        actualMovie = null;
    }
}
