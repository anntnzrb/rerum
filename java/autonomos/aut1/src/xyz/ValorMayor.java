package xyz;

import java.util.Scanner;

public class ValorMayor {

    public static void
    main(String[] args)
    {
        /* vars */
        int n1, n2;

        /* scanner  */
        Scanner scanf = new Scanner(System.in);

        /* preguntar */
        System.out.print("ingrese el primer número: ");
        n1 = Integer.parseInt(scanf.nextLine());
        System.out.print("ingrese el segundo número: ");
        n2 = Integer.parseInt(scanf.nextLine());

        /* resultados */
        System.out.printf(
            "Los números ingresados son %s y %s y el mayor es %s%n", n1, n2,
            (n1 > n2) ? n1 : n2);
    }
}
