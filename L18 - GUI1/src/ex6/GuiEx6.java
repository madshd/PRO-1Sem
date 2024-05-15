package ex6;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ex6.Student;
import javax.swing.*;

public class GuiEx6 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Name list");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    // -------------------------------------------------------------------------

    private final TextArea txaStudentInfo = new TextArea();
    private final TextField txfName = new TextField();
    private final TextField txfAge = new TextField();
    private final CheckBox chbkzActive = new CheckBox();

    private Student student = new Student();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(true);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(10);
//        pane.setMaxSize(300,400);

        Label lblStudentInfo = new Label("Student info:");
        pane.add(lblStudentInfo, 0,0,1,1);
        pane.add(txaStudentInfo, 0,1, 2,1);
        txaStudentInfo.setFocusTraversable(false);
        txaStudentInfo.setMouseTransparent(true);

        GridPane.setHalignment(txaStudentInfo, HPos.CENTER);
        GridPane.setValignment(txaStudentInfo, VPos.CENTER);
        txaStudentInfo.setMaxWidth(350);

        Label lblName = new Label("Name: ");
        pane.add(lblName, 0,2);
        pane.add(txfName, 1,2);

        Label lblAge = new Label("Age: ");
        pane.add(lblAge,0,3);
        pane.add(txfAge, 1,3, 1,1);
        txfAge.setPrefWidth(85);

        Button btnInc = new Button("Inc");
        pane.add(btnInc, 2,3);
        btnInc.setOnAction(event -> this.incAction()); // Set action for the Inc button

        Button btnReset = new Button("Reset");
        pane.add(btnReset, 3,3);
        btnReset.setOnAction(event -> this.resetAction()); // Set action for the Reset button

        Label lblActive = new Label("Active:");
        pane.add(lblActive,0,4);
        pane.add(chbkzActive, 1,4);

        Button btnCreate = new Button("Create");
        pane.add(btnCreate, 1,6);
        GridPane.setHalignment(btnCreate, HPos.LEFT);
        btnCreate.setOnAction(event -> this.createAction());
    

        Button btnUpdate = new Button("Update");
        pane.add(btnUpdate, 1,6);
        GridPane.setHalignment(btnUpdate, HPos.CENTER);
        btnUpdate.setOnAction(event -> this.updateAction());

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 1, 6);
        GridPane.setHalignment(btnDelete, HPos.RIGHT);
        btnDelete.setOnAction(event -> this.deleteAction());
//        col 0, 1, 2 row 6
    }

    private void resetAction() {
        int initialAge = Integer.parseInt(txfAge.getText());
    }

    private void incAction() {
        txfAge.setText(txfAge.getText());
        int age = student.getAge(); // Get the current age from the Student object
        age += 1; // Increment the age by 1
        student.setAge(age); // Update the age in the Student object
        txfAge.setText(String.valueOf(age)); // Update the TextField to display the new age
    }


    private void createAction() {
        int age = Integer.parseInt(txfAge.getText());
        student.setName(txfName.getText());
        student.setAge(age);

        boolean active = chbkzActive.isSelected(); // Get checkbox status
        student.setActive(active);

        txaStudentInfo.appendText(student.toString());

        txfName.clear();
        txfAge.clear();
        chbkzActive.setSelected(false);
    }
    private void deleteAction() {
        txaStudentInfo.clear();
    }

    private void updateAction() {
        txaStudentInfo.clear();
        txfName.setText(student.getName());
        txfAge.setText(String.valueOf(student.getAge()));

        student.setName(txfName.getText());
        student.setAge(Integer.parseInt(txfAge.getText()));
        txaStudentInfo.appendText(student.toString());
    }
}
