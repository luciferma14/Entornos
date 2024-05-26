package com.acalabuig;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.acalabuig.model.Cultivo;
import com.acalabuig.model.Empleado;
import com.acalabuig.model.Maquinaria;
import com.acalabuig.model.Producto;

public class TestIntegraciones {

    Cultivo maiz = new Cultivo("Maíz", 40.0, 80.0);
    Empleado lucia = new Empleado("Lucía", "Cultivar", 1000);
    Maquinaria tractor = new Maquinaria("Tractor", 10, 80);
    Producto cereales = new Producto("Cereales", 10);


    @Before
    public void setUp(){
        maiz = new Cultivo("Maíz", 40, 80);
        lucia = new Empleado("Lucía", "Cultivar", 1000);
        tractor = new Maquinaria("Tractor", 10, 80);
        cereales = new Producto("Cereales", 10);
    }

    @Test
    public void testIntegracionCultivos(){
        Cultivo trigo = new Cultivo("Trigo", 90, 65);

        assertEquals("Trigo", trigo.getNombre());
        assertEquals("Maíz", maiz.getNombre());
        assertEquals(90, trigo.getArea(), 0.01);
        assertEquals(40, maiz.getArea(), 0.01);
        assertEquals(65, trigo.getRendimiento(), 0.01);
        assertEquals(80, maiz.getRendimiento(), 0.01);
        assertNotEquals("Maíz", trigo.getNombre());
        assertNotEquals("Trigo", maiz.getNombre());
        assertNotEquals(40, trigo.getArea());
        assertNotEquals(90, maiz.getArea());
        assertNotEquals(80, trigo.getRendimiento());
        assertNotEquals(65, maiz.getRendimiento());
    }

    @Test
    public void testIntegracionEmpleado(){
        Empleado antonio = new Empleado("Antonio", "Regar", 900);

        assertEquals("Antonio", antonio.getNombre());
        assertEquals("Lucía", lucia.getNombre());
        assertEquals("Regar", antonio.getCargo());
        assertEquals("Cultivar", lucia.getCargo());
        assertEquals(900, antonio.getSalario(), 0.01);
        assertEquals(1000, lucia.getSalario(), 0.01);
        assertNotEquals("Lucía", antonio.getNombre());
        assertNotEquals("Antonio", lucia.getNombre());
        assertNotEquals("Cultivar", antonio.getCargo());
        assertNotEquals("Regar", lucia.getCargo());
        assertNotEquals(1000, antonio.getSalario());
        assertNotEquals(900, lucia.getSalario());
    }

    @Test
    public void testIntegracionMaquinaria(){
        Maquinaria segadora = new Maquinaria("Segadora", 80, 90);

        assertEquals("Segadora", segadora.getTipo());
        assertEquals("Tractor", tractor.getTipo());
        assertEquals(80, segadora.getHoraUso(), 0.01);
        assertEquals(10, tractor.getHoraUso(), 0.01);
        assertEquals(90, segadora.getEficiencia(), 0.01);
        assertEquals(80, tractor.getEficiencia(), 0.01);
        assertNotEquals("Tractor", segadora.getTipo());
        assertNotEquals("Segadora", tractor.getTipo());
        assertNotEquals(10, segadora.getHoraUso());
        assertNotEquals(80, tractor.getHoraUso());
        assertNotEquals(80, segadora.getEficiencia());
        assertNotEquals(90, tractor.getEficiencia());
    }

    @Test
    public void testIntegracionProducto(){
        Producto leche = new Producto("Leche", 5);

        assertEquals("Leche", leche.getNombre());
        assertEquals("Cereales", cereales.getNombre());
        assertEquals(5, leche.getPrecio(), 0.01);
        assertEquals(10, cereales.getPrecio(), 0.01);
        assertNotEquals("Cereales", leche.getNombre());
        assertNotEquals("Leche", cereales.getNombre());
        assertNotEquals(10, leche.getPrecio());
        assertNotEquals(5, leche.getPrecio());
    }
}
