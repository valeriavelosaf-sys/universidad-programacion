package app;

import model.Animal;
import model.Zoologico;

public class Aplicacion {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        Animal gato1 = new Animal("michi",3,8);
        Animal perro1 = new Animal("firulais",5);
        Animal pato = new Animal("patricio",5);
        Animal perro2 = new Animal("Luky",2);
        Animal gato2= new Animal("molly",6,8);

        zoologico.getListaAnimales().add(gato1);
        zoologico.getListaAnimales().add(perro1);
        zoologico.getListaAnimales().add(pato);
        zoologico.getListaAnimales().add(perro2);
        zoologico.getListaAnimales().add(gato2);

        zoologico.hacerSonido();
    }
}
