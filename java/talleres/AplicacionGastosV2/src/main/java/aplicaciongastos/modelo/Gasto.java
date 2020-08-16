package aplicaciongastos.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
@SuppressWarnings({"SerializableDeserializableClassInSecureContext",
    "SerializableHasSerializationMethods"})
public class Gasto implements Serializable {
    private static final long serialVersionUID = 42L;
    private Categoria categoria;
    private double monto;
    private String descripcion;
    private LocalDate fecha;

    public Gasto(Categoria categoria, double monto, String descripcion,
                 LocalDate fecha) {
        this.categoria = categoria;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Gasto(Categoria categoria, double monto, String descripcion) {
        this(categoria, monto, descripcion, LocalDate.now());
    }

    @Override
    public String toString() {
        return "categoria: " + categoria + ", monto: " + monto +
            ", descripcion: '" + descripcion + ", fecha: " + fecha;
    }

    //
    // public Categoria getCategoria() {
    //     return categoria;
    // }
    //
    // public void setCategoria(Categoria categoria) {
    //     this.categoria = categoria;
    // }
    //
    // public double getMonto() {
    //     return monto;
    // }
    //
    // public void setMonto(double monto) {
    //     this.monto = monto;
    // }
    //
    // public String getDescripcion() {
    //     return descripcion;
    // }
    //
    // public void setDescripcion(String descripcion) {
    //     this.descripcion = descripcion;
    // }
    //
    // public LocalDate getFecha() {
    //     return fecha;
    // }
    //
    // public void setFecha(LocalDate fecha) {
    //     this.fecha = fecha;
    // }
}
