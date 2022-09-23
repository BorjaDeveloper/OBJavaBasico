package com.company;

/*
Vamos a crear un objeto
 */

public class CocheMain {

    public static void main(String[] args) {

        /*
        Estamos creando un objeto llamado cocheObj y pasamos los parámetros del constructor.
        También se conoce como instancia, esta instanciando una clase.
        Es como que en la clase coche teníamos una plantilla, y ahora estamos creando todos los objetos o
        coches que tenemos en la realidad.
         */
        Coche cocheObj = new Coche("rojo", "honda", "civic", 1430.45,5.4);

        /*
        Aquí estamos ejecutando un método o un comportamiento. Podría ser cualquiera que hubiésemos creado ya.
        Aquí estamos pasando un número, una cantidad, que se la estamos sumando al atributo velocidad.
         */
        cocheObj.acelerar(50);

        /*Con este código estamos imprimiendo por consola todos los atributos de nuestro objeto, así como
        podríamos modificar cualquiera de ellos en cualquier momento, como indicamos más abajo.
         */
        System.out.println(cocheObj);

        cocheObj.peso = 1425.65;

        System.out.println(cocheObj);

        /*
        Estamos creando el objeto llamado cocheElectrico pertenececiente a la clase Cocheelectrico y pasamos
        los parámetros del constructor. También se conoce como instancia, esta instanciando una clase.
         */
        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo Motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "honda";
        cocheElectrico.modelo = "civic";
        cocheElectrico.peso = 3.6;
        cocheElectrico.largo = 3.0;

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("granate", "honda", "civic",
                5.0, 6.3, "motor2.0");

        System.out.println(cocheElectrico2);

        /*
        Estamos creando el objeto llamado cocheHibrido pertenececiente a la clase CocheHibrido y pasamos
        los parámetros del constructor. También se conoce como instancia, esta instanciando una clase.
         */
        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheHibrido.motorHibrido = "Ejemplo Motor";
        cocheHibrido.color = "azul";
        cocheHibrido.fabricante = "honda";
        cocheHibrido.modelo = "civic";
        cocheHibrido.peso = 5.0;
        cocheHibrido.largo = 4.2;

        System.out.println(cocheHibrido);

        /*
        Vamos a ver como sobreescribir un método. En este caso la clase Coche tiene un método llamado acelerar,
        pero la clase cocheElectrico no la tiene, pero la hereda de la clase Coche al utilizar la palabra extends.
        Con lo cual debería funcionar y modificarse si colocamos la línea de código inferior.
        Funciona, pero funciona tal cual viene planteado en la clase padre Coche. Si queremos modificar su
        comportamiento, debemos irnos a la clase CocheElectrico y sobreeescribirlo allí si queremos modificar
        su funcionamiento.
         */

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);
    }
}
