package model;

public class Gato extends Animal{
 private int numeroBigotes;

 public Gato(){
 }

    public Gato(String nombre, int edad, int numeroBigotes) {
        super(nombre, edad);
        this.numeroBigotes = numeroBigotes;
    }

    public int getNumeroBigotes() {
        return numeroBigotes;
    }

    public void setNumeroBigotes(int numeroBigotes) {
        this.numeroBigotes = numeroBigotes;
    }


    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
