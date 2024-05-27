package org.antonio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para crear un Usuario.
 * 
 * @version 1.0
 */
class Usuario {
    private String nombre;
    private List<Playlist> playlists;

    /**
     * Constructor que reciba el nombre del usuario.
     * 
     * @param nombre (String) el nombre del usuario
     * @since 1.0
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.playlists = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return (String) el nombre del usuario
     * @since 1.0
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre (String) el nombre del usuario
     * @since 1.0
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene una lista de las playlists del usuario.
     * 
     * @return una lista de las playlists del usuario
     * @since 1.0
     */
    public List<Playlist> getPlaylists() {
        return playlists;
    }

    /**
     * Método para crear una nueva playlist y agregarla a la lista del usuario.
     * 
     * @param playlist la playlist que se quiera agregar al usuario
     * @since 1.0
     */
    public void agregarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    /**
     * Método para eliminar una playlist de la lista del usuario.
     * 
     * @param playlist la playlist que se quiera eliminar del usuario
     * @since 1.0
     */
    public void eliminarPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    /**
     * Método para mostrar todas las playlists del usuario.
     * 
     * @return (String) las playlists con su nombre
     * @since 1.0
     */
    public String mostrarPlaylists() {
        System.out.println("Playlists de '" + nombre + "':");
        String salida_playlists = "Playlists de '" + nombre + "':";
        for (Playlist playlist : playlists) {
            System.out.println("- " + playlist.getNombre());
            salida_playlists += "- " + playlist.getNombre();
        }

        return salida_playlists;
    }

    /**
     * Método para buscar una canción en todas las playlists del usuario.
     * 
     * @param tituloCancion (String) el título de la canción que queremos buscar
     * @return  el título de la canción que has buscado con el nombre de la playlist a la que pertenece y el artista
     * @since 1.0
     */
    public String buscarCancionEnPlaylists(String tituloCancion) {
        System.out.println("Resultados de la búsqueda de '" + tituloCancion + "' en las playlists de '" + nombre + "':");
        String salida_cancion_playlist = "Resultados de la búsqueda de '" + tituloCancion + "' en las playlists de '" + nombre + "':";
        for (Playlist playlist : playlists) {
            System.out.println("- Playlist: " + playlist.getNombre());
            System.out.println(playlist.getCanciones().size());
            for (Cancion cancion : playlist.getCanciones()) {
                if (cancion.getTitulo().equalsIgnoreCase(tituloCancion)) {
                    System.out.println("- " + cancion.getTitulo() + " (" + cancion.getArtista() + ") - Playlist: " + playlist.getNombre());
                    salida_cancion_playlist += "- " + cancion.getTitulo() + " (" + cancion.getArtista() + ") - Playlist: " + playlist.getNombre();
                }
            }
        }

        return salida_cancion_playlist;
    }
}
