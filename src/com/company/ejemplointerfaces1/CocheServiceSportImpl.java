package com.company.ejemplointerfaces1;

import com.company.poo.ejemplo2.Coche;
import com.company.poo.ejemplo2.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche deportivo");
        return new CocheElectrico();
    }


}
