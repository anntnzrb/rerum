package xyz;

public class Main {

    public static void
    main(String[] args)
    {
        /* declaracion de variables */
        int num1, num2;

        /* instanciar objeto */
        Calculadora op1 = new Calculadora();

        /* pedir 2 numeros enteros */
        num1 = op1.pedir_numero();
        num2 = op1.pedir_numero();

        /* realizar operaciones */
        op1.sumar(num1, num2);
        op1.restar(num1, num2);
        op1.mult(num1, num2);
        op1.dividir(num1, num2);
        op1.mod(num1, num2);

        /* mostrar resultados */
        op1.mostrar_res(num1, num2);
    }
}
