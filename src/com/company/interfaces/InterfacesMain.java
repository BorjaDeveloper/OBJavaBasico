package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        /*
        Para crear la instancia, la sintaxis sería el nombre de la interface, el nombre que queramos darle nosotros
        a la acción = el operador new para crearlo y el nombre de cualquiera de las clases que han implementado esa
        interface.
         */
        CocheService service1 = new CocheServiceSportImpl();
        CocheService service2 = new CocheServiceClassicImpl();

        /*
        Ahora vamos a utilizar esas instancias. La sintaxis es que esto nos va a devolver un Coche + nombre que
        queramos darle (en este caso coche1 o coche2) = nombre de la instancia que hayamos creado arriba.método
        declarado en la interface.
         */

        Coche coche1 = service1.crearCocheDemo();

        Coche coche2 = service2.crearCocheDemo();
    }
}
