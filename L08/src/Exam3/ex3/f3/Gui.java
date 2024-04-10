package Exam3.ex3.f3;

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

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        int x1 = 80; // start point: (x1,y1)
        int x2 = 120;
        int y1 = 20;
        int y2 = 20;
        while (y1 <= 180) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            y1 += 40;
            y2 += 40;
            x1 -= 20;
            x2 += 20;
        }
    }
}

