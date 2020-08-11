package xyz.tallergui;

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void
    start(Stage primaryStage)
    {
        /* contenedor root */
        VBox root = new VBox();

        /*
         * seccion titulo
         */
        HBox sec_label = new HBox();
        sec_label.getChildren().add(new Label("Formulario de Gastos"));
        /* agregar al contenedor raiz */
        root.getChildren().add(sec_label);
        /* propiedades */
        sec_label.setAlignment(Pos.CENTER);
        sec_label.setPadding(new Insets(20, 0, 20, 0));

        /*
         * seccion formulario
         */
        GridPane form_box = new GridPane();
        form_box.setHgap(15);
        form_box.setVgap(15);
        /**/
        form_box.add(new Label("Categoria"), 0, 0);
        /* lista de categorias posibles para seleccionar */
        List < String > categorias = Arrays.asList("SALUD",
                                                   "COMIDA",
                                                   "TRANSPORTE");
        ComboBox < String > combo_categorias = new ComboBox < >
                                               (FXCollections.
                                                observableArrayList(categorias));
        /* valor default */
        combo_categorias.setValue("Salud");
        form_box.add(combo_categorias, 1, 0);
        /**/
        TextField text_monto = new TextField("$$$");
        text_monto.setMaxSize(400, 70);
        form_box.addRow(1, new Label("Monto"), text_monto);
        /**/
        TextArea text_desc = new TextArea("Ingrese una descripcion...");
        text_desc.setMaxSize(400, 140);
        form_box.addRow(2, new Label("Descripcion"), text_desc);
        /* agregar al contenedor raiz */
        root.getChildren().add(form_box);

        /*
         * seccion botones
         */
        HBox sec_btns = new HBox();
        /* creacion de botones */
        Button btn_limpiar = new Button("Limpiar");
        Button btn_guardar = new Button("Guardar");
        Button btn_cancelar = new Button("Cancelar");
        sec_btns.getChildren().addAll(btn_limpiar, btn_guardar, btn_cancelar);
        /* agregar al contenedor raiz */
        root.getChildren().add(sec_btns);
        /* propiedades */
        sec_btns.setAlignment(Pos.CENTER);
        sec_btns.setPadding(new Insets(20, 0, 0, 0));
        sec_btns.setSpacing(12);

        /*
         * seccion eventos
         */
        HBox sec_fnc = new HBox();
        /* creacion de botones */
        Button btn_salir = new Button("Salir");
        sec_fnc.getChildren().add(btn_salir);
        sec_fnc.getChildren().add(new Label("(si funciona)"));
        /* agregar al contenedor raiz */
        root.getChildren().add(sec_fnc);
        /* propiedades */
        sec_fnc.setAlignment(Pos.CENTER);
        sec_fnc.setPadding(new Insets(20, 0, 0, 0));
        sec_fnc.setSpacing(12);

        /* eventos */
        /* tambien se puede con un lambda */
        EventHandler < ActionEvent > exit_event = (ActionEvent t)->{
            System.out.println("Salida exitosa.");
            System.exit(0);
        };

        /* ejecutar al realizar presionar */
        btn_salir.setOnAction(exit_event);

        /*
         * seccion mensaje inicial
         */
        HBox sec_msg = new HBox();
        sec_msg.getChildren().add(new Label("Bienvenido"));
        root.getChildren().add(sec_msg);
        /* propiedades */
        sec_msg.setAlignment(Pos.BOTTOM_LEFT);

        /* creacion de escena */
        Scene scene = new Scene(root, 600, 600);
        /* titulo */
        primaryStage.setTitle("Aplicacion gastos");
        /* fijar escena */
        primaryStage.setScene(scene);
        /* mostrar ventana */
        primaryStage.show();
    }

    public static void
    main(String... args)
    {
        launch(args);
    }
}
