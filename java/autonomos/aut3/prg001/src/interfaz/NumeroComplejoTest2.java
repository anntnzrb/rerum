package interfaz;

/* system  */
import java.util.Scanner;

/* local */
import numerocomplejo.NumeroComplejo;

public class NumeroComplejoTest2 {

    public static void
    main(String[] args)
    {
        /* scanner */
        Scanner scanf = new Scanner(System.in);

        NumeroComplejo c1 = new NumeroComplejo(5);

        System.out.print("ingrese un numero real: ");
        double real = Double.parseDouble(scanf.nextLine());
        System.out.print("ingrese un numero imaginario: ");
        double imaginario = Double.parseDouble(scanf.nextLine());

        NumeroComplejo c2 = new NumeroComplejo(real, imaginario);

        /* info c1 & c2 */
        System.out.println("c1:");
        System.out.print(c1);
        System.out.println("c2:");
        System.out.print(c2);

        /* modulo c1 & c2 */
        System.out.printf("modulo de c1: %.2f%n", c1.calcularModulo());
        System.out.printf("modulo de c2: %.2f%n", c2.calcularModulo());

        /* producto escalar de c1 por 2 */
        System.out.println("producto escalar entre c1 * 2:");
        System.out.println(c1.productoEscalar(2));

        /* suma entre c1 & c2 */
        System.out.println("la suma entre c1 & c2 es:");
        System.out.println(c1.sumar(c2));

        /* multiplicacion entre c1 & c2 */
        System.out.println("la multiplicacion entre c1 & c2 es:");
        System.out.println(c1.multiplicar(c2));

        /* verificar igualdad de los numeros */
        System.out.printf("son c1 & c2 iguales?: %b%n", c1.igualdad(c2));

        /* cerrar scanner */
        scanf.close();
    }
}
