package com.company.estructurascontrol;

public class ForLoop {

    public static void main(String[] args) {

    /*
    Esto de abajo es lo que llamamos un bucle for. En el mismo tenemos el primer parámetro que es una variable,
    en este caso hemos puesto i=0 (podría ser cualquier otro nombre, letra....). Es la condición de comienzo.
    Luego tenemos un segundo parámetro que es la condición de parada, en este caso hemos puesto que se
    ejecute algo mientras i sea igual o menor que 10. Y por último tenemos la condición de paso, el cómo
    se va a ir incrementando ese bucle.
    Esto se va a imprimir 11 veces, ya que la condición se cumple 11 veces antes de que la letra i tuviese
    un valor de 11, que es cuando ya no se cumpliría.
     */
        for (int i = 0; i <= 10; i++) {

            System.out.println(i + " Hola Mundo");
        }

        System.out.println("Fin");

        /*
        Aquí vemos el ejemplo de un array de tipo String al cual hemos llamado nombres y donde hemos metido
        unos datos de tipo String.
         */

        String[] nombres = {"pepe", "rafael", "kike", "juanma", "borja", "sergio", "javi", "soraya",
                "andrea", "marta", "elisa", "laura"};

        /*
        A continuación hacemos un bucle for en el que decimos que nos saque por consola todos los elementos
        del array nombres (desde el índice 0 hasta la máxima extensión del array)
         */

        for (int i = 0; i < nombres.length; i++) {

            System.out.println(nombres[i]);
        }

        /*
        A continuación hacemos un bucle for en el que decimos que nos saque por consola todos los elementos
        del array números (desde el índice 0 hasta el índice menor de 4 del array)
         */

        int[] numeros = {1, 7, 6, 12, 15, 4, 9, 125};

        for (int i = 0; i < 4; i++) {

            System.out.println(numeros[i]);
        }

        /*
        A continuación hacemos un bucle for en el cual recorremos un array llamado numeros2 que consta de 3
        índices. Antes hemos declarado una variable llamada suma con valor 0.
        Dentro del bucle for recorremos el array numeros2 y hemos introducido una operación. A la variable
        suma le vamos sumando el valor de cada índice de nuestro array. El resultado será 1 (que sale del
        valor 0 de la variable inicial suma más el valor de nuestro primer índice, que es 1), 8 (que sale
        del nuevo valor de la variable suma que es 1 más nuestro segundo índice, que es 7) y finalmente será 14
        (que sale del valor de nuestra variable, que ya es 8 más el valor de nuestro tercer índice que es 6).
        E imprimimos por consola el valor de la variable suma según va cambiando.
         */

        int suma = 0;
        int[] numeros2 = {1, 7, 6};

        for (int i = 0; i < numeros2.length; i++) {

            suma = suma + numeros2[i];
            System.out.println(suma);
        }
    }
}
