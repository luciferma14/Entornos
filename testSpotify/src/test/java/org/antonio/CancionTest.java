package org.antonio;

import static org.junit.Assert.*;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CancionTest {
    private Cancion cancion;

    @Before
    public void setUp() {
        cancion = new Cancion("Bohemian Rhapsody", "Queen", 355);
    }

    @Test
    public void testGetTitulo(){
        assertEquals("Bohemian Rhapsody", cancion.getTitulo());
        assertNotEquals("CHIHIRO", cancion.getTitulo());
    }

    @Test 
    public void testSetTitulo(){
        cancion.setTitulo("CHIHIRO");
    }

    @Test
    public void testGetArtista(){
        assertEquals("Queen", cancion.getArtista());
        assertNotEquals("Billie Eilish", cancion.getArtista());
    }

    @Test
    public void testSetArtista(){
        cancion.setArtista("Billie Eilish");
    }

    @Test
    public void testGetDuracion(){
        assertEquals(355, cancion.getDuracion());
        assertNotEquals(400, cancion.getDuracion());
    }

    @Test
    public void testSetDuracion(){
        cancion.setDuracion(400);
    }
}