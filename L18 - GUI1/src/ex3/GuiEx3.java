package ex3;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GuiEx3 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Invest Calculator");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfInvest = new TextField();

    private final TextField txfYears = new TextField();

    private final TextField txfInt = new TextField();

    private final TextField txfFuVal = new TextField();
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblInvest = new Label("Investment: ");
        pane.add(lblInvest, 0, 0);
        pane.add(txfInvest, 1, 0, 1, 1);
        
        Label lblYears = new Label("Years: ");
        pane.add(lblYears,0,1);
        pane.add(txfYears, 1, 1, 1, 1);
        
        Label lblInt = new Label("Interest %: ");
        pane.add(lblInt, 0, 2);
        pane.add(txfInt, 1, 2, 1, 1);

        Button btnCalc = new Button("Calculate");
        GridPane.setHalignment(btnCalc, HPos.CENTER);
        GridPane.setValignment(btnCalc, VPos.CENTER);
        pane.add(btnCalc, 1, 3);

        Label lblFuVal = new Label("Future value: ");
        pane.add(lblFuVal, 0, 4);
        pane.add(txfFuVal, 1, 4, 1, 1);
        txfFuVal.setFocusTraversable(false);
        txfFuVal.setMouseTransparent(true);

        // add a button to the pane (at col=1, row=1)

        btnCalc.setOnAction(event -> this.calcAction());
        btnCalc.setDefaultButton(true);
//        btnCalc
    }

    private void calcAction() {
        int investmentAmount = Integer.parseInt(txfInvest.getText());
        int yearsAmount = Integer.parseInt(txfYears.getText());
        double interest = Double.parseDouble(txfInt.getText());
        double returnAmount = investmentAmount * Math.pow(1 + interest / 100, yearsAmount);

        txfFuVal.setText(String.valueOf(returnAmount));
    }
}
