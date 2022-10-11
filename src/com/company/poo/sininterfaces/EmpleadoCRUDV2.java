package com.company.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/*
Aquí vamos a simular que después de un tiempo nuestra empresa cambiase de sistema para tener visionados a sus
empleados, o hemos cambiado el método, o la tecnología es nueva, o mil motivos que pueden hacer que la version
1 que teníamos antes ya no valga y el nuevo desarrollador tenga que crear una versión 2 del antiguo sistema.
Hacer estos sin implementar interfaces sería un trabajo complicado, ya que tendríamos que cambiar medio Main
para qye funcionase.
La solución a esto pasa por crear una interface, que va a recibir diferentes versiones, pero estas versiones
no van a afectar al Main porque entre el Main y las versiones, se encuentra la interface, que va a ser quien
se dedique a pasar la información actualizada al Main sin que tengamos que modificar nada en el mismo.
 */

public class EmpleadoCRUDV2 {

    public List<Empleado> recuperarEmpleados(){

        List<Empleado> empleados = new ArrayList<>();
        return empleados;
    }

}