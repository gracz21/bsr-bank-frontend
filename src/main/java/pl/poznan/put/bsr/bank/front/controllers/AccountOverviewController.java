package pl.poznan.put.bsr.bank.front.controllers;

import javafx.beans.property.SimpleObjectProperty;
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
import pl.poznan.put.bsr.bank.services.*;

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
    @FXML
    private TableView<BankOperation> historyTableView;
    @FXML
    private TableColumn<BankOperation, String> typeTableColumn;
    @FXML
    private TableColumn<BankOperation, String> titleTableColumn;
    @FXML
    private TableColumn<BankOperation, Double> amountTableColumn;
    @FXML
    private TableColumn<BankOperation, String> sourceTableColumn;
    @FXML
    private TableColumn<BankOperation, String> targetTableColumn;
    @FXML
    private TableColumn<BankOperation, Double> balanceAfterTableColumn;

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

        initializeAccountTableView();
        initializeHistoryTableView();
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

    private void initializeAccountTableView() {
        nameTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        accountNoTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAccountNo()));

        accountsTableView.setItems(bankAccounts);
        accountsTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showAccountDetails(newValue));
    }

    private void initializeHistoryTableView() {
        typeTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
        titleTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));
        amountTableColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getAmount()));
        sourceTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(prepareSource(cellData.getValue())));
        targetTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(prepareTarget(cellData.getValue())));
        balanceAfterTableColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getBalanceAfter()));
    }

    private String prepareSource(BankOperation bankOperation) {
        String source = null;
        switch(bankOperation.getClass().getSimpleName()) {
            case "Payment":
                source = "N/A";
                break;
            case "Withdrawal":
                source = bankOperation.getReceiverAccount();
                break;
            case "Transfer":
                source = ((Transfer)bankOperation).getSenderAccount();
                break;
        }

        return source;
    }

    private String prepareTarget(BankOperation bankOperation) {
        String target = null;
        switch(bankOperation.getClass().getSimpleName()) {
            case "Payment":
                target = bankOperation.getReceiverAccount();
                break;
            case "Withdrawal":
                target = "N/A";
                break;
            case "Transfer":
                target = bankOperation.getReceiverAccount();
                break;
        }

        return target;
    }

    private void resetAccountDetails() {
        nameLabel.setText(null);
        accountNoLabel.setText(null);
        balanceLabel.setText(null);
        historyTableView.setItems(null);
    }

    private void showAccountDetails(BankAccount bankAccount) {
        nameLabel.setText(bankAccount.getName());
        accountNoLabel.setText(bankAccount.getAccountNo());
        balanceLabel.setText(bankAccount.getBalance() + " zł");
        historyTableView.setItems(FXCollections.observableArrayList(
                bankAccount.getHistory().getBankOperationOrPaymentOrTransfer()));
    }
}
