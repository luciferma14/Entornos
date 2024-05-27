package org.antonio;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;
    private List<Playlist> playlists;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.playlists = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void agregarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void eliminarPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public String mostrarPlaylists() {
        System.out.println("Playlists de '" + nombre + "':");
        String salida_playlists = "Playlists de '" + nombre + "':";
        for (Playlist playlist : playlists) {
            System.out.println("- " + playlist.getNombre());
            salida_playlists += "- " + playlist.getNombre();
        }

        return salida_playlists;
    }

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
