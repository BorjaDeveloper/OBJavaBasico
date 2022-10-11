package com.company.ejemplointerfaces1;

import com.company.poo.ejemplo2.Coche;
import com.company.poo.ejemplo2.CocheElectrico;

/*
Esto sería una implementación para coches clasicos. Se realiza con la palabra reservada implements. Las clases
que implementan interfaces, están obligadas a tener un cuerpo para esos métodos.
 */

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }
}
