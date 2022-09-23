package com.company;

/*
La sintaxis switch se utiliza cuando tenemos que evaluar multiples condiciones y no queremos hacerlo
con if, else, if, else...
 */

/*
En el caso de abajo estamos declarando una variable de tipo string, a la que hemos llamado weather y le
hemos dado el valor "sunny". Luego a continuación evaluamos con la palabra switch y la variable weather
tres posibles casos que se nos pueden dar: que sea sunny, cloudy o ninguna de las dos, en este caso default.
Si se cumple o sunny o cloudy se imprimirá el mensaje en pantalla que hemos elegido y con un break romperemos
la iteración para que imprima varios mensajes en pantalla, salvo en el caso del default.
 */

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather) {

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;

            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;

            default:
                System.out.println("No se ha podido identificar el clima");
        }
    }
}
