package Exam6.ex5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.Text;
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
        int length = str.length();
        int index = 0;

        while (index < length) {
            String substring = str.substring(0, index + 1);
            Text text = new Text(x, y, substring);
            text.setFill(Color.BLUEVIOLET);
            pane.getChildren().add(text);
            y += 20;
            index++;
        }
    }
}
