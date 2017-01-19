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
 * New bank operation dialog constructing class
 * @author Kamil Walkowiak
 */
public class NewBankOperationDialogView {
    private Stage stage;
    private NewBankOperationDialogController controller;

    /**
     * Creates new new bank operation dialog
     * @param selectedBankAccountNo selected bank account no
     * @throws IOException if layout file was not found
     */
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

    /**
     * Shows new bank operation dialog and wait for user response
     */
    public void showAndWait() {
        stage.showAndWait();
    }

    /**
     * Return created bank operation
     * @return created bank operation
     */
    public BankOperation getResult() {
        return controller.getResultBankOperation();
    }
}
