package main;

import model.GenericMethods;
import model.Person;

public class MainApp {

    /*
    Modifica l'apartat anterior de manera que els arguments del mètode genèric
    siguin una llista d'arguments de variable indefinida.
     */

    public static void main(String[] args) {

        Person person1 = new Person("Jordi","Casas",38);

        System.out.println();
        GenericMethods.ShowParameters(1987, "Barcelona","valorString");

        System.out.println();
        System.out.println();
        GenericMethods.ShowParameters(person1, 1987,"Barcelona");


    }
}
