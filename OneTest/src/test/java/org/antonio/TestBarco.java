package org.antonio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBarco {


    Barco barco1 = new Barco(null, 0);
    Barco barco2 = new Barco(null, 0);

    @Before
    public void setUp(){
        barco1 = new Barco("Thousand Sunny", 5);
        barco2 = new Barco("Red Force", 10);
    }

    @Test
    public void testAgregarTripulante(){

        assertTrue(barco1.agregarTripulante());
        assertEquals(6, barco1.getCapacidad());
    }

    @Test
    public void testAgregarTripulanteMaximo(){

        assertFalse(barco2.agregarTripulante());
        assertEquals(10, barco2.getCapacidad());
    }
}