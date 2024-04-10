package ex2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GuiEx2 extends Application {

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

    private final TextField txfNo = new TextField();
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
        Label lblName = new Label("Number:");
        pane.add(lblName, 0, 1);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
//        TextField txfName = new TextField();
//        txfName = new TextField();
        pane.add(txfNo, 1, 1, 1, 1);
        txfNo.setPrefWidth(60.0);

        // add a button to the pane (at col=1, row=1)
        Button btnInc = new Button("Inc +");
        pane.add(btnInc, 3, 0);
        Button btnDec = new Button("Dec -");
        pane.add(btnDec, 3, 2);

//        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnInc.setOnAction(event -> this.incrementAction());
        btnDec.setOnAction(event -> this.decrementAction());
    }

    private void decrementAction() {
        String stringN = txfNo.getText();
        int number = Integer.parseInt(stringN);
        number -= 1;
        stringN = String.valueOf(number);
        txfNo.setText(stringN);
    }

    private void incrementAction() {
        String stringN = txfNo.getText();
        int number = Integer.parseInt(stringN);
        number += 1;
        stringN = String.valueOf(number);
        txfNo.setText(stringN);
    }

    // -------------------------------------------------------------------------
}
