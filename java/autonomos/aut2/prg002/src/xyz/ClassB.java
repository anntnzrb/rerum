package xyz;

import java.util.Scanner;

/**
 *
 * solicitar el ingreso de 5 numeros enteros y calcular el promedio realice
 * este ejercicio usando while
 * @author j.a gonzalez
 */

public class ClassB {
    public static void
    main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        int n;
        double promedio = 0;

        int i = 0;
        while (i < 5) {
            System.out.print("ingrese un numero: ");
            n = Integer.parseInt(scanf.nextLine());
            promedio += n;
            ++i;
        }

        promedio /= 5;
        System.out.printf("el promedio de los 5 numeros es: %.2f%n", promedio);

        /* cerrar scanner */
        scanf.close();
    }
}
