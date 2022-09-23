package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {

        /*
        La Interface Map (java.io.Map) en Java, nos permite representar una estructura de datos para almacenar
        pares "clave/valor"; de tal manera que para una clave solamente tenemos un valor. Esta estructura de
        datos también es conocida en otros lenguajes de programación como "Diccionarios".
         */

        /*
        Java permite inicializar un mapa al momento de crearlo y declararlo. Es una forma concisa de crear
        Map en Java.
         */

        Map <String, String> personas = new HashMap<>();

        personas.put("46891034z", "Borja Rodriguez");
        personas.put("46891035z", "Sergio Rodriguez");
        personas.put("46891036z", "Maria Rodriguez");
        personas.put("46891037z", "Andrea Rodriguez");

        System.out.println(personas);

        /*
        Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de
        cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java
        como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos


        Map<Integer, String> map = new HashMap<Integer, String>()
        {
            {
                put(1, "Red");
                put(2, "Green");
                put(3, "Blue");
                put(4, "White");
            }
        };

        System.out.println(map);

        */

        /*
        Los principales métodos para trabajar con los map son:
        nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(K clave, V valor); // Añade un elemento al Map
        nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null'
        si la clave no existe
        nombreMap.clear(); // Borra todos los componentes del Map
        nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map
         */

        /*
        Otro elemento importante a la hora de trabajar con los Maps (aunque no lo es tanto como a la hora de
        trabajar con los ArrayList) son los "Iteradores" (Iterator). Los Iteradores sirven para recorrer los Map
        y poder trabajar con ellos. Los Iteradores solo tienen tres métodos que son el “hasNext()” para comprobar
        que siguen quedando elementos en el iterador, el“next()”  para que nos de el siguiente elemento del iterador;
        y el “remove()” que sirve para eliminar el elemento del Iterador. En realidad se puede prescindir de los
        iteradores para trabajar con los Map ya que la gran ventaja de los Map frente a los ArrayList, es que estos
        tienen una clave asociada al objeto y se les puede buscar por la clave, aunque nunca esta de más saber
        utilizar los iteradores para manejar los Map.
         */

        //Esto nos va a permitir iterar unicamente sobre las claves.
        for(String key : personas.keySet()){
            System.out.println(key);
        }

        //Esto nos va a permitir iterar unicamente sobre los valores.
        for (String value : personas.values()){
            System.out.println(value);
        }

        //Esto nos va a permitir iterar sobre las claves y sobre los valores.
        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        /*
        Antes de seguir con ejemplos, os habréis dado cuenta que hemos empezado la entrada diciendo que Map es
        una Interface y por tanto se deben de implementar los métodos de la interface. Java ya tiene
        implementadas varias "clases Map". No vamos a explicar todas, pero si las tres que consideramos más
        importantes y útiles para que veáis la diferencia como son la clase "HashMap", "TreeMap" y "LinkedHashMap".
        La diferencia principal de estas 3 clases es la forma o el orden en las que guardan los valores en el Map.
         */

        /*
        HashMap: Los elementos que inserta en el map no tendrán un orden específico. No aceptan claves duplicadas
        ni valores nulos.
        TreeMap: El Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores enteros
        (como luego veremos), los ordena de menos a mayor.
        LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando; es decir, que
        no tiene una ordenación de los elementos como tal, por lo que esta clase realiza las búsquedas de
        los elementos de forma más lenta que las demás clases.
         */




    }
}
