package org.antonio;

/**
 * Clase para crear frutas
 * @version 1.0
 */

public class Fruta {
    private String nombre;
    private boolean esDeliciosa;

    /**
     * Constructor para crear una fruta
     * @param nombre nombre que le pones a la fruta
     * @param cantidad cantidad que le pones a la fruta
     * @since 1.0
     */
    public Fruta(String nombre, boolean esDeliciosa) {
        this.nombre = nombre;
        this.esDeliciosa = esDeliciosa;
    }

    /**
     * Recoge el nombre de la la fruta
     * @return el nombre de la fruta
     * @since 1.0
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Dice si una fruta es deliciosa
     * @return si es deliciosa
     * @since 1.0
     */
    public boolean esDeliciosa() {
        return esDeliciosa;
    }

    /**
     * Comprueba si la fruta se puede comer.
     * @return true si la fruta es deliciosa y su nombre no es "Fruta del Diablo"
     * @since 1.0
     */
    public boolean puedoComer() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }
}
