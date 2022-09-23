package com.company;

public class ArraysMain {

    public static void main(String[] args) {

        //Imaginemos que tenemos una lista de nombres como la siguiente:
        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";

        /*
        Si vamos a trabajar a la vez con esta lista de nombres, podríamos crear una estructura de datos que
        englobe a las 3, y esto lo haríamos mediante un Array de datos como el que figura abajo. La estructura
        de un array siempre es la misma:
         */

        //Tipo de dato + [] + nombre de esa lista = new + tipo de dato + longitud del array.
        String [] nombres = new String [3];
        //Esta sería otra manera de rellenar un array, es equivalente a la de arriba.
        String [] nombres2 = new String [] {nombre1, nombre2, nombre3};
        //Un ejemplo para un grupo de números sería justo este de abajo. Es igual que el de arriba.
        int [] números = new int[5];

        /*
        Ahora el siguiente paso sería rellenar ese array con datos. En nuestro primer caso lo haríamos asi:
        Introducimos el nombre de nuestro Array, en nuestro caso era nombres + entre corchetes la posición
        dentro de ese array (recordamos que empezamos con el índice 0, que corresponde con el primer valor
        del array. Recordamos que si tenemos cun array como este con 3 valores, serían el índice 0, 1 y 2.
         */

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        nombres2[0] = nombre1;
        nombres2[1] = nombre2;
        nombres2[2] = nombre3;

        /*
        Ahora queremos recorrer ese Array y que nos imprima por pantalla todos esos valores (en nuestro caso,
        nombres), que contiene nuestro array. Para ello lo vamos a recorrer con un bucle for (en el cual
        introducimos el valor de entrada, el valor final y el incremento) e imprimimos por pantalla todos esos
        valores o datos.
         */

        for (int i=0; i < nombres.length; i++) {

            System.out.println(nombres[i]);
        }


    }
}
