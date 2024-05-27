package org.antonio;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
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

}
