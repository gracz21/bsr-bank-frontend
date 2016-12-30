package pl.poznan.put.bsr.bank.front.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pl.poznan.put.bsr.bank.front.controllers.NewBankOperationDialogController;
import pl.poznan.put.bsr.bank.services.BankOperation;

import java.io.IOException;

/**
 * @author Kamil Walkowiak
 */
public class NewBankOperationDialogView {
    private Stage stage;
    private NewBankOperationDialogController controller;

    public NewBankOperationDialogView(String selectedBankAccountNo) throws IOException {
        stage = new Stage();
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.initModality(Modality.NONE);
        stage.setTitle("eBank - Login");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/NewBankOperationDialog.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));

        this.controller = fxmlLoader.getController();
        controller.setSelectedBankAccountNo(selectedBankAccountNo);
    }

    public void showAndWait() {
        stage.showAndWait();
    }

    public BankOperation getResult() {
        return controller.getResultBankOperation();
    }
}
