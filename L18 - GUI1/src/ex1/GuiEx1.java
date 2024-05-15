package ex1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GuiEx1 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("GUI Opg. 1");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfName1 = new TextField();
    private final TextField txfName2 = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblName1 = new Label("Last name:");
        pane.add(lblName1, 1, 0);

        Label lblName2 = new Label("Full name:");
        pane.add(lblName2, 0, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
//        TextField txfName = new TextField();
//        txfName = new TextField();
        pane.add(txfName, 0, 1, 1, 1);
        pane.add(txfName1, 1, 1, 1,1);
        pane.add(txfName2, 0, 3, 2, 1);
        txfName2.setEditable(false);
        txfName2.setFocusTraversable(false);


        // add a button to the pane (at col=1, row=1)
        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 1, 4);
//        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnCombine.setOnAction(event -> this.combineAction());
    }

    // -------------------------------------------------------------------------

    private void combineAction() {
        String name = txfName.getText().trim();
        String lastName = txfName1.getText().trim();
        txfName2.setText(txfName.getText() + " " + txfName1.getText());
    }
}
