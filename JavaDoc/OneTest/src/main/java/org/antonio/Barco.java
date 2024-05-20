package org.antonio;

/**
 * Clase para crea un barco
 * @version 1.0
 */
public class Barco {
    private String nombre;
    private int capacidad;

    /**
     * Constructor para crear un barco
     * @param nombre nombre que le pones al barco
     * @param cantidad cantidad que le pones al barco
     * @since 1.0
     */
    public Barco(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    /**
     * Recoge el nombre del barco
     * @return el nombre del barco
     * @since 1.0
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recoge la capacidad del barco
     * @return la capacidad del barco
     * @since 1.0
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Agrega tripulantes al barco
     * @return true, si la capacidad no supera los 10
     * @return false, si la capacidad supera los 10
     * @since 1.0
     */
    public boolean agregarTripulante() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }
}
