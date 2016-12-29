package pl.poznan.put.bsr.bank.front.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.services.AuthException_Exception;
import pl.poznan.put.bsr.bank.services.BankAccount;
import pl.poznan.put.bsr.bank.services.BankServiceException_Exception;
import pl.poznan.put.bsr.bank.services.ValidationException_Exception;

import java.util.List;
import java.util.Optional;


/**
 * @author Kamil Walkowiak
 */
public class AccountOverviewController {
    private ObservableList<BankAccount> bankAccounts;

    @FXML
    private TableView<BankAccount> accountsTableView;
    @FXML
    private TableColumn<BankAccount, String> nameTableColumn;
    @FXML
    private TableColumn<BankAccount, String> accountNoTableColumn;
    @FXML
    private Label nameLabel;
    @FXML
    private Label accountNoLabel;
    @FXML
    private Label balanceLabel;

    public AccountOverviewController() {
        List<BankAccount> response = null;
        try {
            response = BankServiceUtil.getInstance().getBankAccountService().getCurrentUserBankAccounts();
        } catch (AuthException_Exception | BankServiceException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }

        bankAccounts = FXCollections.observableArrayList(response);
    }

    @FXML
    private void initialize() {
        resetAccountDetails();

        nameTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        accountNoTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAccountNo()));

        accountsTableView.setItems(bankAccounts);
        accountsTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showAccountDetails(newValue));
    }

    @FXML
    private void handleAddBankAccountButton() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Bank account name");
        dialog.setHeaderText("Input new bank account name");
        dialog.setContentText("Name:");

        Optional<String> result = dialog.showAndWait();
        String name = result.get();
        try {
            bankAccounts.add(BankServiceUtil.getInstance().getBankAccountService().addBankAccount(name));
        } catch (AuthException_Exception | BankServiceException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleLogoutButton() {
        try {
            BankServiceUtil.getInstance().getUserService().logout();
            InformationDialogsUtil.showSuccessDialog("Logged out successfully");
        } catch (AuthException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    private void resetAccountDetails() {
        nameLabel.setText(null);
        accountNoLabel.setText(null);
        balanceLabel.setText(null);
    }

    private void showAccountDetails(BankAccount bankAccount) {
        nameLabel.setText(bankAccount.getName());
        accountNoLabel.setText(bankAccount.getAccountNo());
        balanceLabel.setText(bankAccount.getBalance() + " zł");
    }
}
