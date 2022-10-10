package com.company.poo.herencias;

//Esta línea es porque como la clase motocicleta está en un paquete diferente a Vehículo, hay que importar.
import com.company.poo.clases.Motor;
import com.company.poo.clases.Vehiculo;

/*
Tenemos una clase general, o una clase padre que es Vehículo, pero luego podemos tener diferentes tipos de
vehículos: camiones, motocicletas, coche....aquí vamos a crear una clase coche.
Realmente llegamos al concepto de herencia. Si creámos clases como coche, motocicleta o camión, estas nuevas
clases heredan de la clase padre que sería vehículo, con lo cual hay muchos atributos que serán comunes, pero
también muchos otros, por ejemplo baúl, que lo puede tener una motocicleta y no un camión.
Para ello tenemos la palabra reservada en Java "extends". Con la palabra extends conseguimos que la clase
coche, por ejemplo, herede de la clase padre Vehículo.
 */
public class Coche extends Vehiculo {

    int numPuertas;

    public Coche() {
    }

    public Coche(String fabricante, String modelo, Double cc, int year, boolean sport, int speed,
                 Motor motor, int numPuertas) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.numPuertas = numPuertas;
    }

    /*
    Esta palabra super se utiliza en el lenguaje Java para invocar al método constructor de una clase superior
    (clase padre) de la cual queremos utilizar el mismo tipo de parametrización, entonces esta palabra sube de
    categoría y pasa a ser el método super().

    El método super nos permite reutilizar bloques de código sin tener que volver a escribir lo mismo, invocando al
    constructor de una clase superior, desde una clase hija y hacia una clase padre.

    Cuando queremos acceder a los atributos y/o métodos de una clase superior, utilizamos la herencia
    (una clase hija “hereda” de una clase padre sus atributos y métodos), y creamos una nueva clase que es extendida
    de la clase principal, cuya primera línea del constructor debe ser siempre el método super().

    Así como con la palabra this, hacemos referencia a la instancia actual de un objeto, con la palabra super
    hacemos referencia a su clase padre. Además podemos usar la palabra super para inicializar atributos de la
    clase superior de la que se extiende con la palabra extends.
     */
}
