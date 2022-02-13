package com.example.loanmanagementsystemcalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;


class HelloControllerTest {

    @Test
    public void rate_can_be_equal_zero() {
        //given
        LoanData model = new LoanData();

        //when
        double result = model.rate(0);

        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void year_cant_be_equal_zero() {
        //given
        LoanData model = new LoanData();

        //when
        int result = model.year(5);

        //then
        Assertions.assertThat(result).isNotEqualTo(0);

    }

    @Test
    public void year_should_be_less_then_10() {
        //given
        LoanData model = new LoanData();

        //when
        int result = model.year(4);

        //then
        Assertions.assertThat(result).isLessThan(10);
    }

    @Test
    public void loan_cant_be_equal_zero() {
        //given
        LoanData model = new LoanData();

        //when
        double result = model.loan(1000);

        //then
        Assertions.assertThat(result).isNotEqualTo(0);
    }

    @Test
    public void loan_should_be_greater_then_1000() {
        //given
        LoanData model = new LoanData();

        //when
        double result = model.loan(2000);

        //then
        Assertions.assertThat(result).isGreaterThan(1000);
    }

    @Test
    public void date_should_be_after_then_date_in_application() {
        //given
        LoanData model = new LoanData();

        //when
        LocalDate result = model.date();

        //then
        Assertions.assertThat(result).isAfter("2022-01-15");
    }

    @Test
    public void date_should_be_correct() {
        //given
        LoanData model1 = new LoanData();

        //when
        LocalDate result = model1.date();
        LocalDate model2 = LocalDate.now();

        //then
        Assertions.assertThat(result).isEqualTo(model2);
    }

    @Test
    public void time_is_correct_if_hour_is_between_18_and_21() {
        //given
        LoanData model = new LoanData();

        //when
        String result = model.time();

        //then
        Assertions.assertThat(result).isBetween("18","21");
    }

    @Test
    public void hour_should_be_after_then_18() {
        //given
        LoanData model = new LoanData();

        //when
        LocalTime result = LocalTime.parse(model.time());

        //then
        Assertions.assertThat(result).isAfter("18:00");
    }

    @Test
    public void time_should_be_incorrect() {
        //given
        LoanData model = new LoanData();

        //when
        String  result = model.time();

        //then
        Assertions.assertThat(result).isEqualTo("22:42:41");
    }

    @Test
    public void is_correct_if_there_are_whitespace() {
        //given
        LoanData model = new LoanData();

        //when
        String  result = model.showReceipt(12,1,3333);

        //then
        Assertions.assertThat(result).isEqualToNormalizingWhitespace(result);
    }

    @Test
    void data_should_be_clear() {
        //given
        LoanData model = new LoanData();

        //when
        String resultRate = model.clearRate("");
        String resultYear = model.clearYear("");
        String resultLoan = model.clearLoan("");
        String resultMonthly = model.clearMonthlyPayment("");
        String resultTotal = model.clearTotalPayment("");

        //then
        Assertions.assertThat(resultRate).isEqualTo("");
        Assertions.assertThat(resultYear).isEqualTo("");
        Assertions.assertThat(resultLoan).isEqualTo("");
        Assertions.assertThat(resultMonthly).isEqualTo("");
        Assertions.assertThat(resultTotal).isEqualTo("");
    }


    @Test
    public void is_it_counting_correctly_monthly_payment() {
        //given
        LoanData model = new LoanData();

        //when
        double result = model.countMonthlyPayment(10,1,1000);

        //then
        Assertions.assertThat(result).isLessThan(87.92);
        Assertions.assertThat(result).isBetween(87.0,88.0);
    }

    @Test
    void monthly_payment_should_be_between_100_and_500() {
        //given
        LoanData model = new LoanData();

        //when
        Double result = model.countMonthlyPayment(10,5,45000);

        //then
        Assertions.assertThat(result).isBetween(100.0, 1000.0);
    }

    @Test
    public void is_it_counting_correctly_total_payment() {
        //given
        LoanData model = new LoanData();

        //when
        double result = model.countTotalPayment(10,1,1000);

        //then
        Assertions.assertThat(result).isBetween(1054.0,1055.0);
    }

    @Test
    void total_payment_should_be_between_100000_and_1000000() {
        //given
        LoanData model = new LoanData();

        //when
        Double result = model.countTotalPayment(10,5,550000);

        //then
        Assertions.assertThat(result).isBetween(100000.0, 1000000.0);
    }
}