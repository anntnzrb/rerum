package xyz;

import java.util.Scanner;

/**
 * construir un programa que simule el juego de la adivinanza de un numero
 * el ordenador debe generar un numero aleatorio entre 1 y 100 y el usuario
 * tiene cinco oportunidades para acertarlo. despues de cada intento el
 * programa debe indicarle al usuario si el numero introducido por el es
 * mayor, menor o igual al numero a adivinar, y el numero de intentos
 * restantes
 *
 * @author j.a gonzalez
 */

public class ClassA {
    public static void
    main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        short rd_int = (short) (100 * Math.random() + 1);
        int vidas = 5;
        int n;

        do {
            /* pedir numero */
            System.out.print("ingrese un numero entero: ");
            n = Integer.parseInt(scanf.nextLine());

            /* comparar */
            if (n > rd_int)
                System.out.printf("NO: %d es mayor al numero a adivinar%n", n);
            else if (n < rd_int)
                System.out.printf("NO: %d es menor al numero a adivinar%n", n);
            else {
                System.out.printf("SI: %d es igual al numero a adivinar%n", n);
                break;
            }

            /* restar vidas y mostrar  */
            --vidas;
            System.out.printf("tiene %d vidas restantes%n", vidas);
        } while(vidas > 0);

        /* cerrar scanner */
        scanf.close();
    }
}
