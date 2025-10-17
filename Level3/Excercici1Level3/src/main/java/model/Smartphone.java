package model;

public class Smartphone implements Phone{


    @Override
    public void phone() {
        System.out.println("El telefono esta llamando!");
    }

    public void Pictures (){
        System.out.println("El telefono está haciendo una foto.");
    }


}
