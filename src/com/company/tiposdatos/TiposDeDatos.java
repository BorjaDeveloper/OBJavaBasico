package com.company.tiposdatos;

public class TiposDeDatos {

    public static void main(String[] args){

        // 1.Numéricos

        // 1.1 Enteros

        byte variable1 = 3;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        // Una variable se declara así. Tipo de dato + identificador = valor;

        // 1.2 Punto Flotante
        float variable5 = 4.9f;
        double variable6= 9.99d;


        // 2.Booleanos
        boolean variable7 = true;
        boolean variable8 = false;

        // 3.Texto
        char variable9 = 'a';
        String variable10 = "Borja";
        String variable11 = "Lorem ipsum est ajta...";

        //Todos estos anteriores son tipos primitivos, no pueden ser nulos.

        //Para esto tenemos los tipos envoltorios. Esto son como clases, nos permiten envolver números primitivos

        Integer num6 = null;
        Long num7 = 2L;




    }
}
