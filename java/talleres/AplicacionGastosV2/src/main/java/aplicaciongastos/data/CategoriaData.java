package aplicaciongastos.data;

import aplicaciongastos.modelo.Categoria;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
public class CategoriaData {
    public static final String FILE_CATEGORIAS =
        DataHelper.ARCHIVOS + "/categorias.dat";

    public static List<Categoria> leerCategorias()
        throws IOException, ClassNotFoundException, IllegalArgumentException {
        try (var input = new ObjectInputStream(
            new FileInputStream(FILE_CATEGORIAS))) {
            return (List<Categoria>) input.readObject();
        }
    }

    public static void escribirCategorias(List<Categoria> gastos)
        throws IOException, IllegalArgumentException {
        System.out.println(Paths.get(FILE_CATEGORIAS));
        try (var out = new ObjectOutputStream(
            new FileOutputStream(FILE_CATEGORIAS))) {
            out.writeObject(gastos);
        }
    }
}
