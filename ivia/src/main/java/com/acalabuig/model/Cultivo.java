package com.acalabuig.model;
/**
 * Clase para crear un Cultivo con nombre, área y rendimiento
 * 
 * @version 1.0
 */
public class Cultivo {

    private String nombre;
    /* En hectareas */
    private double area;
    /* En toneladas por area */
    private double rendimiento;

    /**
     * Contructor para crear un objeto Cultivo.
     * 
     * @param nombre el nombre del cultivo
     * @param area el área del cultivo
     * @param rendimiento el rendimiento del cultivo
     */
    public Cultivo(String nombre, double area, double rendimiento) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cultivo no puede ser nullo o vacío.");
        }
        if (area <= 0 || rendimiento <= 0) {
            throw new IllegalArgumentException("Area y rendimiento deben ser números positivos");
        }
        this.nombre = nombre;
        this.area = area;
        this.rendimiento = rendimiento;
    }
    
    /** 
     * Obtiene el nombre del cultivo
     * 
     * @return (String) el nombre del cultivo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el área de cultivo 
     * 
     * @return (double) el área del cultivo
     */
    public double getArea() {
        return area;
    }
    
    /**
     * Obtiene el rendimiento de la producción.
     *
     * @return el rendimiento de la producción en toneladas por unidad de área.
     */
    public double getRendimiento() {
        return rendimiento;
    }

    /**
     * Calcula el rendimiento total de la producción.
     *
     * @return el rendimiento total de la producción, calculado como el área multiplicada por el rendimiento.
     * @see #getArea()
     * @see #getRendimiento()
     */
    public double calcularRendimientoTotal() {
        return area * rendimiento;
    }

    /**
     * Calcula los ingresos totales en función del rendimiento total y el precio por tonelada.
     *
     * @param precioPorTonelada el precio por tonelada de la producción.
     * @return los ingresos totales calculados como el rendimiento total multiplicado por el precio por tonelada.
     * @see #calcularRendimientoTotal()
     */
    public double calcularIngresos(double precioPorTonelada) {
        return calcularRendimientoTotal() * precioPorTonelada;
    }
}