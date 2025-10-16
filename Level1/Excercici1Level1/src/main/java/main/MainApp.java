package main;

import model.NoGenericMethods;

public class MainApp {

    public static void main(String[] args) {

/*
 Exercici 1
Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments
 del mateix tipus, juntament amb els mètodes per a emmagatzemar i
 extreure aquests objectes i un constructor per a inicialitzar els tres.
 Comprova que els arguments es poden posar en qualsevol posició en la crida
  al constructor.
 */

        // tres formas de instanciar el objeto,
        NoGenericMethods user1 = new NoGenericMethods("Greibrush", "Monkey island", "menrtir");

        NoGenericMethods user2 = new NoGenericMethods("New York", "Investigar", "New York");

        NoGenericMethods user3 = new NoGenericMethods("Spain", "Carmen San Diego", "Robar");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

    }
}
