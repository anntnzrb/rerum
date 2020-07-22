package modelo;

/**
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class Compra {
    private Cliente cliente;
    private int num_boletos;
    private Funcion funcion;
    private double total;

    public Compra(Funcion funcion, Cliente cliente, int num_boletos) {
        this.funcion = funcion;
        this.cliente = cliente;
        this.num_boletos = num_boletos;
        /* calcular total */
        total = calcularTotal();
    }

    private double
    calcularTotal()
    {
        return num_boletos * funcion.getPrecio();
    }

    /* Getters & Setters */
    public int getNum_boletos() { return num_boletos; }
    public void
    setNum_boletos(int num_boletos) { this.num_boletos = num_boletos; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public Funcion getFuncion() { return funcion; }
    public void setFuncion(Funcion funcion) { this.funcion = funcion; }
}
