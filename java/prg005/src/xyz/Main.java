package xyz;

import java.util.Scanner;

public class Main {
    public static void
    main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        int n_empleados;
        final double SUELDO_BASICO = 375.0;
        double bonus;
        double total = 0;

        System.out.println("ingrese el numero de empleados");
        n_empleados = scanf.nextInt();

        double[] sueldo = new double[n_empleados];

        for (int i = 0; i < n_empleados; i++) {
            System.out.printf("ingrese el salario del empleado '%d' %n",
                              (i + 1));
            sueldo[i] = scanf.nextDouble();
        }
        scanf.close();

        for (int i = 0; i < n_empleados; i++) {
            /*
             * if (sueldo[i] <= SUELDO_BASICO ) {
             *  bonus = 100;
             * } else {
             *  bonus = (sueldo[i] * 0.15);
             * }
             */

            bonus =
                (sueldo[i] <=
                 SUELDO_BASICO) ? (100) : (sueldo[i] * 0.15);

            System.out.printf("empleado: '%d' $%.4f bonus = %.4f%n",
                              i + 1, sueldo[i], bonus);
            total = sueldo[i] + bonus;
            System.out.printf("total a pagar: %.4f%n", total);
        }
    }
}
