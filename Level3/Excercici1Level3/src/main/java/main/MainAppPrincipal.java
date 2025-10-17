package main;

import model.Generic;
import model.Smartphone;

public class MainAppPrincipal {

    public static void main(String[] args) {
        System.out.println();
        Smartphone smartphoneModel1 = new Smartphone();

        System.out.println("Método limitado por interfaz Phone.");
        Generic.phoneNumber(smartphoneModel1);

        System.out.println();
        System.out.println("Método limitado por classe Smartphone.");
        Generic.pictureSomething(smartphoneModel1);

    }
}
