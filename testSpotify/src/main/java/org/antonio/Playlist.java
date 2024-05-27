package org.antonio;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private String nombre;
    private List<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    public int getDuracionTotal() {
        int duracionTotal = 0;
        for (Cancion cancion : canciones) {
            duracionTotal += cancion.getDuracion();
        }
        return duracionTotal;
    }

    public String mostrarCanciones() {
        System.out.println("Canciones en la playlist '" + nombre + "':");
        String salida_canciones = "Canciones en la playlist '" + nombre + "':";
        for (Cancion cancion : canciones) {
            System.out.println("- " + cancion.getTitulo() + " (" + cancion.getArtista() + ")");
            salida_canciones += "- " + cancion.getTitulo() + " (" + cancion.getArtista() + ")";
        }

        return salida_canciones;
    }
}
