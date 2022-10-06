package com.company.ejercicios;

/*
Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
multiplicación, división y módulo (resto de la división).
 */

public class EjercicioJava1 {

    public static void main(String[] args) {

        int num1 = 36;

        double num2 = 105.36;

        double resultadoSuma = num2 + num1;
        double resultadoResta = num2 - num1;
        double resultadoMul = num1*num2;
        double resultadoDiv = num2/num1;
        double resultadoRes = num2%num1;

        System.out.println("La suma de ambos números es " + resultadoSuma);
        System.out.println("La resta de ambos números es " + resultadoResta);
        System.out.println("La multiplicación de ambos números es " + resultadoMul);
        System.out.println("La división de ambos números es " + resultadoDiv);
        System.out.println("La resto de la división de ambos números es " + resultadoRes);


    }
}
