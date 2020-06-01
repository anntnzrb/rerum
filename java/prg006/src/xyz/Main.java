public class Main {
    public static void
    main(String[] args)
    {
        /* instanciamiento */
        Estudiante e1 = new Estudiante();

        /* especificacion por estudiante */
        e1.nombre = "pablo";
        e1.cedula = "0967567849";
        e1.facultad = "computacion";
        e1.edad = 21;

        System.out.printf(
            "nombre: %s | cedula: %s | facultad: %s | edad: %d%n",
            e1.nombre, e1.cedula, e1.facultad, e1.edad);
    }
}
