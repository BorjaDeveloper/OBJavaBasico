package com.company.estructurascontrol;

public class WhileLoop {

    /*
    Es una estructura iterativa indeterminada, este bucle comienza evaluando una condición booleana dada.
    Si la condición es verdadera, se ejecutan las sentencias en el cuerpo interno del bucle. Si no, pasa a
    la siguiente instrucción del programa. Por esta razón también se le llama bucle de control de entrada.
     */

    /*
    El while se podría considerar como una instrucción if repetitiva, presenta similitudes con el bucle for,
    pero se diferencia de este porque la iteración no se produce un número determinado de veces, sino que
    se ejecuta hasta que la condición pase a ser falsa.
     */

    public static void main(String[] args) {


        int i = 0; //INICIALIZACIÓN DE LA VARIABLE DE CONTROL

        //CONDICIÓN A EVALUAR QUE DETERMINARÁ LA CONTINUIDAD O NO DEL BUCLE
        while(i < 10){

            System.out.println("Hola Mundo " + i); //EJECUCIÓN DE LAS INSTRUCCIONES DEL CUERPO DEL WHILE
            i++; //CONTADOR, VARIABLE ENTERA DE CONTROL

        }

        System.out.println("Fin");
    }
}

/*
El bucle do while es prácticamente igual al while, solo que a diferencia de este, el código se ejecuta al
menos una vez, ya que la comprobación se hace después de cada iteración y no antes como en el caso del while.

Después de la ejecución de los enunciados, y la actualización del valor de la variable, la condición se
verifica. Si se evalúa como verdadero, comienza la siguiente iteración del ciclo.

Si la condición es falsa, se habrá ejecutado una vez y luego abandonará el bucle y continuará con
el programa. Por esta razón es que al bucle do-while se lo considera como un bucle de control de salida.
 */
