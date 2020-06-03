package xyz;

/**
 * imprimir los multiplos de de 5 en el rango del 1 al 50
 *
 * ejemplo de salida:
 * 5 10 15 20 25 30 35 40 45 50
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class EjercicioForPropuesto {
    public static void
    main(String[] args)
    {
        for (int i = 1; i <= 50; ++i) {
            if (i % 5 == 0)
                System.out.printf("%d%n", i);
        }
    }
}
