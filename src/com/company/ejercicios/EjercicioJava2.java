package com.company.ejercicios;

/*
Declara 2 variables numéricas (con el valor que desees) e indica cual es mayor de los dos. Si son
iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

También, Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
 */

public class EjercicioJava2 {

    public static void main(String[] args) {

        String nombre = "Borja";
        int num1 = 7;
        int num2 = 2;

        if (num2>num1) {

            System.out.println("El número 2 es mayor que el numero 1");
        } else if (num1>num2) {

            System.out.println("El número 1 es mayor que el numero 2");

        } else if (num1==num2) {

            System.out.println("Ambos números son iguales");

        }

        System.out.println("FIN");

        System.out.println("Bienvenido " + nombre);




    }
}
