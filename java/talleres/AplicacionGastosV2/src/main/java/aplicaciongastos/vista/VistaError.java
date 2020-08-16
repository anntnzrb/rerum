package aplicaciongastos.vista;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
public class VistaError {
    private final StackPane root;

    VistaError(String msg) {
        root = new StackPane();
        Label lblMsg = new Label(msg);
        root.getChildren().add(lblMsg);
    }

    public StackPane getRoot() {
        return root;
    }
}