package com.company.funciones;

public class FuncionesBasico {

    public static void main(String[] args) {

        /*
        Imaginemos que tenemos una tienda de zapatillas y que tengamos que desplegar este código muchas
        veces. Pues bien, para no reescribir código infinitas veces, se puede crear una función que
        englobe este código y que haga lo mismo únicamente invocando a la función.

        System.out.println("Bienvenidos al E-Commerce de Zapatillas");
        System.out.println("1 - Ver Zapatillas");
        System.out.println("2 - Comprar Zapatillas");
        System.out.println("3 - Salir");
        */


        /*
        Posibilidad 1. Estamos invocando a la función showMenu. Función sin parámetros y sin tipo de retorno.
         */
        showMenu();

        /*
        Posibilidad 2: Función sin parámetros y con tipo de retorno.
        getMenu(); Con esto no nos devolvería nada. Debemos de guardar en una variable lo que nos devuelve.
         */

        String menu = getMenu();
        System.out.println(menu);

        //También podría imprimirme la función sin guardarla en una variable
        System.out.println(getMenu());

        /*
        Posibilidad 3: Función con parámetros y sin tipo de retorno.
         */
        imprimirSaludo("OpenBootcamp");

         /*
        Posibilidad 3: Función con varios parámetros y con tipo de retorno.
         */
        String nombre2 = "Borja";
        String apellido = "Rodríguez";
        String saludo = obtenerSaludo(nombre2, apellido);
        System.out.println(saludo);

        //Sobrecarga de Funciones

        holaMundo("Borja");
        holaMundo(3);
        holaMundo("Andrea", "Blanco");

    }

    /*
    La sintaxis de un método o una función se compone de:
    - public o prívate: Private significa que solo es accesible desde esta clase, mientras public
    indica que se puede acceder a esa determinada función desde cualquier otra clase.
    - static: Hace referencia a que pertenece a la clase funciones que hemos indicado arriba.
    - void: este es el tipo de dato que va a devolver. Void no devuelve nada. Podría ser un String, Int...
    - identificador: en este caso hemos llamado al identificador holaMundo.
     */

    /*
    Creamos una función, a la cual llamamos showMenu, que englobe todo el código que habíamos visto arriba.
     */

    static void showMenu() {

        System.out.println("Bienvenidos al E-Commerce de Zapatillas");
        System.out.println("1 - Ver Zapatillas");
        System.out.println("2 - Comprar Zapatillas");
        System.out.println("3 - Salir");

    }

    /*
    Creamos una función, a la cual llamamos getMenu, que nos devuelva un tipo de dato String y al no ser
    de tipo void nos va a devolver algo, con lo cual tenemos que poner un return.
     */

    static String getMenu() {

        return "Bienvenidos al E-Commerce de Zapatillas: \n 1 - Ver Zapatillas";
    }

    /*
    Creamos una función, a la cual llamamos imprimirSaludo, que no nos va a devolver ningún tipo de dato, pero
    a la cual hemos pasado un parámetro de tipo String.
     */
    static void imprimirSaludo(String name) {

        System.out.println("Buenas tardes " + name);
    }

    /*
   Creamos una función, a la cual llamamos obtenerSaludo, que nos va a devolver un tipo de dato String, y a la
   cual hemos pasado en este caso dos parámetros de tipo String. Al no ser de tipo void, nos va a devolver algo,
   con lo cual debemos de colocar un return.
    */
    static String obtenerSaludo(String nombre2, String apellido) {

        return "Buenas tardes " + nombre2 + " " + apellido;
    }

     /*
    Por sobrecarga de funciones entendemos que podemos tener funciones repetidas con el mismo nombre,
    pero a las cuales les vamos a incluir parámetros diferentes. En este caso, tenemos dos funciones
    que se llaman igual, holaMundo, pero una no tiene parámetros y la otra si, con lo cual sería correcto.
    Y podríamos seguir sobrecargando esta función, si incluimos una tercera función con el mismo nombre
    pero parámetros diferentes. Y así con los ejemplos que hemos colocado arriba, donde la función se llama
    de la misma manera.
     */

    static void holaMundo(String name) {

        System.out.println("Hola " + name);
    }

    static void holaMundo(Integer number) {

        System.out.println("El número que usted ha elegido es el " + number);
    }

    static void holaMundo(String name3, String surname) {

        System.out.println("Hola " + name3 + " " + surname);
    }
}
