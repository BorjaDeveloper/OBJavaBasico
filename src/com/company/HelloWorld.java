package com.company;

/*
    Modificador de la accesibilidad:

    - private: Los métodos o los miembros de datos declarados como privados solo son accesibles dentro
    de la clase en la que se declaran. Cualquier otra clase del mismo paquete no podrá acceder a estos miembros.
    Las clases e interfaces no se pueden declarar como privadas (private).

    - public: El modificador de acceso público tiene el alcance más amplio entre todos los demás modificadores
    de acceso. Las clases, métodos o miembros de datos que se declaran como públicos son accesibles desde
    cualquier lugar del programa. No hay restricciones en el alcance de los miembros de datos públicos.

    - protected: Los métodos o miembros de datos declarados como protected son accesibles dentro del mismo
    paquete o sub-clases en paquetes diferentes.
*/

public class HelloWorld {

/*
 El método main() es el punto de entrada de la aplicación, es decir, es el punto en el que comienza la
 ejecución de esta. Es por ello que ha de ser public y static.
 - public: Un método público es accesible desde fuera de la clase.
 - static: Un método estático es aquel que se puede ejecutar sin una instancia de la clase.
 Al ser el punto de entrada, ha de ser accesible desde fuera de la clase en la que se encuentra. Además,
 al ser lo primero que se ejecuta, ha de ser posible su ejecución antes de instanciar un objeto.

 Como consecuencia directa de ser la primera línea de código que se ejecuta, no tiene sentido que tenga
 un tipo de devolución distinto de void, ya que no hay un código anterior que pueda hacer algo con ese valor.
 El método main() en Java siempre tiene un tipo de devolución void.
 */

    public static void main(String[] args) {

        System.out.println("Hola Mundo desde clase hello world");

        System.out.println("Adios mundo desde la clase hello world");
    }
}
