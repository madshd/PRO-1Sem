package ex5;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.lang.reflect.Array;
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
    private final ListView<Person> lvwNames = new ListView<>();
    private final ArrayList<Person> boys = new ArrayList<>();
    private final ArrayList<Person> girls = new ArrayList<>();
    private final ToggleGroup group = new ToggleGroup();
    private final RadioButton rbBoys = new RadioButton();
    private final RadioButton rbGirls = new RadioButton();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        HBox box = new HBox();
        pane.add(box, 1, 0);

//        RadioButton rbBoys = new RadioButton();
        box.getChildren().add(rbBoys);
        rbBoys.setText("Boys");
        rbBoys.setPrefWidth(70);
        // ensure that only one radio button is in selected state
//        rbBoys.setToggleGroup(group);
        // set the method to execute when a radio button is selected
        rbBoys.setOnAction(event -> this.addAction());

        rbBoys.setSelected(true);

//        Radiobutton for girls
//        RadioButton rbGirls = new RadioButton();
        box.getChildren().add(rbGirls);
        rbGirls.setText("Girls");
        rbGirls.setPrefWidth(70);
        // ensure that only one radio button is in selected state
//        rbGirls.setToggleGroup(group);
        // set the method to execute when a radio button is selected
        rbGirls.setOnAction(event -> this.addAction());
        // the rest

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 2);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 1);
        GridPane.setValignment(lblNames, VPos.TOP);

        pane.add(txfName, 1, 2);

        pane.add(lvwNames, 1, 1);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.getItems().addAll(boys);

        lvwNames.getSelectionModel().selectedItemProperty().addListener((ov, o, n) -> this.addAction());

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 3, 2);
        btnAdd.setOnAction(event -> this.addAction());

    }

    private void addAction() {
        String name = txfName.getText().trim();
        if (!name.isEmpty() && rbBoys.isSelected()) {
//            String boyName = txfName.getText().trim();
            Person b = new Person(name);
            boys.add(b);
            lvwNames.getItems().add(b); // Add the new person to the list directly
        }
        if (!name.isEmpty() && rbGirls.isSelected()) {
//            String girlName = txfName.getText().trim();
            Person g = new Person(name);
            girls.add(g);
            lvwNames.getItems().add(g);
        }
        else if (name.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add person");
            alert.setHeaderText("No name typed");
            alert.setContentText("Type the name of the person");
            alert.showAndWait();
        }
    }
}
