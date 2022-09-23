package com.company;

public class Funciones {

    public static void main(String[] args){


        holaMundo();
        holaMundo(4 );
        holaMundo("Andrea");

        holaMundo("Borja");
        holaMundo("Roberto");

        devolverHola();
        String hola = devolverHola();
        System.out.println(hola);

    }

    /*
    La sintaxis de un método o una función se compone de:
    - public o prívate: Private significa que solo es accesible desde esta clase, mientras public
    indica que se puede acceder a esa determinada función desde cualquier otra clase.
    - static: Hace referencia a que pertenece a la clase funciones que hemos indicado arriba.
    - void: este es el tipo de dato que va a devolver. Podría ser un String, o un Int, por ejemplo.
    - identificador: en este caso hemos llamado al identificador holaMundo.
     */

    public static void holaMundo() {

        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");

    }

    public static void holaMundo(String name) {

        System.out.println("Hola " + name);
    }

    public static void holaMundo(Integer number) {

        System.out.println("El número que usted ha elegido es el " + number);
    }

    public static void holaMundo(String name, String surname) {

        System.out.println("Hola " + name + surname);
    }
    /*
    Por sobrecarga de funciones entendemos que podemos tener funciones repetidas con el mismo nombre,
    pero a las cuales les vamos a incluir parámetros diferentes. En este caso, tenemos dos funciones
    que se llaman igual, holaMundo, pero una no tiene parámetros y la otra si, con lo cual sería correcto.
    Y podríamos seguir sobrecargando esta función, si incluimos una tercera función con el mismo nombre
    pero parámetros diferentes. Y así con los ejemplos que hemos colocado arriba, donde la función se llama
    de la misma manera.
     */

    /*
    Como aquí si que vamos a devolver un texto, necesitamos tener un return. Arriba no lo necesitábamos,
    ya que void no devuelve nada.
    */

    public static String devolverHola() {

        return "Hola";
    }


}
