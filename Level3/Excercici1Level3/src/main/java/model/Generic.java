package model;

public class Generic {


    public static <T extends Phone>  void  phoneNumber (T smartphoneModel1){
        smartphoneModel1.phone();
        //smartphoneModel1.Pictures(); ----> respuesta al ejercicio ( No puede llamar a este metodo,
                                                                     //está limitado por la interfaz Phone.)
    }


    public static <T extends Smartphone> void  pictureSomething (T smartphoneModel1){
        smartphoneModel1.Pictures();
        smartphoneModel1.phone();
    }


}
