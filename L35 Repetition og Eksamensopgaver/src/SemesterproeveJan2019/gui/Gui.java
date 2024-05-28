package SemesterproeveJan2019.gui;

import SemesterproeveJan2019.application.controller.Controller;
import SemesterproeveJan2019.application.model.Bestilling;
import SemesterproeveJan2019.application.model.Forestilling;
import SemesterproeveJan2019.application.model.Kunde;
import SemesterproeveJan2019.storage.Storage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

public class Gui extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private ListView lvwForestillinger = new ListView<>();
    private ListView lvwKunder = new ListView();
    private TextField txfDato = new TextField();
    private TextField txfKundeNavn = new TextField();
    private TextField txfKundeMobil = new TextField();
    private TextArea txaBestiltePladser = new TextArea();
    private Button btnVisBestiltePladser = new Button("Vis bestilte pladser");
    private Button btnOpretKunde = new Button("Opret kunde");
    private void initContent(GridPane pane) {
        Controller.initStorage();
//        pane.setPrefSize(300,300);
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblForestillinger = new Label("Forestillinger");
        pane.add(lblForestillinger, 0,0);
        pane.add(lvwForestillinger, 0,1);
        lvwForestillinger.getItems().addAll(Storage.getForestillinger());

        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder, 1, 0);
        pane.add(lvwKunder, 1,1);
        lvwKunder.getItems().addAll(Storage.getKunder());

        Label lblDato = new Label("Dato:");
        pane.add(lblDato, 2, 0);
        pane.add(txfDato, 2, 1);
        txfDato.setPrefWidth(5);

        Label lblBestiltePladser = new Label("Bestilte pladser");
        pane.add(lblBestiltePladser, 2,2);
        pane.add(btnVisBestiltePladser, 2,3);
        btnVisBestiltePladser.setOnAction(event -> this.visBestiltePladserAction());
        pane.add(txaBestiltePladser, 2,4);
        txaBestiltePladser.setPrefSize(50,60);
//        lvwKunder.getSelectionModel().selectedItemProperty().addListener((ov, o, n) -> this.valgteKundeBestiltePladser());
        
        Label lblKundeNavn = new Label("Kunde navn:");
        pane.add(lblKundeNavn,1,2);
        pane.add(txfKundeNavn, 1,3);

        Label lblKundeMobil = new Label("Kunde mobil:");
        pane.add(lblKundeMobil, 1,4);
        pane.add(txfKundeMobil, 1,5);
        pane.add(btnOpretKunde, 1,6);

    }

    private void visBestiltePladserAction() {

    }

//    private void valgteKundeBestiltePladser() {
//        Forestilling forestilling = (Forestilling) lvwForestillinger.getSelectionModel().getSelectedItem();
//        Kunde selected = (Kunde) lvwKunder.getSelectionModel().getSelectedItem();
//        LocalDate dato = LocalDate.parse(txfDato.getText());
//        int index = 0;
//        for (Bestilling b : selected.getBestillinger()) {
////            if (selected.getBestillinger().get(b).getDato() == dato) {
//
//            }
////            for (int i = 0; i < ; i++) {
//
//            }
//        }
//    }

}
