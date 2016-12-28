package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.services.AuthException_Exception;

/**
 * @author Kamil Walkowiak
 */
public class AccountOverviewController {
    @FXML
    private void handleLogoutButton() {
        try {
            BankServiceUtil.getInstance().getUserService().logout();
            InformationDialogsUtil.showSuccessDialog("Logged out successfully");
        } catch (AuthException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }
}
