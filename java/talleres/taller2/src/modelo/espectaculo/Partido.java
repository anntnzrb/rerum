package modelo.espectaculo;

/**
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class Partido extends Espectaculo {
    private String equipo1;
    private String equipo2;

    public Partido(String codigo, String nombre, String equipo1,
                   String equipo2) {
        super(codigo, nombre);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    @Override
    public String
    toString()
    {
        return "\n" + "equipo1=" + equipo1 + ", equipo2=" + equipo2 +
               super.toString();
    }

    /* Getters & Setters */
    public String getEquipo1() { return equipo1; }
    public void setEquipo1(String equipo1) { this.equipo1 = equipo1; }
    public String getEquipo2() { return equipo2; }
    public void setEquipo2(String equipo2) { this.equipo2 = equipo2;}
}
