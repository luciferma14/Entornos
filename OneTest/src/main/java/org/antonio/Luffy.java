package org.antonio;

public class Luffy {
    private String nombre;
    private int poder;

    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}