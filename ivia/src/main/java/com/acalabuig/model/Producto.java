package com.acalabuig.model;

/**
 * Clase para crear un Producto con su nombre y precio.
 * 
 * @version 1.0
 */
public class Producto {
    private String nombre;
    /* En euros */
    private double precio; // en Euros

    /**
     * Constructor para crear un objeto Producto.
     *
     * @param nombre el nombre del producto. No puede ser nulo o vacío.
     * @param precio el precio del producto. Debe ser un valor positivo.
     * @throws IllegalArgumentException si el nombre es nulo o vacío, o si el precio no es positivo.
     */
    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de producto no puede ser nulo o vacío.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("Precio debe ser positivo.");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return (String) el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return (double) el precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Calcula el precio del producto con un descuento.
     *
     * @param porcentajeDescuento el porcentaje de descuento a aplicar. Debe estar entre 0 y 100.
     * @return (double) el precio del producto con el descuento.
     * @throws IllegalArgumentException si el porcentaje de descuento no está entre 0 y 100.
     * @see #getPrecio()
     */
    public double calcularPrecioConDescuento(double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        return precio * (1 - porcentajeDescuento / 100);
    }
}