package com.company;

public class StringMain {

    public static void main(String[] args) {

        //Diferentes métodos de la clase String

        /*
        - length(): es de tipo entero, y devuelve el número de caracteres que hay en una cadena.
        - startsWith(""): es de tipo boleano y chequea si la cadena comienza con el prefijo informado a partir
        del índice especificado.
        - endsWith(""): de tipo boleano y chequea si la cadena termina con el sufijo especificado.
        - indexOf(""): de tipo entero y devuelve el índice dentro de la cadena de la primera coincidencia del
        caracter especificado.
        - subString(int inicio, int final): es de tipo cadena y devuelve una nueva cadena que es una subcadena de
        la cadena delimitada por el inicio y final informados.
        - trim(): es de tipo cadena y devuelve una copia de la cadena donde se omiten los espacios.
        - equals(Objeto unObjeto): de tipo boleano y compara la cadena con el objeto especificado.
        - compareTo
         */

        String mensaje = "Hola Mundo";

        System.out.println(mensaje.length());
        /*
        Esto nos devuelve la longitud en caracteres de la variable String de arriba que hemos nombrado como mensaje.
        En este caso nos devolverá un 10, ya que la frase que está almacenada en la variable mensaje (Hola Mundo),
        tiene 10 caracteres (9 + el espacio).
        Si ese dato que nos va a devolver queremos almacenarlo en otra variable, se haría como indica abajo.
         */

        Integer numCaracteres = mensaje.length();
        System.out.println(numCaracteres);

        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);

        String otro = "hola mundos";
        if (mensajeMay.equals(otro)) {

            System.out.println("Verdadero");


        }else
            System.out.println("Falso");
    }
}
