package com.company.estructurascontrol;

public class ForEach {

    public static void main(String[] args) {


        /*
        Aquí vemos el ejemplo de un array de tipo String al cual hemos llamado nombres y donde hemos metido
        unos datos de tipo String.
         */

        String[] nombres = {"pepe", "juanito", "ruperta"};

        /*
        A continuación hacemos un bucle ForEach, que tiene la estructura que podemos ver más abajo. Vamos
        a guardar cada dato que sacamos del array en una variable llamada nombre de tipo String.
        La estructura sería tipo de dato, nombre de la variable : y nombre del String al que hace referencia.
         */

        for (String nombre : nombres) {
            System.out.println(nombre);

        }

        /*
        Aquí vemos el ejemplo de un array de tipo int al cual hemos llamado números y donde hemos metido
        unos datos de tipo entero.
         */

        int suma = 0;
        int[] numeros = {1, 7, 12};

        /*
        A continuación hacemos un bucle ForEach, que tiene la estructura que podemos ver más abajo. Vamos
        a guardar cada dato que sacamos del array en una variable llamada numero de tipo int.
        La estructura sería tipo de dato, nombre de la variable, : , y nombre del array al que hace
        referencia.
        En este caso hemos declarado otra variable suma=0 y que va a funcionar como acumulador de los
        valores de nuestro array.
         */

        for (int numero : numeros) {


            suma = suma + numero;
            System.out.println(suma);

        }

        /*
        A continuación hacemos un bucle ForEach, que tiene la estructura que podemos ver más abajo. Vamos
        a guardar cada dato que sacamos del array en una variable llamada número de tipo int.
        La estructura sería tipo de dato, nombre de la variable, : , y nombre del array al que hace
        referencia.
        Aquí simplemente vamos a imprimir por pantalla los índices de nuestro array numeros, que han sido
        guardados en la variable número.
         */

        for (int numero : numeros) {
            System.out.println(numero);
        }


    }
}
