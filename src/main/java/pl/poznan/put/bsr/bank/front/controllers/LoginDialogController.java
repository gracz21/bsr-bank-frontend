package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.front.views.RegisterDialogView;
import pl.poznan.put.bsr.bank.services.BankServiceException_Exception;
import pl.poznan.put.bsr.bank.services.ValidationException_Exception;

import java.io.IOException;

/**
 * Login dialog controller class
 * @author Kamil Walkowiak
 */
public class LoginDialogController {
    @FXML
    private TextField loginTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;

    @FXML
    private void handleLoginButton() {
        String login = loginTextField.getText();
        String password = passwordField.getText();
        try {
            String sessionId = BankServiceUtil.getInstance().getUserService().login(login, password);
            BankServiceUtil.getInstance().setSessionId(sessionId);
            InformationDialogsUtil.showSuccessDialog("Logged in successful");
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
        } catch (BankServiceException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleRegisterButton() throws IOException {
        RegisterDialogView registerDialogView = new RegisterDialogView();
        registerDialogView.showAndWait();
    }
}
