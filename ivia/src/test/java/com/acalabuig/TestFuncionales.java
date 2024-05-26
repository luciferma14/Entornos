package com.acalabuig;

import org.junit.Test;

import com.acalabuig.model.Cultivo;
import com.acalabuig.model.Empleado;
import com.acalabuig.model.Maquinaria;
import com.acalabuig.model.Producto;

public class TestFuncionales {
    
    // ---- Cultivo ----
    
    @Test (expected = IllegalArgumentException.class)
    public void testCultivoConstructorException() throws IllegalArgumentException{
        Cultivo maiz = new Cultivo(null, -1, -2);
    }

    // ----- Empleado -----

    @Test (expected = IllegalArgumentException.class)
    public void testEmpleadoConstructorException() throws IllegalArgumentException{
        Empleado lucia = new Empleado(null, null, 0);
    } 

    @Test (expected = IllegalArgumentException.class)
    public void testEmpleadoAumentoNegativoException() throws IllegalArgumentException{
        Empleado lucia = new Empleado("Lucía", "Cultivar", 900);
        Empleado antonio = new Empleado("Antonio", "Regar", 900);
       
        lucia.darAumento(-1);
        antonio.darAumento(-2);
    }

    // ----- Producto -----

    @Test (expected = IllegalArgumentException.class)
    public void  testProductoConstructorException() throws IllegalArgumentException{
        Producto cereales = new Producto(null, -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testProductoDescuentoInvalidoPorAbajoException() throws IllegalArgumentException{
        Producto cereales = new Producto("Cereales", 10);
        Producto leche = new Producto("Leche", 3.5);

        double descuentoCereales = cereales.calcularPrecioConDescuento(-1);
        double descuentoLeche = leche.calcularPrecioConDescuento(-1.5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testProductoDescuentoInvalidoPorArribaException() throws IllegalArgumentException{
        Producto cereales = new Producto("Cereales", 10);
        Producto leche = new Producto("Leche", 3.5);

        double descuentoCereales = cereales.calcularPrecioConDescuento(110);
        double descuentoLeche = leche.calcularPrecioConDescuento(150);
    }

    // ----- Maquinaria -----

    @Test (expected = IllegalArgumentException.class)
    public void testMaquinariaConstructorException() throws IllegalArgumentException{
        Maquinaria tractor = new Maquinaria(null, -1, -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMaquinariaHorasNegativasException() throws IllegalArgumentException {
        Maquinaria tractor = new Maquinaria("Tractor", -1, -1);

        double tiempoTractor = tractor.calcularTiempoArado(9);
    }
}