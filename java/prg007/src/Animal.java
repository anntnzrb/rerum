public class Animal {

    /* atributos */
    String filo;
    String nombre;
    float peso;
    String color;

    public static void
    main(String[] args)
    {
        /*
         * en el primer ejemplo se crea a un caballo, y en el segundo,
         * una rana;
         *
         * notar que ambos (animales) comparten atributos
         *
         */

        /* creación del caballo */
        Animal a1 = new Animal();
        a1.filo = "mamifero";
        a1.nombre = "caballo";
        a1.peso = 3f;
        a1.color = "cafe";

        /* creación de la rana */
        Animal a2 = new Animal();
        a2.filo = "anfiobio";
        a2.nombre = "rana";
        a2.peso = 524.76f;
        a2.color = "verde";

        System.out.printf(
            "animal: %s ; filo: %s ; peso: %.2fkg ; color: %s %n",
            a1.nombre, a1.filo, a1.peso, a1.color);

        System.out.printf(
            "animal: %s ; filo: %s ; peso: %.2fkg ; color: %s %n",
            a2.nombre, a2.filo, a2.peso, a2.color);

    }
}
