package model;

public class GenericMethods <T> {

    public static <T> void ShowParameters (T ... parameters){
        System.out.println("Estos son tus parametros: ");
        for (T parameter : parameters){
            System.out.print(""+parameter+" ");
        }


    }
}
