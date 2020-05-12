package Main;

public class Main {
    public static void
    main(String[] args) throws Exception {
        char c1 = 'N';  /* N */
        char c2 = 'n';  /* n */
        /* (UNICODE) */
        char c1u_a = 78;       /* N */
        char c2u_a = 110;      /* n */
        char c1u_b = '\u004E'; /* N */
        char c2u_b = '\u006E'; /* n */
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1u_a);
        System.out.println(c2u_a);
        System.out.println(c1u_b);
        System.out.println(c2u_b);
    }
}