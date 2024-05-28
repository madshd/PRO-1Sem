package SemesterproeveJun2023.gui;

import SemesterproeveJun2023.application.controller.Controller;
import SemesterproeveJun2023.application.model.Bane;
import SemesterproeveJun2023.application.model.Spiller;
import SemesterproeveJun2023.storage.Storage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.Callable;

public class Gui extends Application {
    @Override
    public void start(Stage stage) {
        App.initStorage();
        stage.setTitle("ListView Demo2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private ListView lvwBaner = new ListView<>();
    private ListView lvwSpillere = new ListView();
    private TextField txfDato = new TextField();
    private TextField txfTid = new TextField();
    private TextArea txaAntalBookingsBane = new TextArea();
    private TextArea txaSpillerBookings = new TextArea();
    private CheckBox cbxSingle = new CheckBox("Single");

    private void initContent(GridPane pane) {
        updateContent();
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(true);
        Label lblBaner = new Label("Baner");
        pane.add(lblBaner, 0, 0);
        pane.add(lvwBaner, 0, 1);

        Label lblSpillere = new Label("Spillere");
        pane.add(lblSpillere, 1, 0);
        pane.add(lvwSpillere, 1, 1);

        Label lblSpillerBookings = new Label("Spillerens bookinger");
        pane.add(lblSpillerBookings, 2, 0);
        pane.add(txaSpillerBookings, 2, 1);

        Label lblAntalBookingsBane = new Label("Antal bookinger på banen");
        pane.add(lblAntalBookingsBane, 0, 3);
        pane.add(txaAntalBookingsBane, 0, 4);


        Label lblOpretBooking = new Label("Opret booking:");
        pane.add(lblOpretBooking, 2, 3);
        GridPane pane1 = new GridPane();
        pane.add(pane1, 2, 4);
        pane1.setPadding(new Insets(20));
        pane1.setHgap(20);
        pane1.setVgap(10);
        pane1.add(txfDato, 0, 0);
        txfDato.setPromptText("Dato");

        pane1.add(txfTid, 1, 0);
        txfTid.setPromptText("Tid");
        pane1.add(cbxSingle, 0, 1);
        Button btnBookBane = new Button("Book bane til spiller");
        pane1.add(btnBookBane, 0, 2);
        btnBookBane.setOnAction(event -> this.bookBaneAction());
    }

    public void bookBaneAction() {
        Spiller spiller = (Spiller) lvwSpillere.getSelectionModel().getSelectedItem();
        Bane bane = (Bane) lvwBaner.getSelectionModel().getSelectedItem();
        LocalDate dato = LocalDate.parse(txfDato.getText());
        LocalTime tid = LocalTime.parse(txfTid.getText());
        if (cbxSingle.isSelected()) {
            Controller.createBooking(dato, tid, false, spiller, bane);
        }
    }

    public void updateContent() {
        lvwBaner.getItems().addAll(Storage.getBaner());
        lvwSpillere.getItems().addAll(Storage.getSpillere());
        txaSpillerBookings.setText("Ikke mere tid");
    }
}
