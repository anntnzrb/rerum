package aplicaciongastos.vista;

import aplicaciongastos.data.GastosData;
import aplicaciongastos.modelo.Categoria;
import aplicaciongastos.modelo.Gasto;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

import static aplicaciongastos.vista.App.aplicacion;
import static javafx.collections.FXCollections.observableArrayList;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
public class VistaIngreso {

    private final VBox root;
    private ComboBox<Categoria> comboCategorias;
    private GridPane formularioBox;
    private HBox btnBox;
    private HBox cabeceraBox;
    private HBox mensajeBox;
    private TextArea txtADescription;
    private TextField txtFMonto;
    private List listaGastos;

    VistaIngreso() {
        /* Inicializar */
        root = new VBox();
        listaGastos = new ArrayList<Gasto>();
        seccCabecera();
        seccFormulario();
        seccBotones();
        seccMensaje();
    }

    /**
     * Seccion Cabecera
     */
    private void seccCabecera() {
        /* *********************************************************************
         *  HBox
         * ****************************************************************** */
        cabeceraBox = new HBox();
        cabeceraBox.setPadding(new Insets(20, 0, 20, 0));
        cabeceraBox.setAlignment(Pos.CENTER);
        /* Label */
        var lblCabecera = new Label("Formulario de gastos");
        lblCabecera.setStyle("-fx-font-weight: bold");
        cabeceraBox.getChildren().add(lblCabecera);

        /* agregar a root*/
        root.getChildren().add(cabeceraBox);
    }

    /**
     * Seccion Formulario
     */
    private void seccFormulario() {
        /* *********************************************************************
         *  GridPane
         * ****************************************************************** */
        formularioBox = new GridPane();
        formularioBox.setHgap(15);
        formularioBox.setVgap(15);

        /* *********************************************************************
         * Categoria
         * ****************************************************************** */
        /* Label */
        var lblCategoria = new Label("Categoria");
        formularioBox.add(lblCategoria, 0, 0);
        /* ComboBox */
        setComboCategorias(
            new ComboBox<>(observableArrayList(aplicacion.getCategorias())));
        formularioBox.addRow(0, getComboCategorias());
        /* valor default a mostrar */
        getComboCategorias().setPromptText("Seleccione categoria");

        /* *********************************************************************
         * Monto
         * ****************************************************************** */
        /* TextField */
        txtFMonto = new TextField();
        var lblMonto = new Label("Monto");
        txtFMonto.setMaxSize(500, 70);
        txtFMonto.setPromptText("$");
        formularioBox.addRow(1, lblMonto, txtFMonto);

        /* *********************************************************************
         * Descripcion
         * ****************************************************************** */
        /* TextArea */
        txtADescription = new TextArea();
        var lblDescripcion = new Label("Descripcion");
        txtADescription.setMaxSize(500, 140);
        txtADescription.setPromptText("Descripcion detallada...");
        formularioBox.addRow(2, lblDescripcion, txtADescription);

        /* agregar al root*/
        root.getChildren().add(formularioBox);
    }

    /**
     * Seccion Botones
     */
    private void seccBotones() {
        /* *********************************************************************
         * HBox
         * ****************************************************************** */
        btnBox = new HBox();
        btnBox.setSpacing(10);
        btnBox.setAlignment(Pos.CENTER);
        btnBox.setPadding(new Insets(20, 0, 0, 0));

        /* *********************************************************************
         * Botones
         * ****************************************************************** */
        var btnLimpiar = new Button("Limpiar");
        btnLimpiar.setStyle(
            "-fx-background-color: darkslateblue; -fx-text-fill: white;");
        var btnGuardar = new Button("Guardar");
        btnGuardar.setStyle(
            "-fx-background-color: limegreen; -fx-text-fill: white;");
        var btnSalir = new Button("Salir");
        btnSalir.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        btnBox.getChildren().addAll(btnLimpiar, btnGuardar, btnSalir);

        /* Boton Limpiar */
        btnLimpiar.setOnAction(actionEvent -> {
            getComboCategorias().setValue(null);
            txtADescription.setText(null);
            txtFMonto.setText(null);
            System.out.println("Contenido eliminado.");
        });

        /* Boton Guardar */
        btnGuardar.setOnAction(actionEvent -> {
            try {
                if (getComboCategorias().getValue() == null ||
                    txtADescription.getText().isBlank()) {
                    throw new NullPointerException();
                }
                guardarMonto(getComboCategorias().getValue(),
                             Double.parseDouble(txtFMonto.getText()),
                             txtADescription.getText());
            } catch (NullPointerException | NumberFormatException nullEx) {
                System.err.println("Contenido nulo ingresado.");
            }
        });

        /* Boton Salir */
        btnSalir.setOnAction(actionEvent -> {
            System.out.println("Terminando programa...");
            System.exit(0);
        });

        /* agregar al root*/
        root.getChildren().add(btnBox);
    }

    /**
     * Seccion Mensaje
     */
    private void seccMensaje() {
        /* *********************************************************************
         * HBox
         * ****************************************************************** */
        mensajeBox = new HBox();
        mensajeBox.setSpacing(10);
        mensajeBox.setAlignment(Pos.CENTER);
        mensajeBox.setPadding(new Insets(20, 0, 0, 0));
        /* Label */
        var lblMessage =
            new Label("Ingrese los valores y haga click en Guardar");
        mensajeBox.getChildren().add(lblMessage);

        /* agregar al root*/
        root.getChildren().add(mensajeBox);
    }

    private void guardarMonto(Categoria cat, double monto, String desc) {
        try {
            listaGastos.add(new Gasto(cat, monto, desc));
            GastosData.escribirGastos(listaGastos);
            System.out.println("Gasto guardado satisfactoriamente.");
            System.out.println(GastosData.leerGastos());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Pane getRoot() {
        return root;
    }

    public ComboBox<Categoria> getComboCategorias() {
        return comboCategorias;
    }

    public void setComboCategorias(ComboBox<Categoria> comboCategorias) {
        this.comboCategorias = comboCategorias;
    }
}
