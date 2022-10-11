package com.company.ejemplointerfaces1;

import com.company.poo.ejemplo2.Coche;

/*
Una interfaz de Java es un mecanismo que tiene este lenguaje de programación para enunciar un conjunto de
especificaciones y comportamiento que otras clases van a implementar.
Dentro de cada una de las interfaces de Java puedes encontrar constantes estáticas y métodos abstractos. Esto quiere
decir que si revisas el código de la interfaz solo verás los nombres de los métodos.
Estos nombres probablemente te den una pista de lo que los métodos harán, pero no verás el código o cómo lograrán
hacer eso. Es como una especie de plantilla que servirá de modelo para las clases que implementen los métodos.

Si ya tienes conocimiento sobre el concepto de herencia en Java, posiblemente estarás pensando que esto es igual, y de
hecho es muy similar. Sin embargo, en Java no existe la herencia múltiple.
Esto quiere decir que una clase solo puede heredar de una superclase, no de varias. Por esta razón entra en escena
el concepto de interfaces.
Entonces, una clase podrá heredar métodos de varias interfaces en Java y con este mecanismo, el lenguaje logra ofrecer
una mayor abstracción a los programadores que lo utilizan.

Para declarar una interfaz en Java puedes guiarte por este esquema:

public interface nombredelainterface{
    public void nombredelmetodoabstracto();
    public void nombredeotrometodoabstracto();
}

Ahora bien, cuando llegue el momento de implementar los métodos de la interface, se verá como sigue:

class nombredelaclase implements nombredelainterface{
    public void nombredelmetodoabstracto(){
        código del metodo
    }
    public void nombredelotrometodoabstracto(){
        código del metodo
    }
}

Finalmente, cuando vamos a crear una instancia:

class Main {
    public static void main(String[] args){
        nombredelaclase miclase = new nombredelaclase();
        miclase.nombredelmetodoabstracto();
        miclase.nombredelotrometodoabstracto();
    }
}

Resumiendo entonces, la palabra reservada para crear interfaces es interface y la palabra reservada necesaria para
implementar los métodos abstractos de esa interface es implements.
Cuando una clase implementa una o más interfaces, usarás la palabra reservada implements, y vas a separar por comas
el nombre de las interfaces.
Si estás enunciando los métodos abstractos de la interface, no es necesario que utilices la palabra reservada public,
ya que por defecto estos métodos son de acceso público.
 */

public interface CocheService {


    /*
    Una interface entonces va a definir un contrato, va a decir lo que hay que hacer. Luego una clase dirá el cómo
    lo va a hacer.
    Simplemente, declaramos un o unos métodos que después una clase los tendrá que implementar.
     */

    public Coche crearCocheDemo();
    /*
    Aquí estamos creando un método de la clase Coche. Este método no tiene cuerpo. Un método de interface
    nunca tiene cuerpo. Para implementar esta Interface vamos a crear dos clases, coche clasico y coche sport.
    */

 }
