package org.antonio;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class PlaylistTest {
    private Cancion cancion1;
    private Cancion cancion2;
    private Cancion cancion3;
    private Playlist playlist;

    @Before
    public void setUp() {
        cancion1 = new Cancion("Bohemian Rhapsody", "Queen", 355);
        cancion2 = new Cancion("Imagine", "John Lennon", 180);
        cancion3 = new Cancion("Hotel California", "Eagles", 390);
        playlist = new Playlist("Mis Favoritas");
    }

    @Test
    public void testGetNombre(){
        assertEquals("Mis Favoritas", playlist.getNombre());
        assertNotEquals("Música", playlist.getNombre());
    }

    @Test
    public void testSetNombre(){
        playlist.setNombre("Música");
    }

    @Test 
    public void testAgregarCanciones(){
        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);

        assertEquals(2, playlist.getCanciones().size());
        assertNotEquals(4, playlist.getCanciones().size());
    }

    @Test
    public void testEliminarCanicion(){
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        playlist.eliminarCancion(cancion2);

        assertEquals(1, playlist.getCanciones().size());
        assertNotEquals(2, playlist.getCanciones().size());
    }

    @Test
    public void testDuracionTotal(){
        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        assertEquals(925, playlist.getDuracionTotal());
        assertNotEquals(1000, playlist.getDuracionTotal());
    }

    @Test 
    public void testMostrarCaniones(){
        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        assertEquals("Canciones en la playlist 'Mis Favoritas':- Bohemian Rhapsody (Queen)- Imagine (John Lennon)- Hotel California (Eagles)", playlist.mostrarCanciones());
        assertNotEquals("Mis canciones en la playlist: CHIHIRO, LUNCH, L'AMOURE DE MA VIE", playlist.mostrarCanciones());
    }
}
