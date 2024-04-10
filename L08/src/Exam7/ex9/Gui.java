package Exam7.ex9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
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
        pane.setPrefSize(200, 200);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        int y1 = 80; // start point: (x,y1)
        int y2 = 160; // end point: (x,y2)
        double index = 0.0;
        /*
    for (double x = 180; i >= 5;) {
            x = 10.0 + 8.0 * 0.25;
            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);
            x++;
        }

         */
    }
}
