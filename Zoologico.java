package model;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private ArrayList<Animal> listaAnimales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }
    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public void registrarAnimal(Animal animal) {
        String resultado= "";
        Animal animalEncontrar= null;
        animalEncontrar = buscarAnimal(animal.getNombre());
        if (animalEncontrar != null) {
            listaAnimales.add(animal);
            resultado = "Animal registrado exitosamente";
        }else{
            resultado = "el Animal ya existe";
        }
        return resultado;
    }
    public void buscarAnimal(String nombre) {
        Animal animalEncontrar= null;
        for (Animal animal: listaAnimales) {
            if (animal.getNombre().equals(nombre)) {
                animalEncontrar = animal;
            }
        }
        return animalEncontrar;
    }

    public void eliminanAnimal(String nombre) {
        Animal animalEncontrar= null;
        animalEncontrar= buscarAnimal(nombre);
        if(animalEncontrar!=null){
            listaAnimales.remove(animalEncontrar);
            return"animal eliminado correctamente";
        }else{
            return"el animal no existe";
        }
    }
    public void actualizarAnimal(String nuevoNombre,int nuevaEdad) {
        String resultado= "";
        Animal animalEncontrar= null;
        animalEncontrar= buscarAnimal(nombre);
        if (animalEncontrar != null) {
            animalEncontrar.setEdad(nuevaEdad);
            resultado = "Animal actualizado correctamente";
        }else{
            resultado= "el animal no existe";
        }
return resultado;
    }
    public void hacerSonido() {
        for(Animal animal: listaAnimales){
            animal.hacerSonido();
        }

    }

}
