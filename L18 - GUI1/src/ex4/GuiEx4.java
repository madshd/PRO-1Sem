package ex4;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class GuiEx4 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Temperature converter");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfCelcius = new TextField();

    private final TextField txfFahrenheit = new TextField();


    private final TextField txfConv = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblCelcius = new Label("Celcius");
        pane.add(lblCelcius, 0, 0);
        pane.add(txfCelcius, 1, 0, 1, 1);

        Button btnCelc = new Button("To C°");
        GridPane.setHalignment(btnCelc, HPos.CENTER);
        GridPane.setValignment(btnCelc, VPos.CENTER);
        pane.add(btnCelc, 2, 1);

        Label lblFahrenheit = new Label("Fahrenheit: ");
        pane.add(lblFahrenheit,0,1);
        pane.add(txfFahrenheit, 1, 1, 1, 1);

        Button btnFahr = new Button("To F°");
        GridPane.setHalignment(btnFahr, HPos.CENTER);
        GridPane.setValignment(btnFahr, VPos.CENTER);
        pane.add(btnFahr, 2, 0);


        Label lblConv = new Label("Converted value: ");
        pane.add(lblConv, 0, 4);
        pane.add(txfConv, 1, 4, 1, 1);
        txfConv.setFocusTraversable(false);
        txfConv.setMouseTransparent(true);

        // add a button to the pane (at col=1, row=1)

        btnCelc.setOnAction(event -> this.celciusAction());
        btnCelc.setDefaultButton(true);

        btnFahr.setOnAction(event -> this.fahrAction());
        btnFahr.setDefaultButton(true);

    }

    private void celciusAction() {
        double fahrenheit = Double.parseDouble(txfFahrenheit.getText());
        double fahrToCelc = (fahrenheit - 32) * 9 / 5;
        txfConv.setText(String.valueOf(fahrToCelc));
//        double fahrenheitToCelc = fahrenheit
    }

    private void fahrAction() {
        double celcius = Double.parseDouble(txfCelcius.getText());
        double celcToFahr = celcius * 9 / 5 + 32;
        txfConv.setText(String.valueOf(celcToFahr));


//        int yearsAmount = Integer.parseInt(txfYears.getText());
//        double interest = Double.parseDouble(txfInt.getText());


    }

}
