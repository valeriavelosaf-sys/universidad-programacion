package model;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    public Perro() {
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

}
