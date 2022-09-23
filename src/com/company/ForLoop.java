package com.company;

public class ForLoop {

    public static void main(String[] args) {

    /*
    Esto de abajo es lo que llamamos un bucle for. En el mismo tenemos el primer parámetro que es una variable,
    en este caso hemos puesto i=0 (podría ser cualquier otro nombre, letra....). Es la condición de comienzo.
    Luego tenemos un segundo parámetro que es la condición de parada, en este caso hemos puesto que se
    ejecute algo mientras i sea igual o menor que 10. Y por último tenemos la condición de paso, el cómo
    se va a ir incrementando ese bucle.
    Esto se va a imprimir 11 veces, ya que la condición se cumple 11 veces antes de que la letra i tuviese
    un valor de 11, que es cuando ya no se cumpliría.
     */
        for(int i = 0; i <= 10; i++) {

            System.out.println(i + " Hola Mundo");
        }

        System.out.println("Fin");
    }
}
