package se.ecutb;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    final ArrayList<Double> numbers = new ArrayList<>();

    @Test
    void addition() {
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        assertEquals(Calculator.addition(numbers), 6.0);
    }

    @Test
    void subtraction() {
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        assertEquals(Calculator.subtraction(numbers), -4.0);
    }

    @Test
    void multiplication() {
        numbers.add(2.0);
        numbers.add(2.0);
        numbers.add(3.0);
        assertEquals(Calculator.multiplication(numbers), 12.0);
    }

    @Test
    void division() {
        numbers.add(8.0);
        numbers.add(2.0);
        numbers.add(2.0);
        assertEquals(Calculator.division(numbers), 2.0);
    }
}