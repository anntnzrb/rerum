package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import modelo.espectaculo.Espectaculo;

/**
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class Funcion {
    private LocalDateTime fecha;
    private double precio;
    private int capacidad;
    private Espectaculo espectaculo;

    public Funcion(LocalDateTime fecha, double precio, int capacidad,
                   Espectaculo espectaculo) {
        this.fecha = fecha;
        this.precio = precio;
        this.capacidad = capacidad;
        this.espectaculo = espectaculo;
    }

    @Override
    public String
    toString()
    {
        String dateFormatter = "dd-MM-yyyy HH:mm";
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(dateFormatter);
        return "Fecha y hora: " + formatter.format(fecha) + ", " + "Precio: " +
               precio + "Capacidad: " + capacidad;
    }

    @Override
    public boolean
    equals(Object obj)
    {
        if (obj != null) {
            if (obj instanceof Funcion) {
                /* Downcasting */
                Funcion f = (Funcion) obj;
                if (f.espectaculo.equals(espectaculo) &&
                    f.fecha.equals(fecha)) { return true; }
            }
        }
        return false;
    }

/* Getters & Setters */
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public Espectaculo getEspectaculo() { return espectaculo; }
    public void
    setEspectaculo(Espectaculo espectaculo) { this.espectaculo = espectaculo; }
}
