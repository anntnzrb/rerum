package modelo.espectaculo;

/**
 *
 * @author j.a gonzalez
 */

public class Concierto extends Espectaculo {
    private String banda;

    public Concierto(String codigo, String nombre, String banda) {
        super(codigo, nombre);
        this.banda = banda;
    }

    @Override
    public String
    toString()
    {
        return "\n" + "banda=" + banda + super.toString() + "\n";
    }
}
