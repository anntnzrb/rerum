package aplicaciongatos.test;

import aplicaciongastos.data.CategoriaData;
import aplicaciongastos.data.GastosData;
import aplicaciongastos.modelo.Categoria;
import aplicaciongastos.modelo.Gasto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
public class GenerarData {
    public static void main(String[] args) {
        var categorias = new ArrayList<Categoria>();
        categorias.add(new Categoria("ropa", "ropa.png"));
        categorias.add(new Categoria("comida", "comida.png"));
        categorias.add(new Categoria("salud", "salud.png"));
        categorias.add(new Categoria("entretenimiento", "entretenimiento.png"));

        var gastos = new ArrayList<Gasto>();
        gastos.add(new Gasto(categorias.get(0), 80.00, "chaqueta"));
        gastos.add(new Gasto(categorias.get(1), 8.00, "hamburguesas"));
        gastos.add(new Gasto(categorias.get(2), 7.00, "medicinas resfriado"));
        gastos.add(new Gasto(categorias.get(3), 60.00, "paper mario origami"));
        gastos.add(new Gasto(categorias.get(0), 50.00, "zapatos"));
        gastos.add(new Gasto(categorias.get(1), 5.00, "salchipapas"));
        gastos.add(new Gasto(categorias.get(2), 20.00, "mascarilla"));
        gastos.add(new Gasto(categorias.get(3), 60.00, "animal crossing"));
        gastos.add(new Gasto(categorias.get(0), 15.00, "gorra",
                             LocalDate.of(2020, 7, 18)));
        gastos.add(new Gasto(categorias.get(1), 52.50, "cena fancy",
                             LocalDate.of(2020, 7, 19)));
        gastos.add(new Gasto(categorias.get(2), 2.50, "guantes",
                             LocalDate.of(2020, 7, 20)));
        gastos.add(new Gasto(categorias.get(3), 70.00, "smash bros",
                             LocalDate.of(2020, 7, 21)));

        try {
            CategoriaData.escribirCategorias(categorias);
            System.out.println(CategoriaData.leerCategorias());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            GastosData.escribirGastos(gastos);
            System.out.println(GastosData.leerGastos());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
