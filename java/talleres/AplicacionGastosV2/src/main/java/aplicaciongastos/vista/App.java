package aplicaciongastos.vista;

import aplicaciongastos.controlador.AppGastos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static final int ALTO_VENTANA = 600;
    private static final int ANCHO_VENTANA = 600;
    protected static AppGastos aplicacion;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Scene mainScene;
        try {
            aplicacion = new AppGastos();
            var vistaIngreso = new VistaIngreso();
            mainScene =
                new Scene(vistaIngreso.getRoot(), ANCHO_VENTANA, ALTO_VENTANA);
        } catch (Exception ex) {
            var vistaError = new VistaError(ex.getMessage());
            mainScene =
                new Scene(vistaError.getRoot(), ANCHO_VENTANA, ALTO_VENTANA);
        }

        primaryStage.setTitle("Aplicacion Gastos V2");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}