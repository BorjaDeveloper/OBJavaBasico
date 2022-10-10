package com.company;

/*
Tenemos una clase general, o una clase padre que es coche, pero luego podemos tener diferentes tipos de
coches: eléctricos, híbridos, diesel....aquí vamos a crear una clase de coches eléctricos.
Queremos que muchas de las propiedades de la clase coche, se hereden en esta nueva clase. Para ello
tenemos la palabra reservada en Java "extends". Con la palabra extends conseguimos que la clase CocheElectrico
herede de la clase padre Coche, ya que hay muchos atributos o métodos que pueden ser comunes a ambos.
 */

public class CocheElectrico extends Coche {

    //Aquí estamos agregando un atributo que no tuviese la clase padre, la clase Coche. Por ejemplo.
    String motorElectrico;

    /*
    Constructores (métodos especiales que nos van a permitir crear objetos de la clase Coche)
    El método constructor recibe una serie de parámetros, su nombre es especial, ya que empieza por mayúscula
    y es el mismo nombre de la clase, por eso se sabe que es el método constructor.
    Recibe una serie de parámetros, que son valores que se envían desde fuera de la clase y que son valores
    que queremos asignar dentro de la clase, a los objetos.
    Abajo tenemos dos ejemplos, un constructor que no tiene parámetros, y otro que si los tiene y que le estamos
    pasando el parámetro motorElectrico que habíamos invocado en las lineas de arriba.
     */

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {

        this.motorElectrico = motorElectrico;
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

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,
                          String motorElectrico) {

        /*
        A este constructor le hemos pasado los parámetros de la clase padre, y a mayores, tambien los parámetros
        que teníamos exclusivos de esta clase, que realmente era solo motorelectrico.
         */


        /*

        Aquí estamos asignando todos estos valores, pero esto sería duplicar código, ya que lo tenemos en la clase
        padre. En vez de hacer esto, utilizamos el método super para invocar a un constructor de la clase superior.
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
         */


        super(color, fabricante, modelo, peso, largo);//Heredamos estos valores de la clase padre, la clase superior.
        this.motorElectrico = motorElectrico;//A mayores también asignamos este valor que proviene de esta misma clase.
    }

    /*
    Estamos sobreescribiendo el método acelerar de la clase padres Coche para modificar su comportamiento.
    La palabra reservada Override va a verificar si existe un método llamado así en la clase padre, en este caso
    en la clase Coche.
    Con la palabra súper vamos a heredar el método de la clase padre y con la línea Integer, estamos modificando
    esta cantidad que va a variar; en este caso lo estamos modificando solo para esta clase.
     */
    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        //Invocamos al método original, pero ajustando la cantidad a lo que queremos que funcione en esta clase.
        super.acelerar(cantidadAjustada);
    }

    /*
        Aquí tendríamos un método ToString, que incluya la nueva propiedad que pusimos arriba,
        el String motorElectrico
         */
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
