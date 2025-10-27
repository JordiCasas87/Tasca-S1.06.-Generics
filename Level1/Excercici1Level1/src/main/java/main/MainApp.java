package main;

import model.NoGenericMethods;

public class MainApp {

    public static void main(String[] args) {

        NoGenericMethods user1 = new NoGenericMethods("Greibrush", "Monkey island", "menrtir");

        NoGenericMethods user2 = new NoGenericMethods("New York", "Investigar", "New York");

        NoGenericMethods user3 = new NoGenericMethods("Spain", "Carmen San Diego", "Robar");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

    }
}
