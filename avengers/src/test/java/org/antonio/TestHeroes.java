package org.antonio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestHeroes {

    Heroe ironman = new Heroe(null, null, null, null);
    Heroe spiderman = new Heroe(null, null, null, null);
    Heroe capitanAmerica = new Heroe(null, null, null, null);

    GestorHeroes gh = null;

    @Before
    public void setUp(){
        ironman = new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo", "Hecho de hierro");
        spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "Es una araña");
        capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "Es un humano");
        
        gh = new GestorHeroes();
        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
    }

    @Test
    public void testGettersHeroes() {

        assertEquals("Iron Man", ironman.getNombre());
        assertEquals("Traje de alta tecnología", ironman.getSuperpoderes());
        assertNotEquals("Capitan América", ironman.getNombre());
    }

    @Test
    public void testSettersHeroes(){

        Heroe catWoman = new Heroe(null, null, null,null);
        catWoman.setNombre("Cat-Woman");
        catWoman.setSuperpoderes("Trepar y arañar");
        catWoman.setBiografia("Es la amiga de Batman");

        assertEquals("Cat-Woman", catWoman.getNombre());
        assertEquals("Terpar y arañar", catWoman.getSuperpoderes());
        assertEquals("Es la amiga de Batman", catWoman.getBiografia());

        assertNotEquals("Capitan América", catWoman.getNombre());
    }
}