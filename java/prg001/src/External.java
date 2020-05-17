public class External {
    public static void
    main(String[] args) {
        System.out.println("he-ya desde otra clase");
        salute();
    }
    public static void
    salute() {
        /* esto se ejecutara unicamente si es llamado en main() */
        System.out.println("he-ya desde un metodo diferente de main()");
    }
}
