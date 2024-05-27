package org.antonio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para crear una Playlist
 * 
 * @version 1.0
 */
class Playlist {
    private String nombre;
    private List<Cancion> canciones;

    /**
     * Constructor que reciba el nombre de la playlist.
     * 
     * @param nombre (String) el nombre de la playlist
     * @since 1.0
     */
    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la playlist.
     * 
     * @return (String) el nombre de la playlist
     * @since 1.0
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la playlist.
     * 
     * @param nombre (String) el nombre de la playlist
     * @since 1.0
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene una lista de las canciones de la playlist.
     * 
     * @return una lista de las canciones de la playlist
     * @since 1.0
     */
    public List<Cancion> getCanciones() {
        return canciones;
    }

    /**
     * Método para agregar una canción a la playlist.
     * 
     * @param cancion la cancion de la playlist que quieres agregar
     * @since 1.0
     */
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    /**
     * Método para eliminar una canción de la playlist.
     * 
     * @param cancion la cancion de la playlist que quieres eliminar
     * @since 1.0
     */
    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    /**
     * Método para obtener la duración total de la playlist.
     * 
     * @return (int) el tiempo de las canciones de la playlist
     * @since 1.0
     */
    public int getDuracionTotal() {
        int duracionTotal = 0;
        for (Cancion cancion : canciones) {
            duracionTotal += cancion.getDuracion();
        }
        return duracionTotal;
    }

    /**
     * Método para mostrar la lista de canciones en la playlist.
     * 
     * @return (String) el nombre de las canciones de la playlist
     * @since 1.0
     */
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
