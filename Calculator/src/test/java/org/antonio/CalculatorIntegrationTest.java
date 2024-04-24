package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorIntegrationTest {

    @Test
    public void testAddAndSubstract() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);

        assertEquals(8, result); 
        assertNotEquals(6, result);
        assertNotEquals(2, result);
   }

    @Test
    public void testAddWithZero(){
        Calculator calculator = new Calculator();
        int result = calculator.add(5,0);

        assertEquals(5, result);
        assertNotEquals(8, result);
        assertNotEquals(10, result);
    }

    @Test
    public void testSubstractWithZero(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5,0);

        assertEquals(5, result);
        assertNotEquals(-8, result);
        assertNotEquals(10, result);
    }

    @Test 
    public void testMultilyAndDivide(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 5);
        float result2 = calculator.divide(10, 2);

        assertEquals(20, result, 0.01);
        assertNotEquals(40, result, 0.01);

        assertEquals(5, result2, 0.01);
        assertNotEquals(80, result2, 0.01);
    }

    @Test
    public void testMultiplyWithZero(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 0);

        assertEquals(0, result, 0.01);
        assertNotEquals(10, result, 0.01);
        assertNotEquals(-14, result, 0.01);
    }

    @Test 
    public void testDivideWithZero(){
        Calculator calculator = new Calculator();
        float result = calculator.divide(0, 5);

        assertEquals(0, result, 0.01);
        assertNotEquals(56, result, 0.01);
        assertNotEquals(3, result, 0.01);
    }
}