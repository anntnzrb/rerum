public class Cuadrilatero {

    /* atts */
    private double lado1, lado2;

    /* cuadrilatero */
    public Cuadrilatero(double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /* cuadrado */
    public Cuadrilatero(double lado1)
    {
        this.lado1 = this.lado2 = lado1;
    }

    /* setters & getters */
    /* perimetro */
    public void
    setPerimetro(double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double
    getPerimetro()
    {
        return 2 * (lado1 + lado2);
    }

    /* area */
    public void
    setArea(double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double
    getArea()
    {
        return lado1 * lado2;
    }
}
