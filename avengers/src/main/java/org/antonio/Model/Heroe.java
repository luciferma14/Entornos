package org.antonio.Model;

public class Heroe {
    private String nombre;
    private String superpoderes;
    private String biografia;

    public Heroe(String nombre, String superpoderes, String biografia) {
        this.nombre = nombre;
        this.superpoderes = superpoderes;
        this.biografia = biografia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuperpoderes() {
        return superpoderes;
    }

    public String getBiografia() {
        return biografia;
    }

    public vois setNombre(String s){
        this.nombre = nombre;
    }

    public void setSuperpoderes(String treparYArañar){
        this.superpoderes = superpoderes;
    }

    public void setBiografia(String esLaAmigaDeBatman){
        this.biografia = biografia;
    
}
