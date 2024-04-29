package test.java.org.antonio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;

public class TestFuncionalHeroes {
    
    Heroe ironman = new Heroe(null, null, null);
    Heroe Spiderman = new Heroe(null, null, null);
    Heroe CapitanAmerica = new Heroe(null, null, null);

    GestorHeroes gh = null;

    @Before
    public void setUp(){
        ironman = new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo");
        spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria");
        capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial");
        
        gh = new GestorHeroes();
        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
    }
    

    @Test
    public void testProgramaCompl() throws HeroeNoEncontradoException {

        Heroe batman = new Heroe ("Batman", "Dinero","Dueño del Batmovil");
        Heroe Hulk = new Heroe ("Hulk", "Aplatar","Es el más grande y fuerte");

        gh = new GestorHeroes();
        gh.agregarHeroe(batman);
        gh.agregarHeroe(hulk);

 
        assertEquals("Batman", batman.getNombre());
        assertEquals("Hulk", hulk.getNombre());
        assertEquals("Aplastar", hulk.getSuperpoderes());
        assertEquals("Dinero", batman.getSuperpoderes());
        assertNotEquals("Hulk", batman.getNombre());
        assertNotEquals("Aplastar", batman.getSuperpoderes());
    }
}