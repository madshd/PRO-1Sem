package Exam7.ex7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();

    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        String str = "Datamatiker";
        int x = 20;
        int y = 50;
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            String substring = str.substring(0, i + 1);
            Text text = new Text(x, y, substring);
            text.setFill(Color.BLACK);
            pane.getChildren().add(text);
            y += 20;
        }
    }
}
