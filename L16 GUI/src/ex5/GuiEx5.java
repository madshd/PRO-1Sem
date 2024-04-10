package ex5;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GuiEx5 extends Application {

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

    private final TextField txfName = new TextField();

    private final TextArea txaNames = new TextArea();
    
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);
        pane.setMaxSize(300,400);

        Label lblName = new Label("Name: ");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 0, 1, 1, 1);

        pane.add(txaNames, 0, 3, 1, 1);

        Button btnAdd = new Button("Add");
        GridPane.setHalignment(btnAdd, HPos.CENTER);
        GridPane.setValignment(btnAdd, VPos.CENTER);
        pane.add(btnAdd, 0, 2);

        // add a button to the pane (at col=1, row=1)
        
        btnAdd.setOnAction(event -> this.addAction());
        btnAdd.setDefaultButton(true);

    }

    private void addAction() {
        txaNames.appendText(txfName.getText().trim() + "\n");
        txfName.requestFocus();
    }
}
