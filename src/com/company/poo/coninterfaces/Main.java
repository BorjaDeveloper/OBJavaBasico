package com.company.poo.coninterfaces;

import com.company.poo.sininterfaces.Empleado;
import com.company.poo.sininterfaces.EmpleadoCRUDV1;

public class Main {

    /*
    Aquí hemos creado un objeto llamado empleadoCRUD, de tipo EmpleadoCRUD, referido a la interface
    EmpleadoCRUD. Y lo hemos creado en la clase EmpleadoCRUDExcel.
    Pero también podríamos crear otro objeto que perteneciese a la clase EmpleadoCRUDMySQL.
    Esto es lo que tiene una interface, que simplemente cambiando donde lo queremos crear, como el resto
    de la estructura es la misma, sería mucho más sencillo.
     */
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();
    //static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();

    public static void main(String[] args) {


        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
