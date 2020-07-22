package modelo.espectaculo;

import java.util.ArrayList;

/**
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class Teatro extends Espectaculo {
    private ArrayList < String > artistas;

    public Teatro(String codigo, String nombre,
                  ArrayList < String > artistas) {
        super(codigo, nombre);
        this.artistas = artistas;
        artistas = new ArrayList < > ();
    }

    @Override
    public String
    toString()
    {
        return "\n" + "artistas=" + artistas + super.toString();
    }
}
