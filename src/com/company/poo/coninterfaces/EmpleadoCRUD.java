package com.company.poo.coninterfaces;

import com.company.poo.sininterfaces.Empleado;

import java.util.List;

/*
Las interfaces solo declaran métodos, no los implementan. Los implementan las implementaciones de las
interfaces, es decir, unas clases que habrá que crear después.
Hemos creado por ejemplo, 3 métodos. Un método para guardar empleados, un método list que nos va a sacar una
lista con todos los empleados, y un método para borrar empleados.
Una interface actúa como un contrato, dice lo que hay que hacer, pero no lo hace. Esto proporciona una manera
común de hacer las cosas entre todas las clases que implementen esta interface.
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
