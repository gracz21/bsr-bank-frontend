package pl.poznan.put.bsr.bank.front.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @author Kamil Walkowiak
 */
public class RegisterDialogView {
    private Stage stage;

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

    public void showAndWait() {
        stage.showAndWait();
    }
}
