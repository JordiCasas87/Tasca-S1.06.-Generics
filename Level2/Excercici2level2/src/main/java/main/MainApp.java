package main;

import model.GenericMethods;
import model.Person;

public class MainApp {

    public static void main(String[] args) {

/*
 Exercici 1
Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.
 */

        Person person1 = new Person("Jordi","Casas",38);

        System.out.println();
        GenericMethods.ShowParameters(1987, "Barcelona","valorString");

        System.out.println();
        GenericMethods.ShowParameters(person1, 1987,"Barcelona");


    }
}
