package com.company.poo.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creamos el objeto empleadoCRUD, perteneciente a la clase EmpleadoCRUD
        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();

        //Creamos el objeto juanito, perteneciente a la clase Empleado
        Empleado juanito = new Empleado("Juan", 30, 40, true);
        Empleado patricia = new Empleado("Patricia", 30, 40, true);
        Empleado roberto = new Empleado("Roberto", 30, 40, true);

        /*
        Utilizamos el método guardar, perteneciente a la clase EmpleadoCRUD para introducir
        en el ArrayList de la clase EmpleadoCRUD los siguientes datos.
         */
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(roberto);

         /*
        Utilizamos el método findAll, perteneciente a la clase EmpleadoCRUD para poder ver todos los
        empleados existentes, o lo que queramos ver.
        Lo vamos a guardar en una list.
         */
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
