package com.company.estructurascontrol;

public class EjemploIf {

    /*
    En este caso, las estructuras de control If se utilizan para cosas muy sencillas. Si algo es verdadero
    hacemos algo, y si no nada. O al contrario.
    En el caso de nuestro ejemplo de la parte inferior, se quedaría corto y sería mejor usar un If-Else.
     */

    public static void main(String[] args) {

        int edad = 17;

        if (edad >= 18) {

            System.out.println("Puedes sacarte el carnet de conducir");
        }

        System.out.println("FIN");
    }
}
