package xyz;

import java.util.Scanner;

public class Main {

    public static void
    main(String[] args)
    {

        Scanner scanf = new Scanner(System.in);

        Persona p1;
        Estudiante e1;

        /* persona (no estudiante) */
        p1 = new Persona("annt", "nzrb", (short) 20);
        /* estudiante */
        e1 = new Estudiante("Tai", "Lee", (short) 33, "computacion",
                            "201954678");

        System.out.println("Persona:");
        System.out.println("==========");
        System.out.printf("nombre: %s%n", p1.getNombre());
        System.out.printf("apellido: %s%n", p1.getApellido());
        System.out.printf("edad: %s%n", p1.getEdad());
        /* */
        System.out.println("Estudiante: ");
        System.out.println("==========");
        System.out.printf("nombre: %s%n", e1.getNombre());
        System.out.printf("apellido: %s%n", e1.getApellido());
        System.out.printf("edad: %s%n", e1.getEdad());
        System.out.printf("facultad: %s%n", e1.getFacultad());
        System.out.printf("matricula: %s%n", e1.getMatricula());
    }
}
