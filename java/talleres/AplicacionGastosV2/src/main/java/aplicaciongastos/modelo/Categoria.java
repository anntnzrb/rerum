package aplicaciongastos.modelo;

import java.io.Serializable;
import java.util.Locale;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
@SuppressWarnings({"SerializableDeserializableClassInSecureContext",
    "SerializableHasSerializationMethods"})
public class Categoria implements Serializable {
    private static final long serialVersionUID = 42L;
    /* nombre de la categoria */
    private String nombre;
    /* nombre del archivo imagen de la categoria */
    private String image;

    public Categoria(String nombre, String image) {
        this.nombre = nombre;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase(Locale.ENGLISH);
    }
}

