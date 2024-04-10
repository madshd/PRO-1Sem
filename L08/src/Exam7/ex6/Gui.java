package Exam7.ex6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Line;


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
        int x1 = 5;
        int x2 = 360;
        int y = 375;
//        int y22 = 10;
//      Linjen på x-aksen
        Line line1 = new Line(x1, y, x2, y);

//      Spidsen på x-aksen
        int xh = 360;
        Line ah1 = new Line(xh, y, xh - 10, y - 5);
        Line ah2 = new Line(xh, y, xh - 10, y + 5);

        int y1 = 370; // start point: (x,y1)
        int y2 = 380; // end point: (x,y2)

        int i;
        for (i = 0; i < 11; i++) {
            int x = 10 + i * 32;
            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);

        }
//        de 3 ticks ved hver femte tick
        int y5 = 365;
        int y52 = 385;

//        tick 0
        if (i >= 1) {
            int x = 10;
            Line line5 = new Line(x, y5, x, y52);
            String str = "0";
            Text text = new Text(x, y52 + 10, str);
            text.setFill(Color.BLACK);
            pane.getChildren().addAll(line5, text);
        }
//        tick 5
        if (i >= 1) {
            int x = 170;
            Line line5 = new Line(x, y5, x, y52);
            String str = "5";
            Text text = new Text(x, y52 + 10, str);
            text.setFill(Color.BLACK);
            pane.getChildren().addAll(line5, text);
        }
//        tick 10
        if (i >= 1) {
            int x = 330;
            Line line5 = new Line(x, y5, x, y52);
            String str = "10";
            Text text = new Text(x, y52 + 10, str);
            text.setFill(Color.BLACK);
            pane.getChildren().addAll(line5, text);
            
        }
        pane.getChildren().addAll(line1, ah1, ah2);
    }
}