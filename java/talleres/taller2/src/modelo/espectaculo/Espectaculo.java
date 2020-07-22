package modelo.espectaculo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import modelo.Funcion;

/**
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public abstract class Espectaculo {
    private String codigo;
    private String nombre;
    private ArrayList < Funcion > funciones;

    public Espectaculo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        funciones = new ArrayList < > ();
    }

    public void
    agregarFuncion(LocalDateTime fecha, double precio, int capacidad)
    {
        funciones.add(new Funcion(fecha, precio, capacidad, this));
    }

    public Funcion
    obtenerFuncion(LocalDateTime fecha)
    {
        for (Funcion f : funciones) {
            if (f.getFecha().equals(fecha)) { return f; }
        }
        return null;
    }

    @Override
    public boolean
    equals(Object obj)
    {
        if (obj != null) {
            if (obj instanceof Espectaculo) {
                /* Downcasting */
                Espectaculo e = (Espectaculo) obj;
                if (e.codigo.equals(codigo)) { return true; }
            }
        }
        return false;
    }

    @Override
    public String
    toString()
    {
        return "\n" + "codigo=" + codigo + ", nombre=" + nombre + "\n";
    }

    /* Getters & Setters */
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public ArrayList < Funcion > getFunciones() {
        return funciones;
    }
    public void
    setFunciones(ArrayList < Funcion > funciones)
    {
        this.funciones = funciones;
    }
}
