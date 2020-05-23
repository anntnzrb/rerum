import java.util.Scanner;

public class Main {
    public static void
    main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int iN_empleados;
        final double SUELDO_BASICO = 375.0;
        double dBonus;
        double dTotal = 0;

        System.out.println("ingrese el numero de empleados");
        iN_empleados = scanf.nextInt();

        double[] arrSueldo = new double[iN_empleados];

        for (int i = 0; i < iN_empleados; i++) {
            System.out.printf("ingrese el salario del empleado '%d' %n",
                              (i + 1));
            arrSueldo[i] = scanf.nextDouble();
        }
        scanf.close();

        for (int i = 0; i < iN_empleados; i++) {
            /*
             * if (arrSueldo[i] <= SUELDO_BASICO ) {
             *  dBonus = 100;
             * } else {
             *  dBonus = (arrSueldo[i] * 0.15);
             * }
             */

            dBonus =
                (arrSueldo[i] <=
                 SUELDO_BASICO) ? (100) : (arrSueldo[i] * 0.15);


            System.out.printf("empleado: '%d' $%.4f bonus = %.4f%n",
                              i + 1, arrSueldo[i], dBonus);
            dTotal = arrSueldo[i] + dBonus;
            System.out.printf("total a pagar: %.4f%n", dTotal);
        }
    }
}
