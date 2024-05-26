package com.acalabuig.model;

/**
 * Clase para crear un Empleado con su nombre, cargo y salario.
 * 
 * @version 1.0
 */
public class Empleado {
    private String nombre;
    private String cargo;
    /* En euros */
    private double salario; // en Euros

    /**
     * Contructor para crear un objeto Empleado.
     *
     * @param nombre el nombre del empleado. No puede ser nulo o vacío.
     * @param cargo el cargo del empleado. No puede ser nulo o vacío.
     * @param salario el salario del empleado en euros. Debe ser un valor positivo.
     * @throws IllegalArgumentException si el nombre o cargo son nulos o vacíos, o si el salario no es positivo.
     */
    public Empleado(String nombre, String cargo, double salario) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del empleado no puede ser nulo o vacío.");
        }
        if (cargo == null || cargo.isEmpty()) {
            throw new IllegalArgumentException("Cargo no puede ser nulo o vacío.");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario debe ser un número positivo.");
        }
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return (String) el nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return (String) el cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Obtiene el salario del empleado en euros.
     *
     * @return (double) el salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Calcula el salario anual del empleado.
     *
     * @return (double) el salario anual del empleado.
     * @see #getSalario()
     */
    public double calculaSalarioAnual() {
        return salario * 12;
    }

    /**
     * Aumenta el salario del empleado por un porcentaje.
     *
     * @param porcentaje el porcentaje de aumento del salario. No puede ser negativo.
     * @throws IllegalArgumentException si el porcentaje de aumento es negativo.
     * @see #calculaSalarioAnual()
     */
    public void darAumento(double porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("El porcentaje de aumento no puede ser negativo.");
        }
        this.salario += this.salario * porcentaje / 100;
    }
}