package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        /*Las listas en Java son variables que permiten almacenar grandes cantidades de datos. Son similares a
        los Array o a las Matrices, pero en este caso no es necesario establecer un tamaño específico para la
        variable, a diferencia de las tradicionales matrices o arrays. Las listas son sumamente versátiles y
        mucho más fáciles de manejar que otros tipos de variables de agrupación de datos.
         */

        /*
        Se construyen de la siguiente manera, como indicamos abajo. Palabra reservada List + entre <> introducimos
        el tipo de dato que llevará nuestra lista + el nombre de nuestra = new + ArrayList<tipo de dato> + ();
         */

        List<String> nombres = new ArrayList<String>();

        /*
        Con nuestra lista creada podemos empezar a introducir datos en ella. Supongamos que queremos agregar los
        siguientes nombres: Juan, Pedro, José, María. E imprimimos por pantalla para ver lo que nos imprime.
        Hacemos lo siguiente:
         */


        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("José");
        nombres.add("María");

        System.out.println(nombres);

        /*
        O también podemos hacer un bucle foreach para imprimir por pantalla. Utilizamos la palabra for + (tipo de
        dato + nombre de la variable temporal que vamos a crear y que almacenará cada elemento de la lista que
        vamos a crear + : + nombre de nuestra lista)
         */

        for (String nombre : nombres){

            System.out.println(nombre);
        }

    }
}
