package com.example.loanmanagementsystemcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Authorization {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;


    @FXML
    private void login(ActionEvent event) throws IOException {

        try (Scanner scan = new Scanner(new File("./src/Users/users.txt"))){
            while (scan.hasNextLine()) {
                String user = scan.nextLine();
                Scanner scanner = new Scanner(user).useDelimiter(";");
                if (txtUserName.getText().equals(scanner.next()) && txtPassword.getText().equals(scanner.next())) {
                    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.setTitle("Loan Management System ");
                    stage.show();
                } else {
                    lblStatus.setText("Error");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
