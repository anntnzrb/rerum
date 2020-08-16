package aplicaciongastos.data;

import aplicaciongastos.modelo.Gasto;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
public class GastosData {
    public static final String FILE_GASTOS =
        DataHelper.ARCHIVOS + "/gastos.dat";

    public static List<Gasto> leerGastos()
        throws IOException, ClassNotFoundException {
        try (var input = new ObjectInputStream(
            new FileInputStream(FILE_GASTOS))) {
            return (List<Gasto>) input.readObject();
        } catch (FileNotFoundException ex) {
            escribirGastos(new ArrayList<>());
            return new ArrayList<>();
        }
    }

    public static void escribirGastos(List<Gasto> gastos) throws IOException {
        var path = Paths.get(FILE_GASTOS);
        try (var out = new ObjectOutputStream(
            new FileOutputStream(FILE_GASTOS))) {
            out.writeObject(gastos);
        }
    }
}