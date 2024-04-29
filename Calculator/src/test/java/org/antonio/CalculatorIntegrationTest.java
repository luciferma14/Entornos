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
        
        assertEquals(4.0, calculator.multiply(2, calculator.divide(4, 2)), 0.01);
    
        assertNotEquals(5.0, calculator.multiply(5, calculator.divide(3, 2)), 0.01);
        assertNotEquals(80, calculator.multiply(2, calculator.divide(4, 2)), 0.01);
    }

    @Test
    public void testMultiplyWithZero(){
        Calculator calculator = new Calculator();
        float result = calculator.multiply(5, 0);

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