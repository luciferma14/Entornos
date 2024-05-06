package org.antonio.Model;

import org.antonio.Exception.HeroeNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class GestorHeroes {
    private List<Heroe> heroes;

    public GestorHeroes() {
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe) {
        this.heroes.add(heroe);
    }

    public Heroe buscarHeroe(String nombre) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException(nombre);
    }

    public Heroe[] getHeroes() {
        return this.heroes.toArray(new Heroe[0]);
    }   

    public Heroe buscarHeroePorSuperpoder(String superpoder){
        for(Heroe heroe : this.heroes){
            if(heroe.getSuperpoderes().contains(superpoder)){
                return heroe;
            }
        }
        return null;
    }

    public void actualizarHeroe(Heroe heroeActualizado) throws HeroeNoEncontradoException{
        for (Heroe heroe : this.heroes){
            if (heroe.getNombre().equals(heroeActualizado.getNombre())){
                heroe.setSuperpoderes(heroeActualizado.getSuperpoderes());
                heroe.setBiografia(heroeActualizado.getBiografia());
                heroe.setDescripcion(heroeActualizado.getDescripcion());

                return;
            }
        }
        throw new HeroeNoEncontradoException(heroeActualizado.getNombre());
    }

    public String listarHeroes(){
        List<String> nombres = new ArrayList<String>();
        for (Heroe heroe : this.heroes){
            nombres.add(heroe.getNombre());
        }

        return String.join(", ", nombres);
    }

    public void eliminarHeroe(String nombre)throws HeroeNoEncontradoException{
        for (Heroe heroe : this.heroes){
            if(heroe.getNombre().equals(nombre)){
                this.heroes.remove(heroe);
                return;
            }
        }
        throw new HeroeNoEncontradoException(nombre);
    }

    public List<Heroe> listarHeroesPorSuperpoderes(String superpoder){
        List<Heroe> heroesConSuperpoderes = new ArrayList<Heroe>();

        for (Heroe heroe : this.heroes){
            if (heroe.getSuperpoderes().toLowerCase().contains(superpoder)){
                heroesConSuperpoderes.add(heroe);
            }
        }
        return heroesConSuperpoderes;
    }
}
