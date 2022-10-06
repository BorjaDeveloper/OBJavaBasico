package com.company.estructurascontrol;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Domingo";

        //Ejemplos Comparar
        boolean resultado = dia.equals(""); //En un String utilizamos el equals para comparar, no el operador ==.
        boolean resultadoCompararNum = 5 == 5; //Para comparar números si utilizaríamos el ==, en un String no.

        //If Else If

        if (dia.equals("Lunes")) {
            System.out.println("Ánimo con la semana");

        } else if (dia.equals("Martes")) {
            System.out.println("Ya es martes, un día menos");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Ya es miercoles, mitad de semana");

        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es Jueves, dos días más!");

        } else if (dia.equals("Viernes")) {
            System.out.println("Ya es Viernes, último día");

        } else if (dia.equals("Sabado")) {
            System.out.println("Ya es sábado, disfruta del fin de semana");

        } else if (dia.equals("Domingo")) {
            System.out.println("Ya es domingo, el día del señor");

        } else {

            System.out.println("El día introducido no es un día válido");
        }

        System.out.println("FIN");

    }
}
