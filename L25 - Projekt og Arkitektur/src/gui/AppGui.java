package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.css.Size;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import storage.Storage;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class AppGui extends Application {

    private final ListView<Forestilling> lvwForstilling = new ListView<>();
    private final ListView<Kunde> lvwKunde = new ListView<>();
    private final ListView<Plads> lvwPlads = new ListView<>();
    private final TextField txfKundeNavn = new TextField();
    private final TextField txfForstilling = new TextField();
    private final TextField txfKundeMobil = new TextField();
    private final DatePicker dpStart = new DatePicker();
    private final DatePicker dpSlut = new DatePicker();
    private final DatePicker dpBestilling = new DatePicker();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

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
        lvwForstilling.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            dpBestilling.setDayCellFactory(null);

            if (newValue != null) {
                dpBestilling.setValue(newValue.getStartDato());
                tilpasFarverForForestilling(newValue);
            }
        });

        lvwKunde.setPrefSize(200, 200);
        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder, 1, 0);
        pane.add(lvwKunde, 1, 1);

        lvwPlads.setPrefSize(200, 200);
        Label lblPlads = new Label("Pladser");
        pane.add(lblPlads, 2, 0);
        pane.add(lvwPlads, 2, 1);
        lvwPlads.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        VBox forstillinger = new VBox();
        forstillinger.setSpacing(10);
        txfForstilling.setPromptText("Forestillingens Navn");
        dpStart.setPromptText("Start Dato");
        dpSlut.setPromptText("Slut Dato");
        Button btnOpretForstilling = new Button("Opret Forestilling");
        btnOpretForstilling.setOnAction(event -> opretForstillingAction());
        forstillinger.getChildren().addAll(txfForstilling, dpStart, dpSlut, btnOpretForstilling);
        pane.add(forstillinger, 0, 2);
        dpStart.setConverter(new StringConverter<LocalDate>() {
            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        });
        dpSlut.setConverter(new StringConverter<LocalDate>() {
            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        });


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
        dpBestilling.setPromptText("Dato");
        dpBestilling.setEditable(false);
        dpBestilling.setConverter(new StringConverter<LocalDate>() {
            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        });

        Button btnOpretBestilling = new Button("Opret Bestilling");
        btnOpretBestilling.setOnAction(event -> opretBestillingAction());
        pladser.getChildren().addAll(dpBestilling, btnOpretBestilling);
        pane.add(pladser, 2, 2);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void opretKundeAction() {
        String navn = txfKundeNavn.getText();
        String mobil = txfKundeMobil.getText();
        if (!mobil.matches("\\d{8}") || navn.isEmpty() || !navn.matches("[a-zA-Z]+")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fejl");
            alert.setHeaderText(null);
            if (navn.isEmpty()) {
                alert.setContentText("Navn må ikke være tomt.");
            } if (!navn.matches("[a-zA-Z]+")) {
                alert.setContentText("Navn må ikke indholde tal.");
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

    public void opretForstillingAction() {
        String navn = txfForstilling.getText();
        LocalDate startDato = dpStart.getValue();
        LocalDate slutDato = dpSlut.getValue();

        if (navn.isEmpty() || startDato == null || slutDato == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fejl");
            alert.setHeaderText(null);
            if (navn.isEmpty()) {
                alert.setContentText("Forstillingen skal have et navn.");
            } else {
                alert.setContentText("Du skal taste start og slut dato.");
            }
            alert.showAndWait();
        } else if (startDato.isBefore(slutDato)) {
            Controller.opretForestilling(navn, startDato, slutDato);
            opdaterForstillinger();
            txfForstilling.clear();
            dpStart.getEditor().clear();
            dpStart.setValue(null);
            dpSlut.getEditor().clear();
            dpSlut.setValue(null);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fejl");
            alert.setHeaderText(null);
            alert.setContentText("Din start dato skal være før slut datoen.");
            alert.showAndWait();
        }
    }

    private void opdaterForstillinger() {
        lvwForstilling.getItems().setAll(Controller.getForestillinger());
    }

    private void opdaterKunder() {
        lvwKunde.getItems().setAll(Controller.getKunder());
    }

    private void opdaterPladser() {
        lvwPlads.getItems().setAll(Controller.getPladser());
    }

    public void opretBestillingAction() {
        Forestilling forestilling = lvwForstilling.getSelectionModel().getSelectedItem();
        Kunde kunde = lvwKunde.getSelectionModel().getSelectedItem();
        LocalDate valgteDato = dpBestilling.getValue();
        ArrayList<Plads> valgtePladser = new ArrayList<>(lvwPlads.getSelectionModel().getSelectedItems());

        if (forestilling == null || kunde == null || valgteDato == null || valgtePladser.isEmpty()) {
        } else {
            boolean allePladserLedige = true;
            for (Plads plads : valgtePladser) {
                if (!forestilling.erPladsLedig(plads.getRække(), plads.getNr(), valgteDato)) {
                    allePladserLedige = false;
                }
            }
            if (!allePladserLedige) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fejl");
                alert.setHeaderText(null);
                alert.setContentText("En eller flere af de valgte pladser er allerede reserveret.");
                alert.showAndWait();
            } else {
                Bestilling bestilling = Controller.opretBestillingMedPladser(forestilling, kunde, valgteDato, valgtePladser);
                Controller.tilføjKundeTilBestilling(bestilling, kunde);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Bestilling godkendt.");
                alert.setHeaderText(null);
                alert.setContentText(kunde.toString() + " har nu reserveret " + valgtePladser.size() + " pladser til " + " den "
                        + valgteDato.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        + "\nDu har reserveret følgdende pladser til forstillingen\n"
                        + bestilling.toString());
                alert.showAndWait();
            }
        }
    }

    private void tilpasFarverForForestilling(Forestilling forestilling) {
        dpBestilling.setDayCellFactory(new Callback<DatePicker, DateCell>() {
            @Override
            public DateCell call(DatePicker param) {
                return new DateCell() {
                    @Override
                    public void updateItem(LocalDate item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            LocalDate startDato = forestilling.getStartDato();
                            LocalDate slutDato = forestilling.getSlutDato();
                            if ((startDato != null && item.isEqual(startDato)) || (slutDato != null && item.isEqual(slutDato)) || (item.isAfter(startDato) && item.isBefore(slutDato))) {
                                setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(0), Insets.EMPTY)));
                            }
                        }
                    }
                };
            }
        }
        );
    }
}