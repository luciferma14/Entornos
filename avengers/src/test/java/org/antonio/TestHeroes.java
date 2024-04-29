package org.antonio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestHeroes {

    Heroe ironman = null;
    Heroe Spiderman = null;
    Heroe CapitanAmerica = null;

    GestorHeroes gh = null;


    @Before
    void setUp(){
        Heroe ironman = new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo");
        Heroe spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria");
        Heroe capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial");
        
        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
    }

    @Test
    public void testGettersHeroes() {

        assertEquals("Iron Man", ironman.getNombre());
        assertEquals("Traje de alta tecnología", ironman.g
        assertNotEquals("Capitan América", ironman.getNombre());
    
    }

    @Test
    public void testSettersHeroes(){

        Heroe catWoman = null;
        catWoman.setNombre("Cat-Woman");
        catWoman.setSuperpoderes("Trepar y arañar");
        catWoman.setBiografia("Es la amiga de Batman");

        assertEquals("Cat-Woman", catWoman.getNombre());
        assertEquals("Terpar y arañar", catWoman.getSuperpoderes());
        assertEquals("Es la amiga de Batman", catWoman.getBiografia());

        assertNotEquals("Capitan América", catWoman.getNombre());
    }


}