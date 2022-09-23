package com.company;

public class PruebaFunciones {

    public static void main(String[] args){

        Funciones.holaMundo();

    }
}

/*
Como podemos ver en este código, estamos haciendo referencia a la función holaMundo, que la teníamos
creada en otra clase a la que habíamos llamado Funciones, pero podemos invocarla desde otra clase externa,
en este caso desde la clase PruebaFunciones, porque la teníamos como public. Si hubiese sido private,
nos hubiese aparecido un error, ya que no podríamos llamar a la función holaMundo desde una clase que no sea
donde se ha generado.
 */
