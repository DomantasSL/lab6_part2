package com.example.simple_calculator;public class SimpleCalculator {

    public int Throw_Exception_If_Multiplied_By_Zero(int numberA, int numberB) throws Exception {
        if(numberB==0) {
            throw new Exception("Inputs did not pass the needs - Number B IS EQUAL TO ZERO");
        }
        else return 1;

    }

    public int Add_Numbers(int numberA, int numberB) {
        return numberA + numberB;
    }

    public int Given_Negative_Ints_makePositive_Then_Add_PositiveNumbers (int numberA, int numberB) {
        if (numberA < 0 || numberB > 0) {
            numberA = numberA*(-1);
            return numberA+numberB;
        }
        if (numberB < 0 || numberA > 0) {
            numberB = numberA*(-1);
            return numberA+numberB;
        }
        if (numberA < 0 || numberB < 0) {
            numberA = numberA*(-1);
            numberB = numberB*(-1);
            return numberA+numberB;
        }
        else
            return 0;
    }

    public int Subtract_Numbers(int numberA, int numberB) {
        return numberA - numberB;
    }

    public int Multiply_Numbers(int numberA, int numberB) {
        return numberA * numberB;
    }

    public int Given_Negative_Ints_makePositive_Then_Multiply_PositiveNumbers (int numberA, int numberB) {
        if (numberA < 0 || numberB > 0) {
            numberA = numberA*(-1);
            return numberA*numberB;
        }
        if (numberB < 0 || numberA > 0) {
            numberB = numberA*(-1);
            return numberA*numberB;
        }
        if (numberA < 0 || numberB < 0) {
            numberA = numberA*(-1);
            numberB = numberB*(-1);
            return numberA*numberB;
        }
        else
            return 0;
    }

    public int Checks_If_Inputs_Not_Equal_Null(int numberA, int numberB) {
        if (numberA == 0 || numberB == 0) {
            return 0;
        } else
            return 1;
    }
}

