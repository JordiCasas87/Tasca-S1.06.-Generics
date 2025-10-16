package model;

public class GenericMethods <T> {

    public static <T,V,U> void ShowParameters (T parameter1, V parameter2, U parameter3){
        System.out.println("Estos son tus parametros: "+parameter1+", "+parameter2+"- "+parameter3+"");
    }


}
