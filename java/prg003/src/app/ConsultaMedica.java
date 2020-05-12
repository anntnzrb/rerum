package app;
/*
 *
 *
 */


public class ConsultaMedica {
    public static void
    main(String[] args) {
        String nombre = "annt";
        String identificador = "1234567890"; /* pudiera usarse un entero */
        short edad = 20;                     /* pudiera usarse byte */
        char genero = 'M';
        float peso = 55f;                    /* en kg */
        float estatura = 1.69f;              /* en metros */
        double imc = peso / (estatura * estatura);
        String imc_result;

        if (imc < 18.5) {
            imc_result = "peso bajo";
        } else if (imc >= 18.5 && imc <= 24.99) {
            imc_result = "peso normal";
        } else {
            imc_result = "sobrepeso";
        }

        System.out.printf("nombre: %s%n", nombre);
        System.out.printf("indentificador: %s%n", identificador);
        System.out.printf("edad: %d%n", edad);
        System.out.printf("genero: %c%n", genero);
        System.out.printf("peso: %f%n", peso);
        System.out.printf("estatura: %f%n", estatura);
        System.out.printf("IMC: %f%n", imc);
        System.out.printf("tiene: %s%n", imc_result);
    }
}