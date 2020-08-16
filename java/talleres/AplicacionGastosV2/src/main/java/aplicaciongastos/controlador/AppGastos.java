package aplicaciongastos.controlador;

import aplicaciongastos.data.CategoriaData;
import aplicaciongastos.data.GastosData;
import aplicaciongastos.modelo.Categoria;
import aplicaciongastos.modelo.Gasto;

import java.io.IOException;
import java.util.List;

/**
 * @author rociomera
 * @author j.a gonzalez
 */

public class AppGastos {
    List<Categoria> categorias;
    List<Gasto> gastos;

    public AppGastos() throws IOException, ClassNotFoundException {
        categorias = CategoriaData.leerCategorias();
        gastos = GastosData.leerGastos();
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void registrar_gasto(Categoria cat, double monto, String descripcion)
        throws IOException {
        gastos.add(new Gasto(cat, monto, descripcion));
        GastosData.escribirGastos(gastos);
    }

    public void generarReporte() {

    }
}
