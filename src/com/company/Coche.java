package com.company;

/*
Esta sería la estructura de una clase en la mayoría de los casos.
Primero unos atributos, luego unos constructores y por último unos métodos con comportamientos que
puede tener ese objeto o clase.
 */

/*
Podríamos tener una clase normal, o bien, una clase abstracta. Una clase abstracta es una clase común que posee
atributos y métodos, y tiene como mínimo un método abstracto, además puede contener métodos normales.

Esta clase no puede ser instanciada, solo puede heredarse, o sea no se puede usar para crear un objeto. La creación del
objeto se hará a través de sus clases hijas, las cuales están obligadas a implementar los métodos abstractos definidos
en la clase principal.

Para poder implementar los métodos, la subclase debe hacerlo a través del uso de la palabra reservada extends.
Cuando se genera la subclase la misma “extiende” esos comportamientos desde una clase padre, en este caso abstracta y
así el objeto que se generará luego heredará todos los atributos y métodos definidos previamente.

Para definir una clase como abstracta, utilizamos la palabra reservada abstract. Una clase abstracta está restringida
en su uso, no permite crear objetos, para la creación de los mismos se deben heredar las características y métodos a
otra clase, conocida como clase hija o subclase.

Un método abstracto, sólo puede ser usado y estar definido dentro de una clase abstracta.

Se escribiría de la siguiente manera:

public abstract class Coche {
}
 */
public class Coche {

    //Atributos (características que tendría un coche y que pueden variar de un coche a otro. Color, peso...)

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;



    /*
    Constructores (métodos especiales que nos van a permitir crear objetos de la clase Coche)
    El método constructor recibe una serie de parámetros, su nombre es especial, ya que empieza por mayúscula
    y es el mismo nombre de la clase, por eso se sabe que es el método constructor.
    Recibe una serie de parámetros, que son valores que se envían desde fuera de la clase y que son valores
    que queremos asignar dentro de la clase, a los objetos.
    Abajo tenemos dos ejemplos, un constructor que no tiene parámetros, y otro que si los tiene.
     */

    public Coche () {

    }

   public Coche (String color, String fabricante, String modelo, Double peso, Double largo) {

       this.color = color;
       this.fabricante = fabricante;
       this.modelo = modelo;
       this.peso = peso;
       this.largo = largo;

   }

    //Comportamientos (métodos que simbolicen el comportamiento de un coche. Acelerar, frenar, girar...)

    public void acelerar(Integer cantidad) {

       if(cantidad > 0 && cantidad <= 120){
           this.velocidad += cantidad;
       }
    }

    /*
    Tenemos el método ToString que nos va a permitir imprimir a través de la consola los objetos creados a partir
    de esta clase.
     */
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
