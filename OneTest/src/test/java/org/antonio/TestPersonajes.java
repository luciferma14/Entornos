package org.antonio;

import static org.junit.Assert.*;

import org.antonio.Barco;
import org.antonio.Fruta;
import org.antonio.Luffy;
import org.antonio.Zoro;
import org.junit.Before;
import org.junit.Test;

public class TestPersonajes {
    
    Luffy luffy = new Luffy (null, 0);
    Zoro zoro = new Zoro (null, 0);
    Fruta fruta = new Fruta (null, false);
    Barco barco = new Barco(null, 0);

    @Before
    public void setUp(){
        luffy = new Luffy("Luffy", 100);
        zoro = new Zoro("Zoro", 80);
        fruta = new Fruta("Gomu Gomu", true);
        barco = new Barco("Thousand Sunny", 10);
    }

    //-----Getters-----

    @Test
    public void GetNombreTest(){

        assertEquals("Luffy", luffy.getNombre());
        assertEquals("Zoro", zoro.getNombre());
        assertEquals("Gomu Gomu", fruta.getNombre());
        assertEquals("Thousand Sunny", barco.getNombre());
        assertNotEquals("Ope Ope", fruta.getNombre());
        assertNotEquals(" Red Force", barco.getNombre());
    }

    @Test
    public void GetPoderTest(){

        assertEquals(100, luffy.getPoder());
        assertEquals(80, zoro.getPoder()); 
        assertNotEquals(20, luffy.getPoder());
        assertNotEquals(60, zoro.getPoder());
    }

    @Test
    public void GetEsDeliciosa(){
        assertEquals(true, fruta.esDeliciosa());
        assertNotEquals(false, fruta.esDeliciosa());
    }

    @Test
    public void GetCapacidad(){
        assertEquals(10, barco.getCapacidad());
        assertNotEquals(100, barco.getCapacidad());
    }

    //-----Setters-----

    @Test
    public void SetNombreTest(){

        luffy.setNombre("Monkey D. Luffy");
        zoro.setNombre("Roronoa Zoro");
        fruta.setNombre("Ope Ope");
        barco.setNombre("Thriller Bark");

        assertEquals("Monkey D. Luffy", luffy.getNombre());
        assertEquals("Roronoa Zoro", zoro.getNombre());
        assertEquals("Ope Ope", fruta.getNombre());
        assertEquals("Thriller Bark", barco.getNombre());
        assertNotEquals("Gomu Gomu", fruta.getNombre());
        assertNotEquals(" Red Force", barco.getNombre());
    }
    
    @Test
    public void SetPoderTest(){

        luffy.setPoder(50);
        zoro.setPoder(30);

        assertEquals(50, luffy.getPoder());
        assertEquals(30, zoro.getPoder()); 
        assertNotEquals(80, luffy.getPoder());
        assertNotEquals(100, zoro.getPoder());
    }

    @Test
    public void SetEsDeliciosaTest(){
        fruta.setEsDeliciosa(false);

        assertEquals(false, fruta.esDeliciosa());
    }

    @Test
    public void SetCapacidadTest(){
        barco.setCapacidad(100);

        assertEquals(100, barco.getCapacidad());
    }
}
