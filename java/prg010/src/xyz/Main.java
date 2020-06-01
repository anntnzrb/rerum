package xyz;

import java.util.Scanner;

public class Main {

    public static void
    main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        double lado1, lado2;

        Cuadrilatero c1;

        System.out.print("ingresa el lado 1: ");
        lado1 = scanf.nextDouble();
        System.out.print("ingresa el lado 2: ");
        lado2 = scanf.nextDouble();

        c1 = (lado1 == lado2) ? new Cuadrilatero(lado1) : new Cuadrilatero(
            lado1, lado2);

        c1.setPerimetro(lado1, lado2);
        c1.setArea(lado1, lado2);
        System.out.printf("perimetro: %f %n", c1.getPerimetro());
        System.out.printf("area: %f %n", c1.getArea());
    }
}
