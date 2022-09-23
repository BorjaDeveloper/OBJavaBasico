package com.company;

public class TryCatchMain {

    public static void main(String[] args) {

        /*
        En este ejemplo, la línea de abajo nos va a dar error y el resto del programa no se ejecuta.

        int result = 5 / 0;

        System.out.println("Fin");

         */

        /*
        Si ejecutamos este programa, nos va a salir un ArithmeticException y el programa no va a seguir adelante,
        con lo cual no vamos a tener un programa robusto. Lo arreglaríamos de la siguiente manera:
        */

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Fin");

        //El error sigue estando porque no se ha corregido, pero el programa continúa.
    }
}
