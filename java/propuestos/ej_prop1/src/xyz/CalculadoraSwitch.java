package xyz;

/**
 * construir un programa que simule el funcionamiento de una calculadora
 * que puede realizar las cuatro operaciones aritmeticas basicas
 * (suma, resta, producto y division) con valores numericos enteros
 * el usuario debe especificar la operacion con el primer caracter del
 * primer parametro de la linea de comandos: S o s para la suma, R o r
 * para la resta, P, p, M o m para el producto y D o d para la division
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class CalculadoraSwitch {
    /**
     * recibe 3 parametros
     * @param args [0]: operacion ; [1] y [2]: operando 1 y 2 respectivamente
     */
    public static void
    main(String[] args)
    {
        String operacion = args[0];
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);

        switch (operacion) {
        case "S":
        case "s":
            System.out.printf("Suma entre %d y %d: %d%n", n1, n2, n1 + n2);
            break;
        case "R":
        case "r":
            System.out.printf("Resta entre %d y %d: %d%n", n1, n2, n1 - n2);
            break;
        case "M":
        case "m":
            System.out.printf("Multiplicacion entre %d y %d: %d%n",
                              n1, n2, n1 * n2);
            break;
        case "D":
        case "d":
            System.out.printf("Division entre %d y %d: %d%n", n1, n2, n1 / n2);
            break;
        }
    }
}
