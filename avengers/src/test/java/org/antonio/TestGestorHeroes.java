package org.antonio;

import java.util.ArrayList;
import java.util.List;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGestorHeroes {
    
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

    @Test(expected = HeroeNoEncontradoException.class)
    public void testEliminarHeroe() throws HeroeNoEncontradoException{
        gh.eliminarHeroe("Iron Man");

        gh.buscarHeroe("Iron Man");
    }

    @Test
    public void testlistarHeroesPorSuperpoderes(){
        Heroe catwoman = new Heroe("Cat Woman", "Trepar y arañar", "Amiga de Batman", "Es una gata");
        Heroe blackpanther = new Heroe("Black Panther", "Trepar y arañar y es un máquina", "Amiga de Batman", "Es una pantera");

        GestorHeroes gh2 = new GestorHeroes();

        gh2.agregarHeroe(catwoman);
        gh2.agregarHeroe(blackpanther);

        List<Heroe> heroesConSuperpoderes = new ArrayList<Heroe>();
        heroesConSuperpoderes.add(catwoman);
        heroesConSuperpoderes.add(blackpanther);

        assertArrayEquals(heroesConSuperpoderes.toArray(), gh2.listarHeroesPorSuperpoderes("trepar").toArray());
        assertTrue(heroesConSuperpoderes.toArray().length > gh2.listarHeroesPorSuperpoderes("Es un máquina").toArray().length);
    }

    @Test
    public void testBuscarHeroePorSuperpoder(){
        Heroe blackpanther = new Heroe("Black Panther", "Trepar y arañar y es un máquina", "Amiga de Batman", "Es una pantera");

        gh.agregarHeroe(blackpanther);

        assertEquals(blackpanther, gh.buscarHeroePorSuperpoder("Trepar"));
    }

    @Test
    public void testActualizarHeroe() throws HeroeNoEncontradoException{
        ironman.setSuperpoderes("Otro superpoder");

        gh.actualizarHeroe(ironman);
        Heroe hActualizado = gh.buscarHeroe("Iron Man");

        assertEquals("Otro superpoder", hActualizado.getSuperpoderes());
    }

    @Test
    public void testListarHeroes(){
        String listarHeroes = "Iron Man, Spider-Man, Capitán América";
        String listarHeroesNE = "Spider-Man, Capitán América";

        assertEquals(listarHeroes, gh.listarHeroes());
        assertNotEquals(listarHeroesNE, gh.listarHeroes());

    }
}
