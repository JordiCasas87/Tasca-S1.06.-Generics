package main;

import model.GenericMethods;
import model.Person;

public class MainApp {
    
    public static void main(String[] args) {

        Person person1 = new Person("Jordi","Casas",38);

        System.out.println();
        GenericMethods.showParameters(1987, "Barcelona","valorString");

        System.out.println();
        System.out.println();
        GenericMethods.showParameters(person1, 1987,"Barcelona");


    }
}
