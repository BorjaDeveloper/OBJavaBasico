package com.company.poo.clases;

/*
 Creamos una clase main en la cual va a haber un método que vamos a ejecutar y esto va a hacer que
 se inicie la aplicación.
 */

import com.company.poo.herencias.Camion;
import com.company.poo.herencias.Coche;
import com.company.poo.herencias.Motocicleta;

public class Main {

    //Static significa que este método pertenece a la clase Main, y no a los objetos de la misma.
    public static void main(String[] args) {

        /* 1. CLASES Y OBJETOS
        Vamos a crear un objeto. La estructura sería la siguiente:
        Clase identificador = new Clase(); La parte de Clase() es en realidad la llamada al constructor, al
        constructor que tú le hayas creado.
         */

        //Creamos un objeto con el constructor vacío.
        Vehiculo toyotaPrius = new Vehiculo();

        //Creamos un objeto motor, ya que hemos creado la clase motor, y le pasamos unos valores cualquiera.
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        //Crear un objeto utilizando el constructor con parámetros, ya que lo habíamos creado antes.
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false,
                0, motorGTI);
        //Estamos guardando toda esta información en la variable fordMondeo.

        //Para comprobarlo vamos a acceder a sus propiedades. Se accede de la siguiente manera:
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.cc);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.sport);
        System.out.println(fordMondeo.speed);

        fordMondeo.acelerar(50);

        System.out.println(fordMondeo.speed);

        // 2. HERENCIA
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = ("Kawasaki");

        // 3. POLIMORFISMO

        /*
        Aquí estamos diciendo que por ejemplo la variable vehículo que hemos creado, se puede comportar de
        diferentes formas. En este caso, como un coche, una motocicleta o un camión.
        Y podemos a todas, incluirle el método acelerar.
         */

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. CLASES ABSTRACTAS

        /*
        No se pueden instanciar, no se puede crear un objeto de ellas. Solo instancian las clases hija.
        En nuestro ejemplo tendría incluso sentido, ya que no queremos que se creen objetos de Vehículo, sino
        de coches, motocicletas o camiones..ya que si creamos un objeto de Vehículo, no sabemos que tipo de
        vehículo es.
         */



    }
}
