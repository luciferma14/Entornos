package org.antonio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para crear una Canción
 * 
 * @version 1.0
 */
class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    /**
     * Constructor que reciba el título, artista y duración de la canción.
     * 
     * @param titulo (String) el título de la canción nueva
     * @param artista (String) el artista de la canción nueva
     * @param duracion (int) la duración de la canción nueva
     */
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    // Métodos getter y setter para los atributos

    /**
     * Obtiene el título de la canción.
     * 
     * @return (String) el título de la canción
     * @since 1.0
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la canción.
     * 
     * @param titulo (String) el título de la canción
     * @since 1.0
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el artista de la canción.
     * 
     * @return (String) el artita de la canción
     * @since 1.0
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Establece el artista de la canción.
     * 
     * @param artista (String) el artista de la canción
     * @since 1.0
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Obtiene la duración de la canción.
     * 
     * @return la duración de la canción
     * @since 1.0
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la canción.
     * 
     * @param duracion (int) la duración de la canción
     * @since 1.0
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
