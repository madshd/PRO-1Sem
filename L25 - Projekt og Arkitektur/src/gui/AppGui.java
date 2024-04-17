package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppGui extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Teater Bestillinger");
        BorderPane pane = new BorderPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private void initContent(BorderPane pane) {
        TabPane tabPane = new TabPane();
//        this.initTabPane(tabPane);
        pane.setCenter(tabPane);
    }
}