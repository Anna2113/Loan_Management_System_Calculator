package com.example.loanmanagementsystemcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class HelloController extends HelloApplication {

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonTwo;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label labelFive;

    @FXML
    private Label labelFour;

    @FXML
    private Label labelOne;

    @FXML
    private Label labelThree;

    @FXML
    private Label labelTwo;

    @FXML
    private Pane pane;

    @FXML
    private TextArea textAreaOne;

    @FXML
    private TextField textFieldFive;

    @FXML
    private TextField textFieldFour;

    @FXML
    private TextField textFieldOne;

    @FXML
    private TextField textFieldThree;

    @FXML
    private TextField textFieldTwo;

    @FXML
    private Label titleLabel;


    @FXML
    void countButton(ActionEvent event) {

        LoanData model = new LoanData();
        double xd1 = model.rate(Double.parseDouble(textFieldOne.getText()));
        int xd2 = model.year(Integer.parseInt(textFieldTwo.getText()));
        double xd3 = model.loan(Double.parseDouble(textFieldThree.getText()));

        double payment = model.countMonthlyPayment(xd1, xd2, xd3);
        String imonthlyPayment;
        imonthlyPayment = Double.toString(payment);
        imonthlyPayment = String.format("%.2f", payment);
        textFieldFour.setText(imonthlyPayment + " PLN");

        double total = model.countTotalPayment(xd1, xd2, xd3);
        String itotalPayment;
        itotalPayment = String.format("%.2f", total);
        textFieldFive.setText(itotalPayment + " PLN");
    }


    @FXML
    void generateReceipt(ActionEvent event) {

        LoanData model = new LoanData();

        double xd1 = model.rate(Double.parseDouble(textFieldOne.getText()));
        int xd2 = model.year(Integer.parseInt(textFieldTwo.getText()));
        double xd3 = model.loan(Double.parseDouble(textFieldThree.getText()));

        String receipt = model.showReceipt(xd1, xd2, xd3);
        textAreaOne.setText(receipt);
    }

    @FXML
    private void clearCalculator(ActionEvent event) {

        LoanData model = new LoanData();

        double xd1 = model.rate(Double.parseDouble(textFieldOne.getText()));
        String xdxd1 = String.valueOf(xd1);
        String clearRate = model.clearRate(xdxd1);

        int xd2 = model.year(Integer.parseInt(textFieldTwo.getText()));
        String xdxd2 = String.valueOf(xd2);
        String clearYear = model.clearYear(xdxd2);

        double xd3 = model.loan(Double.parseDouble(textFieldThree.getText()));
        String xdxd3 = String.valueOf(xd3);
        String clearLoan = model.clearLoan(xdxd3);

        Double xd4 = model.returnMonthlyPayment();
        String xdxd4 = String.valueOf(xd4);
        String clearMonPay = model.clearMonthlyPayment(xdxd4);

        double xd5 = model.retrunTotalPayment();
        String xdxd5 = String.valueOf(xd5);
        String clearTotPay = model.clearTotalPayment(xdxd5);

        String clearReceipt = model.clearReceipt();

        textFieldOne.setText(clearRate);
        textFieldTwo.setText(clearYear);
        textFieldThree.setText(clearLoan);
        textFieldFour.setText(clearMonPay);
        textFieldFive.setText(clearTotPay);
        textAreaOne.setText(clearReceipt);

    }

    @FXML
    private void exitCalculator(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Za chwilę zamkniesz okno systemu.");
        alert.setContentText("Czy na pewno chcesz zamknąć kalkulator?");

        if (alert.showAndWait().get() == ButtonType.OK) {

            Stage stage = (Stage) pane.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void save(ActionEvent event) {
        PrintWriter zapis = null;
        int idNumber = 1325 + (int) (Math.random() * 4238);
        try {
            zapis = new PrintWriter("./src/Paragony/receipt " + idNumber + ".txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        zapis.println(textAreaOne.getText());
        zapis.close();
    }

}



