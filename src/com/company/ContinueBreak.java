package com.company;

/*
Aquí vamos a ver las sentencias continue y break dentro de un bucle while o for. La palabra continue
hace que cuando la condición se cumpla, el flujo del código salte y evalúe la siguiente condición.
Por ejemplo abajo.
 */

public class ContinueBreak {

    public static void main(String[] args) {

        int count = 0;
        while(count < 10){

            count++;
            if(count==6)
                break;

            System.out.println("Hola Mundo " + count);

        }
/*
Aquí siguiendo el código lo que estamos diciendo es: inicializamos nuestra variable i en 0, mientras
esta variable sea menor que 10 imprimiremos el mensaje de abajo, salvo cuando la variable count sea
igual a 6, que entonces continuará con el siguiente valor saltando el código que tenemos abajo.
 */

/*
Luego tenemos la opción de la palabra break en vez de continue. Esto se utiliza para ocasiones donde
estamos buscando un valor y lo encontramos, romper la iteración, saldríamos del bucle y podríamos continuar
con nuestro código.
 */
        System.out.println("Fin");

    }
}
