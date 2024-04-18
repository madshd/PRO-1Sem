package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.css.Size;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import storage.Storage;

import javax.swing.event.ChangeListener;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class AppGui extends Application {

    private final ListView<Forestilling> lvwForstilling = new ListView<>();
    private final ListView<Kunde> lvwKunde = new ListView<>();
    private final ListView<Plads> lvwPlads = new ListView<>();
    private final TextField txfDato = new TextField();
    private final TextField txfKundeNavn = new TextField();
    private final TextField txfForstilling = new TextField();
    private final TextField txfKundeMobil = new TextField();
    private final ScrollPane spKunde = new ScrollPane();
    private final ScrollPane spPlads = new ScrollPane();
    private final ScrollPane spForstilling = new ScrollPane();
    private final DatePicker dpStart = new DatePicker();
    private final DatePicker dpSlut = new DatePicker();


    @Override
    public void start(Stage stage) {
        stage.setTitle("Teater Bestillinger");

        opdaterForstillinger();
        opdaterKunder();
        opdaterPladser();

        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
        pane.setGridLinesVisible(false);

        lvwForstilling.setPrefSize(200, 200);
        Label lblForstillinger = new Label("Forestillinger");
        pane.add(lblForstillinger, 0, 0);
        pane.add(lvwForstilling, 0, 1);

        lvwKunde.setPrefSize(200, 200);
        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder, 1, 0);
        pane.add(lvwKunde, 1, 1);

        lvwPlads.setPrefSize(200, 200);
        Label lblPlads = new Label("Pladser");
        pane.add(lblPlads, 2, 0);
        pane.add(lvwPlads, 2, 1);

        VBox forstillinger = new VBox();
        forstillinger.setSpacing(10);
        txfForstilling.setPromptText("Forestillingens Navn");
        dpStart.setPromptText("Start Dato");
        dpSlut.setPromptText("Slut Dato");
        Button btnOpretForstilling = new Button("Opret Forestilling");
        btnOpretForstilling.setOnAction(event -> opretForstillingAction());
        forstillinger.getChildren().addAll(txfForstilling, dpStart, dpSlut, btnOpretForstilling);
        pane.add(forstillinger, 0, 2);

        VBox kunder = new VBox();
        kunder.setSpacing(10);
        txfKundeNavn.setPromptText("Kundens Navn");
        txfKundeMobil.setPromptText("Kundens Mobil");
        Button btnOpretKunde = new Button("Opret Kunde");
        btnOpretKunde.setOnAction(event -> opretKundeAction());
        kunder.getChildren().addAll(txfKundeNavn, txfKundeMobil, btnOpretKunde);
        pane.add(kunder, 1, 2);

        VBox pladser = new VBox();
        pladser.setSpacing(10);
        txfDato.setPromptText("YYYY-MM-DD");
        Button btnOpretBestilling = new Button("Opret Bestilling");
    btnOpretBestilling.setOnAction(event -> opretBestillingAction());
        pladser.getChildren().addAll(txfDato, btnOpretBestilling);
        pane.add(pladser, 2, 2);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void opretKundeAction() {
        String navn = txfKundeNavn.getText();
        String mobil = txfKundeMobil.getText();
        // TODO der mangler if og else sætninger
        if (!mobil.matches("\\d{8}") || navn.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fejl");
            alert.setHeaderText(null);
            if (navn.isEmpty()) {
                alert.setContentText("Navn må ikke være tomt.");
            } else {
                alert.setContentText("Telefonnummeret skal være 8 cifre.");
            }
            alert.showAndWait();
        } else {
            Controller.opretKunde(navn, mobil);
            opdaterKunder();
            txfKundeMobil.clear();
            txfKundeNavn.clear();
        }
    }
    // TODO der mangler if og else sætninger
    public void opretForstillingAction() {
        String navn = txfForstilling.getText();
        LocalDate startDato = dpStart.getValue();
        LocalDate slutDato = dpSlut.getValue();
        Controller.opretForestilling(navn, startDato, slutDato);
        opdaterForstillinger();
        txfForstilling.clear();
        dpStart.getEditor().clear();
        dpStart.setValue(null);
        dpSlut.getEditor().clear();
        dpSlut.setValue(null);
    }

    public void opretBestillingAction() {
        Forestilling forestilling = lvwForstilling.getSelectionModel().getSelectedItem();
        Kunde kunde = lvwKunde.getSelectionModel().getSelectedItem();
        LocalDate valgteDato = LocalDate.parse(txfDato.getText());
        if (valgteDato.isAfter(forestilling.getStartDato()) && valgteDato.isBefore(forestilling.getSlutDato())) {
            Controller.opretBestilling(valgteDato, forestilling, kunde);
        }
    }

    private void opdaterForstillinger() {
        lvwForstilling.getItems().setAll(Controller.hentForestillinger());
    }

    private void opdaterKunder() {
        lvwKunde.getItems().setAll(Controller.hentKunder());
    }

    private void opdaterPladser() {
        lvwPlads.getItems().setAll(Controller.hentPladser());
    }
}