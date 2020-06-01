package xyz;

public class Persona {

    /* atts */
    private String nombre, apellido;
    private short edad;

    public Persona(String nombre, String apellido, short edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /* getters & setters */
    public void
    setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String
    getNombre()
    {
        return nombre;
    }

    public void
    setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String
    getApellido()
    {
        return apellido;
    }

    public void
    setEdad(short edad)
    {
        this.edad = edad;
    }

    public short
    getEdad()
    {
        return edad;
    }
}
