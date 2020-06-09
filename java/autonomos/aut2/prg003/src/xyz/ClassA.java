package xyz;

import java.util.Scanner;

/**
 * escribir un programa que realice lo siguiente:
 * solicite el ingreso de las 3 notas de una materia obtenidas por un
 * estudiante durante un semestre en espol
 * los datos que debe ingresar son:
 *  - número de matrícula
 *  - nota primer parcial
 *  - nota segundo parcial
 *  - nota mejoramiento
 * asuma que los datos ingresados son valores correctos(números enteros en el
 * rango apropiado)
 *  - deberá mostrar un mensaje si el estudiante aprueba o no la materia.
 *  recuerde que un estudiante aprueba una materia si suma 120 puntos en dos
 *  evaluaciones
 *  - luego del ingreso preguntará si desea realizar más ingresos. deberá
 *  volver a solicitar los datos hasta que escriba n
 *
 * @author j.a gonzalez
 */

public class ClassA {
    public static void
    main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        String matricula;
        String opcion = null;
        int n1, n2, n3;
        double total;

        do {
            /* pedir datos */
            System.out.print("ingrese su matricula: ");
            matricula = scanf.nextLine();
            System.out.print("ingrese su nota del primer parcial: ");
            n1 = Integer.parseInt(scanf.nextLine());
            System.out.print("ingrese su nota del segundo parcial: ");
            n2 = Integer.parseInt(scanf.nextLine());
            System.out.print("ingrese su nota de mejoramiento: ");
            n3 = Integer.parseInt(scanf.nextLine());

            /* calcular el total con las 2 notas mas altas */
            if (n1 < n2 && n1 < n3)
                total = n2 + n3;
            else if (n2 < n1 && n2 < n3)
                total = n1 + n3;
            else
                total = n1 + n2;

            /* print aprovado o reprovado */
            System.out.printf("usted ha %s la materia%n",
                              (total >= 120) ? ("aprovado") : ("reprovado"));

            /* continuar? */
            System.out.print("desea continuar (S/N):");
            opcion = scanf.nextLine();
        } while (opcion.toUpperCase().equals("S"));

        /* cerrar scanner */
        scanf.close();
    }
}
