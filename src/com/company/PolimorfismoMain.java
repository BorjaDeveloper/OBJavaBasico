package com.company;

import com.company.poo.ejemplo2.Coche;
import com.company.poo.ejemplo2.CocheElectrico;
import com.company.poo.ejemplo2.CocheHibrido;

public class PolimorfismoMain {

    public static void main(String[] args) {

        /*
        Hasta ahora hemos creado objetos utilizando el nombre de la clase.
         */

        Coche coche1 = new Coche(); //Acabamos de crear un objeto de la clase coche.

        CocheElectrico coche2 = new CocheElectrico();//Creamos un objeto de la clase CocheElectrico.

        CocheHibrido coche3 = new CocheHibrido();

        /*Si queremos tratar estos coches (coche1, coche2 o coche3) como algo más general, como un Coche,
        no como coche hibrido o coche electrico. De esta manera llegamos al concepto de polimorfismo.
        */

        Coche coche4 = new CocheElectrico();//Esto no da fallo porque cocheElectrico hereda de Coche.

        Coche coche5 = new CocheHibrido();//Esto no da fallo porque cocheHibrido hereda de Coche.

        /*
        Si quisiéramos saber por ejemplo, de que clase concreta es el objeto coche4, podemos hacerlo de
        la siguiente manera con la palabra reservada instanceof.
        Acabo se van a cumplir los dos primeros coches, ya que coche4 es un coche y también es un cocheElectrico,
        pero no así con un cocheHibrido.
        Entonces vemos que la diferencia de trabajar con polimorfismo o no trabajar con ella, es que cuando
        no lo hacemos, trabajamos sobre tipos concretos. Sin embargo, gracias al polimorfismo somos capaces
        de abstraernos de una manera más amplia y trabajamos con la clase que está por encima.
         */

        if(coche4 instanceof Coche) {
            System.out.println("coche4 es un coche");
        }

        if(coche4 instanceof CocheElectrico) {
            System.out.println("coche4 es un coche Electrico");
        }

        if(coche4 instanceof CocheHibrido) {
            System.out.println("coche4 es un coche Hibrido");
        }

    }
}


