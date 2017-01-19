package pl.poznan.put.bsr.bank.front.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Login dialog constructing class
 * @author Kamil Walkowiak
 */
public class LoginDialogView {
    private Stage stage;

    /**
     * Creates nes login dialog
     * @throws IOException if layout file was not found
     */
    public LoginDialogView() throws IOException {
        stage = new Stage();
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.initModality(Modality.NONE);
        stage.setTitle("eBank - Login");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/LoginDialog.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
    }

    /**
     * Shows login dialog and wait for user response
     */
    public void showAndWait() {
        stage.showAndWait();
    }
}
