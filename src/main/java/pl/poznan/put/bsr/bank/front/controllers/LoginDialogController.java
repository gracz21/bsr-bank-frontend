package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.views.RegisterDialogView;
import pl.poznan.put.bsr.bank.services.UserService;

import java.io.IOException;

/**
 * @author Kamil Walkowiak
 */
public class LoginDialogController {
    @FXML
    private TextField loginTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;

    @FXML
    private void handleLoginButton() {
        String login = loginTextField.getText();
        String password = passwordTextField.getText();
        try {
            System.out.println(BankServiceUtil.getInstance().getUserService().login(login, password));
        } catch (Exception e) {

        }
    }

    @FXML
    private void handleRegisterButton() throws IOException {
        RegisterDialogView registerDialogView = new RegisterDialogView();
        registerDialogView.show();
        System.out.printf("Register");
    }
}
