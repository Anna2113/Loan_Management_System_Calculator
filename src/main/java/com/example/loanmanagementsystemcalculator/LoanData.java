package com.example.loanmanagementsystemcalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class LoanData extends HelloController {


    public double rate(double xd1){
        return xd1;
    }

    public int year(int xd2) {
        return xd2;
    }

    public double loan(double xd3){
        return xd3;
    }


    public double countMonthlyPayment(double rate, int year, double loan){
        double op = rate / 1200;
        double monthlyPayment = loan * op / (1 - 1/Math.pow(1 + op, year * 12));

        return monthlyPayment;
    }

    public double countTotalPayment(double rate, int year, double loan){
        double monthlyRate = countMonthlyPayment(rate, year, loan);

        double totalPayment = monthlyRate * year * 12;

        return totalPayment;
    }

    public LocalDate date(){
        LocalDate date = LocalDate.now();
        return date;
    }

    public String dayOfWeek(){
        DayOfWeek date = LocalDate.now().getDayOfWeek();
        String day = date.getDisplayName(TextStyle.FULL, Locale.getDefault());
        return day;
    }

    public String time(){
        LocalTime time = LocalTime.now();
        String czas = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return czas;
    }



    public String showReceipt(double xd1, int xd2, double xd3){

        double function1 = countMonthlyPayment(xd1,xd2,xd3);
        String newMonthlyRate = String.format("%.2f", function1);

        double function2 = countTotalPayment(xd1,xd2,xd3);
        String newTotalPayment = String.format("%.2f", function2);

        int idNumber = 1325 + (int) (Math.random() * 4238);
        String reacipt = "\t Loan Management System \n" +
                "Numer identyfikacyjny: \t\t\t" + idNumber +
                "\n=====================================\t " +
                "\nOprocentowanie pozyczki:\t " + xd1 + "%"+
                "\nOkres splaty pozyczki:\t " + xd2 +
                "\nKwota do splaty:\t\t\t " + xd3 + " PLN" +
                "\nOplata miesieczna: \t\t " + newMonthlyRate  + " PLN"+
                "\nOplata calkowita: \t\t" + newTotalPayment + " PLN" +

                "\n=====================================\t " +
                "\nDzien tygodnia: " + dayOfWeek() +
                "\nData: " + date() +
                "\t\tCzas: " + time();

        return reacipt;
    }

    public double returnMonthlyPayment(){
        double xd1 = 0.0;
        double xd3 = 0.0;
        int xd2 = 0;
        double rate = rate(xd1);
        int year = year(xd2);
        double loan = loan(xd3);
        double monthlyPayment = countMonthlyPayment(rate, year, loan);

        return monthlyPayment;
    }

    public double retrunTotalPayment(){
        double xd1 = 0.0;
        double xd3 = 0.0;
        int xd2 = 0;
        double rate = rate(xd1);
        int year = year(xd2);
        double loan = loan(xd3);
        double totalPayment = countMonthlyPayment(rate, year, loan);

        return totalPayment;
    }

    public String clearRate(String rate ){
        rate = "";
        return rate;
    }

    public String clearYear(String year){
        year = "";
        return year;
    }

    public String clearLoan(String loan){
        loan = "";
        return loan;
    }

    public String clearMonthlyPayment(String monPay){

        double monthlyPayment = returnMonthlyPayment();
        String monPay1 = String.valueOf(monthlyPayment);
        monPay1 = "";
        return monPay1;
    }

    public String clearTotalPayment(String totPay){
        double totalPayment = retrunTotalPayment();
        String totPay1 = String.valueOf(totalPayment);
        totPay1 = "";
        return totPay1;
    }

    public String clearReceipt(){
       String clearReceipt = "";
       return clearReceipt;
    }

}
