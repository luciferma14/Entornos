package org.antonio;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
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

}
