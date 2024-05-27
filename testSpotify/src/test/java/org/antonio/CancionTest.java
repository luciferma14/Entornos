package org.antonio;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CancionTest {
    private Cancion cancion;

    @Before
    public void setUp() {
        cancion = new Cancion("Bohemian Rhapsody", "Queen", 355);
    }

}
