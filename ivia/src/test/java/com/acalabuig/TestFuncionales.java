package com.acalabuig;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.acalabuig.model.Cultivo;
import com.acalabuig.model.Empleado;
import com.acalabuig.model.Maquinaria;
import com.acalabuig.model.Producto;

public class TestFuncionales {
    
    Cultivo maiz = new Cultivo("Maíz", 40.0, 80.0);
    Empleado lucia = new Empleado("Lucía", "Cultivar", 1000);
    Maquinaria tractor = new Maquinaria("Camión", 10, 80);
    Producto cereales = new Producto("Cereales", 10);


    @Before
    public void setUp(){
        maiz = new Cultivo("Maíz", 40.0, 80.0);
        lucia = new Empleado("Lucía", "Cultivar", 1000);
        tractor = new Maquinaria("Camión", 10, 80);
        cereales = new Producto("Cereales", 10);
    }

    // ---- Cultivo ----
    
    @Test (expected = IllegalArgumentException.class)
    public void testCultivoConstructorException() throws IllegalArgumentException{
        Cultivo maiz = new Cultivo(null, -1, -2);

        assertEquals("Maíz", maiz.getNombre());
        assertEquals(0, maiz.getRendimiento(), 0.01);
        assertEquals(0, maiz.getArea(), 0.01);
        assertNotEquals("Trigo", maiz.getNombre());
        assertNotEquals(0, maiz.getRendimiento(), 0.01);
        assertNotEquals(0, maiz.getArea(), 0.01);
    }

    // ----- Empleado -----

    @Test (expected = IllegalArgumentException.class)
    public void testEmpleadoConstructorException() throws IllegalArgumentException{
        Empleado lucia = new Empleado(null, null, 0);

        assertEquals("Lucía", lucia.getNombre());
        assertEquals("Cultivar", lucia.getCargo());
        assertEquals(0, lucia.getSalario(), 0.01);
        assertNotEquals("Antonio", lucia.getNombre());
        assertNotEquals("Regar", lucia.getCargo());
        assertNotEquals(10, lucia.getSalario(), 0.01);
    } 

    @Test (expected = IllegalArgumentException.class)
    public void testEmpleadoAumentoNegativoException() throws IllegalArgumentException{
        Empleado lucia = new Empleado("Lucía", "Cultivar", 900);
        Empleado antonio = new Empleado("Antonio", "Regar", 900);
       
        lucia.darAumento(-1);
        antonio.darAumento(-2);

        assertEquals(0, lucia.getSalario(), 0.01);
        assertEquals(0, antonio.getSalario(), 0.01);
        assertNotEquals(10, lucia.getSalario(), 0.01);
        assertNotEquals(10, antonio.getSalario(), 0.01);
    }

    // ----- Producto -----

    @Test (expected = IllegalArgumentException.class)
    public void  testProductoConstructorException() throws IllegalArgumentException{
        Producto cereales = new Producto(null, -1);
        
        assertEquals("Cereales", cereales.getNombre());
        assertEquals(0, cereales.getPrecio(), 0.01);
        assertNotEquals("Trigo", cereales.getNombre());
        assertNotEquals(10, cereales.getPrecio(), 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testProductoDescuentoInvalidoPorAbajoException() throws IllegalArgumentException{
        Producto cereales = new Producto("Cereales", 10);
        Producto leche = new Producto("Leche", 3.5);

        double descuentoCereales = cereales.calcularPrecioConDescuento(-1);
        double descuentoLeche = leche.calcularPrecioConDescuento(-1.5);

        assertEquals(0, descuentoCereales, 0.01);
        assertEquals(0, descuentoLeche, 0.01);
        assertNotEquals(10, descuentoCereales, 0.01);
        assertNotEquals(10, descuentoLeche, 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testProductoDescuentoInvalidoPorArribaException() throws IllegalArgumentException{
        Producto cereales = new Producto("Cereales", 10);
        Producto leche = new Producto("Leche", 3.5);

        double descuentoCereales = cereales.calcularPrecioConDescuento(110);
        double descuentoLeche = leche.calcularPrecioConDescuento(150);

        assertEquals(0, descuentoCereales, 0.01);
        assertEquals(0, descuentoLeche, 0.01);
        assertNotEquals(10, descuentoCereales, 0.01);
        assertNotEquals(10, descuentoLeche, 0.01);
    }

    // ----- Maquinaria -----

    @Test (expected = IllegalArgumentException.class)
    public void testMaquinariaConstructorException() throws IllegalArgumentException{
        Maquinaria tractor = new Maquinaria(null, -1, -1);

        assertEquals("Tractor", tractor.getTipo());
        assertEquals(0, tractor.getEficiencia(), 0.01);
        assertNotEquals("Camión", tractor.getTipo());
        assertNotEquals(80, tractor.getEficiencia(), 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMaquinariaHorasNegativasException() throws IllegalArgumentException {
        Maquinaria tractor = new Maquinaria("Tractor", -1, -1);

        double tiempoTractor = tractor.calcularTiempoArado(9);

        assertEquals(0, tiempoTractor, 0.01);
        assertNotEquals(10, tiempoTractor, 0.01);
        assertNotEquals(0, tiempoTractor, 0.01);
        assertNotEquals(3, tiempoTractor, 0.01);
    }
}