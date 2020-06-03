package xyz;

/**
 * una linea de autobuses cobra un minimo de $20 por persona y trayecto
 * si el trayecto es mayor de 200 km el ticket tiene un recargo de 0.10
 * por km adicional. sin embargo, para trayectos de mas de 400 km el ticket
 * tiene un descuento del 15 %. por otro lado, para grupos de 3 o mas personas
 * el billete tiene un descuento del 10 % con ello se debe calcular tanto el
 * precio del billete individual como el total a pagar si viaja mas de una
 * persona
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class EjercicioFinalPropuesto {
    /**
     * @param args [0]: distancia ; [1] numero personas
     */
    /* FIXME: 'terminar' [Wed, 03 Jun @ 15:20]  */
    public static void
    main(String[] args)
    {
        int distancia = Integer.parseInt(args[0]);
        int personas = Integer.parseInt(args[1]);
        double ticket = 20;

        if (personas >= 3) {
            /* */
            ticket *= 0.90;
        } else {
            /* */
        }
    }
}
