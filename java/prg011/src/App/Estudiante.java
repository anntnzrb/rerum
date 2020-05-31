package App;

public class Estudiante extends Persona {

    /* atts */
    private String facultad;
    private String matricula;

    public Estudiante(String nombre, String apellido, short edad,
                      String facultad, String matricula)
    {
        super(nombre, apellido, edad);
        this.facultad = facultad;
        this.matricula = matricula;
    }

    /* getters & setters */
    public void
    setFacultad(String facultad)
    {
        this.facultad = facultad;
    }

    public String
    getFacultad()
    {
        return facultad;
    }

    public void
    setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String
    getMatricula()
    {
        return matricula;
    }
}
