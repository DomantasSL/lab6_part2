package com.example.simple_calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void Given_Negative_Ints_makePositive_Then_Add_PositiveNumbers(){
        SimpleCalculator calculator = new SimpleCalculator();
        final int fixedIntSum = calculator.Add_Numbers(5,6);
        final int actualResult = calculator.Given_Negative_Ints_makePositive_Then_Add_PositiveNumbers(-5,6);

        assertEquals(fixedIntSum, actualResult);
    }

    @Test
    public void Given_Negative_Ints_makePositive_Then_Multiply_PositiveNumbers(){
        SimpleCalculator calculator = new SimpleCalculator();
        final int fixedIntSum = calculator.Multiply_Numbers(5,6);
        final int actualResult = calculator.Given_Negative_Ints_makePositive_Then_Multiply_PositiveNumbers(-5,6);

        assertEquals(fixedIntSum, actualResult);
    }

    @Test
    public void Check_If_Two_Plus_Two_Is_Four() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.Add_Numbers(2,2));
    }

    @Test
    public void Throw_Exception_If_Multiplied_By_Zero_Test() throws Exception {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.Throw_Exception_If_Multiplied_By_Zero(5,5));
    }

    @Test
    public void  Check_If_Six_Multiplied_By_Five_Is_Thirty() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(30, calculator.Multiply_Numbers(6,5));
    }
    @Test
    public void  Check_If_Five_Minus_Six_Is_Negative_One() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3, calculator.Subtract_Numbers(9,6));
    }

    @Test
    public void Checks_If_Inputs_NotEqual_Null() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.Checks_If_Inputs_Not_Equal_Null(5,3));
    }

}