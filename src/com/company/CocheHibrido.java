package com.company;

/*
Tenemos una clase general, o una clase padre que es coche, pero luego podemos tener diferentes tipos de
coches: eléctricos, híbridos, diesel....aquí vamos a crear una clase de coches eléctricos.
Queremos que muchas de las propiedades de la clase coche, se hereden en esta nueva clase. Para ello
tenemos la palabra reservada en Java "extends". Con la palabra extends conseguimos que la clase CocheElectrico
herede de la clase padre Coche, ya que hay muchos atributos o métodos que pueden ser comunes a ambos.
 */

public class CocheHibrido extends Coche{

    //Aquí estamos agregando un atributo que no tuviese la clase padre, la clase Coche. Por ejemplo.
    String motorHibrido;

    /*
    Constructores (métodos especiales que nos van a permitir crear objetos de la clase Coche)
    El método constructor recibe una serie de parámetros, su nombre es especial, ya que empieza por mayúscula
    y es el mismo nombre de la clase, por eso se sabe que es el método constructor.
    Recibe una serie de parámetros, que son valores que se envían desde fuera de la clase y que son valores
    que queremos asignar dentro de la clase, a los objetos.
    Abajo tenemos dos ejemplos, un constructor que no tiene parámetros, y otro que si los tiene y que le estamos
    pasando el parámetro motorHibrido que habíamos invocado en las lineas de arriba.
     */
    public CocheHibrido () {
    }

    public CocheHibrido (String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }

    /*
    Aquí tendríamos un método ToString, que incluya la nueva propiedad que pusimos arriba,
    el String motorHibrido
     */
    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }


}
