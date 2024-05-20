package org.antonio;

/**
 * Crea el personaje de Zoro que implemanta Personaje
 * @version 1.0
 * @see #Personaje
 */

public class Zoro implements Personaje{
    private String nombre;
    private int poder;

    /**
     * Constructor para Luffy
     * @param nombre nombre con el que se va a usar a Luffy
     * @param poder poder que se pone a Luffy
     * @since 1.0
     */
    public Zoro(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    /**
     * Recoge el nombre del personaje
     * @return el nombre del personaje
     * @since 1.0
     */
     public String getNombre() {
        return nombre;
    }

    /**
     * Recoge el poder del personaje
     * @return el poder del personaje
     * @since 1.0
     */
    public int getPoder() {
        return poder;
    }

    /**
     * Método para atacar a otro personaje
     * @param enemigo personaje que va a recibir el daño
     * @see #recibirDanio(int)
     * @deprecated Reemplazado por {@link #atacar2()}.
     * @since 1.0
     */
    @Deprecated
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }

    /**
     * Método para atacar a otro personaje
     * @param enemigo personaje que va a recibir el daño
     * @see #recibirDanio(int)
     */
    public void atacar2(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }

    /**
     * Función para calcular la cantidad de daño
     * @param cantidadDanio cantidad que va a recibir
     * @since 1.0
     */
    @Override
    public void recibirDanio(int cantidadDanio) {
        this.poder -= cantidadDanio;
    }
}
