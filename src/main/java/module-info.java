module com.example.loanmanagementsystemcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.loanmanagementsystemcalculator to javafx.fxml;
    exports com.example.loanmanagementsystemcalculator;
}