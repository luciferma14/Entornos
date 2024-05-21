package com.acalabuig;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.acalabuig.model.Cultivo;
import com.acalabuig.model.Empleado;
import com.acalabuig.model.Maquinaria;
import com.acalabuig.model.Producto;

public class TestUnitarios {

    Cultivo maiz = new Cultivo("Maíz", 40.0, 80.0);
    Empleado lucia = new Empleado("Lucía", "Cultivar", 1000);
    Maquinaria tractor = new Maquinaria("Camión", 10, 80);
    Producto cereales = new Producto("Cereales", 10);

    // da error si lo hago directamente en el setUp

    @Before
    public void setUp(){
        maiz = new Cultivo("Maíz", 40.0, 80.0);
        lucia = new Empleado("Lucía", "Cultivar", 1000);
        tractor = new Maquinaria("Camión", 10, 80);
        cereales = new Producto("Cereales", 10);
    }

    
    //-- Cultivo --

    @Test
    public void testCalcularRendimientoTotal(){
        Cultivo arroz = new Cultivo("Arroz", 50, 90);
        double rend = maiz.calcularRendimientoTotal();
        double rendArroz = arroz.calcularRendimientoTotal();

        assertEquals(3200, rend, 0.01);
        assertEquals(4500, rendArroz, 0.01);
        assertNotEquals(1000, rend, 0.01);
        assertNotEquals(500, rend, 0.01);
        assertNotEquals(3200, rendArroz, 0.01);
        assertNotEquals(5000, rendArroz, 0.01);
    }

    @Test
    public void testCalcularIngresos(){
        Cultivo arroz = new Cultivo("Arroz", 50, 90);
        double ingresos = maiz.calcularIngresos(50.0);
        double ingresosArroz = arroz.calcularIngresos(40.0);
        
        assertEquals(160000, ingresos, 0.01);
        assertEquals(180000, ingresosArroz, 0.01);
        assertNotEquals(9000, ingresos, 0.01);
        assertNotEquals(100000, ingresos, 0.01);
        assertNotEquals(90, ingresosArroz, 0.01);
        assertNotEquals(490000, ingresosArroz, 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNombreCultivoNoPuedeSerVacio(){
        Cultivo maiz = new Cultivo(null, 40.0, 80.0);       
        Cultivo arroz = new Cultivo(null, 50, 90);
    
        assertEquals("Maíz", maiz.getNombre());
        assertEquals("Arroz", arroz.getNombre());
        assertNotEquals("Maíz", maiz.getNombre());
        assertNotEquals("Arroz", arroz.getNombre());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAreaDebeSerPositivo(){
        Cultivo maiz = new Cultivo("Maíz", 0, 80.0);       
        Cultivo arroz = new Cultivo("Arroz", 0, 90);

        assertEquals(50, maiz.getArea(), 0.01);
        assertEquals(90, arroz.getArea(), 0.01);
        assertEquals(10, maiz.getArea(), 0.01);
        assertEquals(20, arroz.getArea(), 0.01);
    }

    // -- Empleado --

    @Test
    public void testCalculaSalarioAnual(){
        Empleado antonio = new Empleado("Antonio", "Regar", 900);
        double salLucia = lucia.calculaSalarioAnual();
        double salAntonio = antonio.calculaSalarioAnual();

        assertEquals(12000, salLucia, 0.01);
        assertEquals(10800, salAntonio,0.01);
        assertNotEquals(1000, salLucia, 0.01);
        assertNotEquals(8000, salAntonio,0.01);
    }

    @Test
    public void testDarAumento(){
        Empleado antonio = new Empleado("Antonio", "Regar", 900);
        lucia.darAumento(2.1);
        antonio.darAumento(1.5);

        assertEquals(1021, lucia.getSalario(), 0.01);
        assertEquals(913.5, antonio.getSalario(), 0.01);
        assertNotEquals(1000, lucia.getSalario(), 0.01);
        assertNotEquals(9102, antonio.getSalario(), 0.01);
    }
}
