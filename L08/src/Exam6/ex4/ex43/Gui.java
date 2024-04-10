package Exam6.ex4.ex43;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
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
/*
will draw an ellipse with center at (100,100) and x-radius 80 and y-radius 25. The ellipse’s
perimeter is colored black, and the interior of the ellipse is colored light-sky-blue.
 */
    private void drawShapes(Pane pane) {
        int x = 50; // center: (x,y)
        int y = 100;
        int r = 20; // radius: r
        while (r <= 90) {
            Ellipse ellipse = new Ellipse(200, 200, x, y);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(null);
            pane.getChildren().add(ellipse);
            x += 20;
//            y -= 100;
            r += 10;
        }
    }
}
