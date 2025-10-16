package model;

public class GenericMethods <T> {

    public static <T,V> void ShowParameters (T parameter1, V parameter2, String parameter3){
        System.out.println("Estos son tus parametros: "+parameter1+", "+parameter2+"- "+parameter3+"");
    }

}
