package xyz;

import java.util.Scanner;

/**
 * lea la cantidad de kWh que ha consumido una familia y el precio por cada
 * kWh. si la cantidad es mayor a 700, incremente el precio en 5% para el
 * exceso de kWh sobre 700. muestre el valor total a pagar
 *
 * @author j.a gonzalez
 */

public class ClassA {
    public static void
    main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("ingrese la cantidad de kWh consumida: ");
        int kwh = Integer.parseInt(scanf.nextLine());
        System.out.print("ingrese el precio por kWh: ");
        double precio_kwh = Double.parseDouble(scanf.nextLine());
        int exceso;
        double total;

        if (kwh > 700) {
            exceso = kwh - 700;
            total = (precio_kwh * 700) + exceso * (precio_kwh * 1.05);
        } else
            total = precio_kwh * kwh;

        System.out.printf("valor total a pagar: $ %.2f%n", total);

        /* cerrar scanner */
        scanf.close();
    }
}
