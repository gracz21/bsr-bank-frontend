package pl.poznan.put.bsr.bank.front.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Register dialog constructing class
 * @author Kamil Walkowiak
 */
public class RegisterDialogView {
    private Stage stage;

    /**
     * Creates new register dialog
     * @throws IOException if layout file was not found
     */
    public RegisterDialogView() throws IOException {
        stage = new Stage();
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.initModality(Modality.NONE);
        stage.setTitle("eBank - Register");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterDialog.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
    }

    /**
     * Shows register dialog and wait for user response
     */
    public void showAndWait() {
        stage.showAndWait();
    }
}
