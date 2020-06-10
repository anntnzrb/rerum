package interfaz;

/* local */
import numerocomplejo.NumeroComplejo;

public class NumeroComplejoTest {
    public static void
    main(String[] args)
    {
        NumeroComplejo c1 = new NumeroComplejo(2, 3);
        System.out.printf("c1: %f, %f%n", c1.getReal(), c1.getImaginario());
    }
}
