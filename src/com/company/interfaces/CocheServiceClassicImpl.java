package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

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
