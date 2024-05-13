package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestFruta {

    Fruta fruta1 = new Fruta (null, false);
    Fruta fruta2 = new Fruta (null, false);

    @Before
    public void setUp(){
        fruta1 = new Fruta("Gomu Gomu", true);
        fruta2 = new Fruta("Fruta del Diablo", false);
    }

    @Test
    public void testPuedoComerFrutaDeliciosa(){
        assertTrue(fruta1.puedoComer());
    }

    @Test
    public void testPuedoComerFrutaDelDiablo(){
        assertFalse(fruta2.puedoComer());
    }

    @Test
    public void testPuedoComerFrutaNoDeliciosa(){
        assertFalse(fruta2.puedoComer());
    }
}
