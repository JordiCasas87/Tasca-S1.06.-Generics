package model;

public class GenericMethods <T> {

    // si usas 3 parametros con 3 tipos genericos distintos debe de quedar reflejado tb en la delcaracion del metodo.

    public static <T,V,U> void ShowParameters (T parameter1, V parameter2, U parameter3){
        System.out.println("Estos son tus parametros: "+parameter1+", "+parameter2+"- "+parameter3+"");
    }


}
