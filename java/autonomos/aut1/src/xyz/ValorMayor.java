package xyz;

/**
 *  mostrar cual de los dos numeros ingresados es mayor
 *
 * @author j.a gonzalez
 */

public class ValorMayor {
    /**
     *
     * @param args [0] y [1]: número 1 y número 2 correspondientemente
     */
    public static void
    main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.printf(
            "Los números ingresados son %s y %s y el mayor es %s%n", n1, n2,
            (n1 > n2) ? n1 : n2);
    }
}
