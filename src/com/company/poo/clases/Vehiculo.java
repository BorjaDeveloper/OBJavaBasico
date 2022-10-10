package com.company.poo.clases;

public class Vehiculo {

    /*
    Creamos una clase llamada vehículo. A partir de ella podremos generar objetos, es decir, vehículos en
    concreto. Por ejemplo, un Toyota Prius, un Honda Civic, etc.
    Dentro del código vamos a definir como es la estructura para esta plantilla.
     */

    // 1. ATRIBUTOS (hemos puesto protected para que sean visibles desde fuera de esta clase)

    protected String fabricante;
    protected String modelo;
    /*
    Aquí hemos puesto la D de double en mayúscula porque podemos elegir entre un dato primitivo o
    dato envoltorio, que permite que los valores puedan ser nulos. Esto sobre todo es interesante cuando
    trabajamos con bases de datos y queremos que un campo pueda tener un valor nulo.
     */
    protected Double cc;
    protected int year;
    protected boolean sport; // Una variable boleana que nos diga si un coche tiene modo sport o no.
    protected int speed;

    /*
    Cuando las clases se hacen muy complejas, por ejemplo esta clase coche, ya que un coche podría tener
    miles de atributos, podríamos optar por realizar composición. Es decir, empezar a relacionar clases,
    unas con otras. Para ello podríamos en el ejemplo crear la clase Motor con un atributo de tipo motor.
    Así en la clase motor yo solo voy a tener atributos referidos al motor.
    Es decir vamos a generar una clase de tipo motor y que yo aquí lo utilizo como un atributo.
    Esto hace que cada vez que creo un objeto vehículo voy a crear un motor asociado a ese vehículo.
     */

    protected Motor motor;


    // 2. CONSTRUCTORES

    /*
    Son métodos, funciones, especiales, que van a permitir construir los objetos a partir de esta plantilla.
    Con un método constructor voy entonces a poder crear esos objetos a partir de esta plantilla o clase.

    El método constructor recibe una serie de parámetros, su nombre es especial, ya que empieza por mayúscula
    y es el mismo nombre de la clase, por eso se sabe que es el método constructor.
    Los constructores deben ser public (para que sean visibles desde fuera de la clase. Public es un
    modificador de visibilidad.), luego reciben un nombre que debe ser el mismo que la clase, a continuación
    paréntesis donde dentro podrían recibir parámetros o no.
    Podemos crear todos los constructores de una clase que necesitemos (sin parámetros, con 2 parámetros, con
    3 parámetros....lo que queramos).
    Aquí vamos a asignar los valores de los parámetros y con la palabra reservada this, los vamos a pasar
    como atributos de la clase.
    */

    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modelo, Double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    // 3. MÉTODOS (nos van a permitir definir comportamientos, lo que hacen estos objetos).

    public void acelerar(int quantity) {

        if(quantity > 0 && quantity <= 120){
            this.speed += quantity;
        }
    }

    /*
    Tenemos el método ToString que nos va a permitir imprimir a través de la consola los objetos creados a partir
    de esta clase.
     */
    @Override
    public String toString() {
        return "Coche{" +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc='" + cc + '\'' +
                ", year='" + year + '\'' +
                ", sport='" + sport + '\'' +
                ", velocidad=" + speed +
                '}';
    }
}
