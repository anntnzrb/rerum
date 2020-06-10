package numerocomplejo;

/**
 * propiedades de numeros complejos
 *
 * @author j.a gonzalez
 */

public class NumeroComplejo {

    /* atributos */
    private double real;
    private double imaginario;

    /* constructores */
    public NumeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplejo(double real) {
        this.real = real;
        imaginario = 0;
    }

    /* setters & getters */
    public void
    setReal(double real)
    {
        this.real = real;
    }

    public void
    setImaginario(double imaginario)
    {
        this.imaginario = imaginario;
    }

    public double
    getReal()
    {
        return real;
    }

    public double
    getImaginario()
    {
        return imaginario;
    }

    /**
     *
     * @return raiz cuadrada de la suma del numero real mas el numero
     * imaginario elevado al cuadrado
     */
    public double
    calcularModulo()
    {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginario, 2));
    }

    /**
     *
     * @param k (escalar)
     * @return numero complejo multiplicado por un escalar (k)
     */
    public NumeroComplejo
    productoEscalar(double k)
    {
        NumeroComplejo n = new NumeroComplejo(real * k, imaginario * k);

        return n;
    }

    /**
     *
     * @param n
     * @return numero complejo con la suma de dos numeros complejos
     */
    public NumeroComplejo
    sumar(NumeroComplejo n)
    {
        NumeroComplejo suma = new NumeroComplejo(real + n.real,
                                                 imaginario + n.imaginario);
        return suma;
    }

    /**
     *
     * @param n
     * @return numero complejo con la multiplicacion de dos numeros complejos
     */
    public NumeroComplejo
    multiplicar(NumeroComplejo n)
    {
        NumeroComplejo mult = new NumeroComplejo(
            (real * n.real) - (imaginario * n.imaginario),
            (real * n.imaginario) + (imaginario * n.real));

        return mult;
    }

    /**
     *
     * @param n
     * @return true si esque los numeros son iguales, false si es lo contrario
     */
    public boolean
    igualdad(NumeroComplejo n)
    {
        NumeroComplejo m = new NumeroComplejo(real, imaginario);

        return (n.real == m.real) && (n.imaginario == m.imaginario);
    }

    public String
    toString()
    {
        return String.format("real = %.2f, imaginario = %.2f%n",
                             real, imaginario);
    }
}
