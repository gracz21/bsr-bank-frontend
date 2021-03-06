package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.services.BankServiceException_Exception;
import pl.poznan.put.bsr.bank.services.ValidationException_Exception;

/**
 * Register new user dialog controller class
 * @author Kamil Walkowiak
 */
public class RegisterDialogController {
    @FXML
    private TextField loginTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private Button registerButton;
    @FXML
    private Button cancelButton;

    @FXML
    private void handleRegisterButton() {
        String login = loginTextField.getText();
        String password = passwordField.getText();
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();

        try {
            BankServiceUtil.getInstance().getUserService().register(login, password, firstName, lastName);
            InformationDialogsUtil.showSuccessDialog("Registered successful");
            Stage stage = (Stage) registerButton.getScene().getWindow();
            stage.close();
        } catch (BankServiceException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleCancelButton() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
