package Exam7.ex10;

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

    private void drawShapes(Pane pane) {
        drawRing(pane, 50, 50);
        drawRing(pane, 150, 50);
        drawRing(pane, 50, 150);
        drawRing(pane, 150, 150);
    }

    private void drawRing(Pane pane, int x, int y) {
        Circle circle = new Circle();
        circle.setCenterX(y);
        circle.setCenterY(x);
        circle.setRadius(30.0f);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.GOLD);

        Circle circleInner = new Circle();
        circleInner.setCenterX(y);
        circleInner.setCenterY(x);
        circleInner.setRadius(20.0f);
        circleInner.setStroke(Color.BLACK);
        circleInner.setFill(Color.WHITE);

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(y);
        ellipse.setCenterY(x);


        pane.getChildren().addAll(circle, circleInner);
    }
}
