package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer product = Calculator.multiply(4, 5);

        assertEquals(20, product);
    }

    @Test
    @DisplayName("multiply a number by zero")
    public void testMultiplicationByZero() {
        final Integer product = Calculator.multiply(0, 5);

        assertEquals(0, product);
    }

    @Test
    @DisplayName("multiply a negative and positive number")
    public void testMultiplicationPosNeg() {
        final Integer product = Calculator.multiply(-10, 5);

        assertEquals(-50, product);
    }
    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationNegNeg() {
        final Integer product = Calculator.multiply(-10, -5);

        assertEquals(50, product);
    }
    
    }
