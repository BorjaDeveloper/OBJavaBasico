package com.company.estructurascontrol;

public class IfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 18;
        int number3 = 27;
        int number4 = 13;

        /*
        Lo de arriba son ejemplos de como podemos colocar datos para poder realizar un If/Else más abajo.
         */

        if (number3 < number2) {

            System.out.println("Verdadero");
        } else {
            System.out.println("Error");
        }

        System.out.println("Hasta luego");

        /*
        Aquí tenemos lo que es un flujo de código completo. En el if entramos en la condición; si se cumple
        imprimirá verdadero. Si no es así imprimirá error y para finalizar, se cumpla o no, nos despedirá con
        la frase hasta luego.
         */
    }

}
