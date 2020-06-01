package xyz;

import java.util.Scanner;

public class Calculadora {

    /* pedir 2 numeros enteros */
    public int
    pedir_numero()
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("ingrese un numero (entero): ");

        return scanf.nextInt();
    }
    /* suma */
    public int
    sumar(int num1, int num2)
    {
        return num1 + num2;
    }
    /* resta */
    public int
    restar(int num1, int num2)
    {
        return num1 - num2;
    }
    /* multiplicacion */
    public int
    mult(int num1, int num2)
    {
        return num1 * num2;
    }
    /* division */
    public int
    dividir(int num1, int num2)
    {
        return num1 / num2;
    }
    /* modulo */
    public int
    mod(int num1, int num2)
    {
        return num1 % num2;
    }
    /* mostrar resultados */
    public void
    mostrar_res(int num1, int num2)
    {
        System.out.printf("la suma es igual a: %d%n", sumar(num1, num2));
        System.out.printf("la resta es igual a: %d%n", restar(num1, num2));
        System.out.printf("la multiplicacion es igual a: %d%n",
                          mult(num1, num2));
        System.out.printf("la division es igual a: %d%n", dividir(num1, num2));
        System.out.printf("el modulo es igual a: %d%n", mod(num1, num2));
    }
}
