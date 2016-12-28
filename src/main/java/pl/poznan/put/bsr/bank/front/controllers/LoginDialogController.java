package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.front.views.RegisterDialogView;
import pl.poznan.put.bsr.bank.services.BankServiceException_Exception;
import pl.poznan.put.bsr.bank.services.ValidationException_Exception;

import java.io.IOException;

/**
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
            String tmp = BankServiceUtil.getInstance().getUserService().login(login, password);
            System.out.println(tmp);
            InformationDialogsUtil.showSuccessDialog("Logged in successful");
        } catch (BankServiceException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleRegisterButton() throws IOException {
        RegisterDialogView registerDialogView = new RegisterDialogView();
        registerDialogView.show();
    }
}
