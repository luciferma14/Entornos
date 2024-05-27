package org.antonio;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class UsuarioTest {
    private Usuario usuario;
    private Playlist playlist1;
    private Playlist playlist2;

    @Before
    public void setUp() {
        usuario = new Usuario("Juan");
        playlist1 = new Playlist("Mis Favoritas");
        playlist2 = new Playlist("Rock Clásico");
    }

    @Test
    public void testGetNombre(){
        assertEquals("Juan", usuario.getNombre());
        assertNotEquals("Lucía", usuario.getNombre());
    }

    @Test
    public void testSetNombre(){
        usuario.setNombre("Lucía");
    }

    @Test
    public void testCreaPlaylist(){
        usuario.agregarPlaylist(playlist1);
        usuario.agregarPlaylist(playlist2);

        assertEquals(2, usuario.getPlaylists().size());
        assertNotEquals(4, usuario.getPlaylists().size());

        assertEquals("Playlists de 'Juan':- Mis Favoritas- Rock Clásico", usuario.mostrarPlaylists());
        assertNotEquals("Playlist de Lucía: Música", usuario.mostrarPlaylists());
    }

    @Test
    public void testEliminarPlaylist(){
        usuario.agregarPlaylist(playlist1);
        usuario.agregarPlaylist(playlist2);

        usuario.eliminarPlaylist(playlist1);

        assertEquals(1, usuario.getPlaylists().size());
        assertNotEquals(2, usuario.getPlaylists().size());
    }

    @Test
    public void testMostrarPlaylists(){
        usuario.agregarPlaylist(playlist1);
        usuario.agregarPlaylist(playlist2);

        assertEquals("Playlists de 'Juan':- Mis Favoritas- Rock Clásico", usuario.mostrarPlaylists());
        assertNotEquals("Playlist de Lucía: Música", usuario.getPlaylists());
    }

    @Test
    public void testBuscarCancion(){
        Cancion cancion1 = new Cancion("CHIHIRO", "Billie Eilish", 400);
        Cancion cancion2 = new Cancion("L'AMOURE DE MA VIE", "Billie Eilish", 500);
        usuario.agregarPlaylist(playlist1);
        usuario.agregarPlaylist(playlist2);
        playlist1.agregarCancion(cancion1);
        playlist2.agregarCancion(cancion2);

        assertEquals("Resultados de la búsqueda de 'CHIHIRO' en las playlists de 'Juan':- CHIHIRO (Billie Eilish) - Playlist: Mis Favoritas", usuario.buscarCancionEnPlaylists("CHIHIRO"));
        assertNotEquals("L'AMOURE DE MA VIE", usuario.buscarCancionEnPlaylists("CHIHIRO"));
    }
}