package com.company.tiposdatos;

public class Operadores {

    public static void main(String[] args){

      //Operadores aritméticos. Suma, resta, división, multiplicación y resto.

        //Aquí hemos creado unas variables de tipo entero y las hemos dado un valor.

        int number1 = 1;
        int number2 = 2;
        int number3 = 56;
        int number4 = 51;

        /*
        Aquí hemos creado una variable, por ejemplo resultado, donde guardamos el valor resultante de
        sumar las variables number1 y number2. Por ejemplo.
         */

        int resultado = number1 + number2;
        int resultado2 = number2 - number1;
        int resultado3 = number3 * number2;
        int resultado4 = number4 - number1;


        //Aquí estamos imprimiendo por pantalla las diferentes variables que hemos creado

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

      //Operadores lógicos, de relación, de comparación, booleanos, etc...

        /*
        Operadores de comparación como:
        < menor que
        > mayor que
        <= menor o igual que
        >= mayor o igual que
        == igual que
       */

        boolean resultado5 = number1 > number2; //false
        boolean resultado6 = number1 < number2; //true

        /*
        Operadores Lógicos, que sirven para evaluar dos o mas condiciones. Serían:
        and &
        or ||
         */

        boolean resultado7 = number1 < 15 && number1 > 0;

        System.out.println(resultado7);

      //Operadores de asignación

      /*
      =
      +=
      -=
      /=
      *=
      %=
      === IMPORTANTE, EN JAVA NO EXISTE!!
      */

      //Operadores de incremento o decremento

      /*
      ++
      --
      */

      //Concatenación: seria el operador +, cuando queremos concatenar dos cadenas de texto.



    }
}
