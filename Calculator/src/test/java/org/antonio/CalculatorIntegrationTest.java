package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorIntegrationTest {

    @Test
    public void testAddAndSubstract(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);

        result = calculator.subtract(1, 2);

        assertEquals(-1, result);
    }
}
