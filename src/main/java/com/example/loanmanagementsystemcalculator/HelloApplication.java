package com.example.loanmanagementsystemcalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("loginPanel.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root);
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> {
            event.consume();
            exitCalculator(stage);
        });

    }

    private void exitCalculator(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Za chwilę zamkniesz okno systemu.");
        alert.setContentText("Czy na pewno chcesz zamknąć kalkulator?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("Pomyślnie zamknięto okno!");
            stage.close();
        }
    }




    public static void main(String[] args) {
        launch();
    }




}