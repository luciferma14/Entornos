package com.luciferma;

import static org.junit.Assert.*;
import org.junit.Test;

public class EjerciciosTest {

    @Test
    public void testSuma(){
        Ejercicios ej = new Ejercicios();
        assertEquals(5, ej.suma(3,2));
        assertEquals(-5, ej.suma(-3,-2));
        assertEquals(3, ej.suma(0,3));
        assertEquals(6, ej.suma(4,2));
        assertEquals(5, ej.suma(3,2));
        assertNotEquals(8, ej.suma(4,5));
    }



    @Test
    public void testSortArray(){
        Ejercicios ej = new Ejercicios();
        assertArrayEquals(new int [] {1,2,3,4}, ej.sort(new int [] {4,3,2,1}));
        assertArrayEquals(new int [] {-1,0,7}, ej.sort(new int [] {0,7,-1}));
        assertArrayEquals(new int [] {-5,-3,-1}, ej.sort(new int [] {-5,-1,-3})); //negativos
    }

    @Test
    public void testAverage(){
        Ejercicios ej = new Ejercicios();
        assertEquals(2.5, ej.average(new int[] {1,2,3,4}), 0.01);
    }

    @Test
    public void testbinarySearch(){
        Ejercicios ej = new Ejercicios();
        assertTrue(0 <= ej.binarySearch(new int[] {1,2,3,4}, 4));
        assertFalse(-1 <= ej.binarySearch(new int[] {1,2,3,4}, 1));
    }

    @Test
    public void testCelsiusToFahrenheit(){
        Ejercicios ej = new Ejercicios();

    }
}
