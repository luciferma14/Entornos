package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertEquals(3, result);
        assertNotEquals(5, result);
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);

        assertEquals(-1, result);
        assertNotEquals(3, result);
    }

    @Test
    public void testMultily(){
        Calculator calculator = new Calculator();
        float result = calculator.multiply(2, 3);

        assertEquals(6, result, 0.01);
        assertNotEquals(3, result, 0.01);
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        float result = calculator.divide(4,2);

        assertEquals(2, (float)result, 0.01);
        assertNotEquals(5, (float)result, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        Calculator calculator = new Calculator();   
        calculator.divide(4, 0);
    }
}
