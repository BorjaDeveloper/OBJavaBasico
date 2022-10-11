package com.company.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/*
CRUD son las siglas de Create, Retrieve/Read, Update y Delete
 */
public class EmpleadoCRUDV1 {

    /*
    Creamos un ArrayList de empleados. Es como un array normal, pero dinámico, donde podemos introducir datos.
    Esto sería una estructura de datos. Ponemos la accesibilidad private para que desde fuera de esta clase
    no puedan acceder a la lista empleados.
     */
    private List<Empleado> empleados = new ArrayList<>();

    // 1. OPERACIONES CRUD

    // CREATE. Guardamos empleados.
    public void guardar(Empleado empleado){

        empleados.add(empleado);

    }

    // READ. Consultamos una lista de empleados, vamos a devolver una lista de empleados.

    public List<Empleado> findAll(){
        return empleados;
    }
}
