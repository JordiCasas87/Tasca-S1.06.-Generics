package model;

public class GenericMethods <T> {

    public static <T> void showParameters (T ... parameters){
        System.out.println("Estos son tus parametros: ");
        for (T parameter : parameters){
            System.out.print(""+parameter+" ");
        }


    }
}
