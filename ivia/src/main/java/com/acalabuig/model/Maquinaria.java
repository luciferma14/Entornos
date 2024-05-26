package com.acalabuig.model;

/**
 * Clase para crear una Maquinaria con su tipo, horas de uso y eficiencia.
 * 
 * @version 1.0
 */
public class Maquinaria {
    private String tipo;
    /* En horas */
    private double horaUso; // en horas
    /* Hectáreas por hora */
    private double eficiencia; // hectáreas por hora

    /**
     * Constructor para crear un objeto Maquinaria.
     *
     * @param tipo el tipo de maquinaria. No puede ser nulo o vacío.
     * @param horasUso las horas de uso de la maquinaria. No puede ser negativo.
     * @param eficiencia la eficiencia de la maquinaria. Debe ser un valor positivo.
     * @throws IllegalArgumentException si el tipo es nulo o vacío, si las horas de uso son negativas, o si la eficiencia no es positiva.
     */
    public Maquinaria(String tipo, double horasUso, double eficiencia) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo no puede ser nulo o vacío.");
        }
        if (horasUso < 0 || eficiencia <= 0) {
            throw new IllegalArgumentException("Horas de uso no puede ser negativo y eficiencia debe ser positiva.");
        }
        this.tipo = tipo;
        this.horaUso = horasUso;
        this.eficiencia = eficiencia;
    }

    /**
     * Obtiene el tipo de maquinaria.
     *
     * @return (String) el tipo de maquinaria.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene las horas de uso de la maquinaria.
     *
     * @return (double) las horas de uso de la maquinaria.
     */
    public double getHoraUso() {
        return horaUso;
    }

    /**
     * Obtiene la eficiencia de la maquinaria.
     *
     * @return (double) la eficiencia de la maquinaria.
     */
    public double getEficiencia() {
        return eficiencia;
    }

    /**
     * Calcula el tiempo necesario para arar una cantidad de hectáreas.
     *
     * @param hectareas la cantidad de hectáreas que arar. Debe ser un valor positivo.
     * @return (double) el tiempo necesario para arar las hectáreas.
     * @throws IllegalArgumentException si la cantidad de hectáreas no es positiva.
     * @see #getEficiencia()
     */
    public double calcularTiempoArado(double hectareas) {
        if (hectareas <= 0) {
            throw new IllegalArgumentException("Hectareas debe ser un número positivo.");
        }
        return hectareas / eficiencia;
    }

    /**
     * Añade horas adicionales de trabajo a las horas de uso de la maquinaria.
     *
     * @param horasAdicionales las horas adicionales de trabajo. No pueden ser negativas.
     * @throws IllegalArgumentException si las horas adicionales son negativas.
     * @see #getHoraUso()
     */
    public void anyadirHorasTrabajo(double horasAdicionales) {
        if (horasAdicionales < 0) {
            throw new IllegalArgumentException("Horas adicionales no pueden ser negativas.");
        }
        this.horaUso += horasAdicionales;
    }
}