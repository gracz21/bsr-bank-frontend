package pl.poznan.put.bsr.bank.front.controllers;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.front.views.NewBankOperationDialogView;
import pl.poznan.put.bsr.bank.services.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


/**
 * Main screen controller class
 * @author Kamil Walkowiak
 */
public class AccountOverviewController {
    private User currentUser;
    private ObservableList<BankAccount> bankAccounts;

    @FXML
    private Label loggedAsLabel;
    @FXML
    private Button logoutButton;
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
    private Button countFeeButton;
    @FXML
    private Button newOperationButton;
    @FXML
    private TableView<BankOperation> historyTableView;
    @FXML
    private TableColumn<BankOperation, String> typeTableColumn;
    @FXML
    private TableColumn<BankOperation, String> titleTableColumn;
    @FXML
    private TableColumn<BankOperation, String> amountTableColumn;
    @FXML
    private TableColumn<BankOperation, String> sourceTableColumn;
    @FXML
    private TableColumn<BankOperation, String> targetTableColumn;
    @FXML
    private TableColumn<BankOperation, String> balanceAfterTableColumn;
    @FXML
    private TableColumn<BankOperation, String> dateTableColumn;

    /**
     * Creates instance of account overview controller
     */
    public AccountOverviewController() {
        fetchCurrentUser();
        bankAccounts = new ObservableListWrapper<>(new ArrayList<>());
        updateBankAccountsList();
    }

    @FXML
    private void initialize() {
        resetAccountDetails();

        loggedAsLabel.setText(
                loggedAsLabel.getText() + " " + currentUser.getFirstName() + " " + currentUser.getLastName());
        initializeAccountTableView();
        countFeeButton.setDisable(true);
        newOperationButton.setDisable(true);
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
        } catch (AuthException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleCountFeeButton() {
        BankAccount selectedBankAccount = accountsTableView.getSelectionModel().getSelectedItem();
        try {
            BankOperation newOperation = BankServiceUtil.getInstance().getBankOperationService().countFee(selectedBankAccount.getAccountNo());
            updateAccountDetails(selectedBankAccount, newOperation);
        } catch (AuthException_Exception | BankOperationException_Exception | BankServiceException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleRefreshButton() {
        resetAccountDetails();
        countFeeButton.setDisable(true);
        newOperationButton.setDisable(true);

        updateBankAccountsList();
    }

    @FXML
    private void handleLogoutButton() {
        ((Stage) logoutButton.getScene().getWindow()).close();
    }

    @FXML
    private void handleNewOperationButton() throws java.io.IOException {
        BankAccount selectedBankAccount = accountsTableView.getSelectionModel().getSelectedItem();
        NewBankOperationDialogView newBankOperationDialogView = new NewBankOperationDialogView(selectedBankAccount.getAccountNo());
        newBankOperationDialogView.showAndWait();

        BankOperation newOperation = newBankOperationDialogView.getResult();
        if (newOperation != null) {
            updateAccountDetails(selectedBankAccount, newOperation);
        }
    }

    private void fetchCurrentUser() {
        try {
            currentUser = BankServiceUtil.getInstance().getUserService().getCurrentUser();
        } catch (AuthException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    private void initializeAccountTableView() {
        nameTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        accountNoTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAccountNo()));

        accountsTableView.setItems(bankAccounts);
        accountsTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        showAccountDetails(newValue);
                    }
                });
    }

    private void initializeHistoryTableView() {
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        typeTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
        titleTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));
        amountTableColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.format("%.2f", cellData.getValue().getAmount()) + " PLN"));
        sourceTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(prepareSource(cellData.getValue())));
        targetTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(prepareTarget(cellData.getValue())));
        balanceAfterTableColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.format("%.2f", cellData.getValue().getBalanceAfter()) + " PLN"));
        dateTableColumn.setCellValueFactory(cellData -> {
            Date date = null;
            try {
               date = parser.parse(cellData.getValue().getTimestamp());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new SimpleStringProperty(formater.format(date));
        });
    }

    private void updateBankAccountsList() {
        try {
            List<BankAccount> response = BankServiceUtil.getInstance().getBankAccountService().getCurrentUserBankAccounts();
            bankAccounts.setAll(response);
        } catch (AuthException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    private void resetAccountDetails() {
        nameLabel.setText(null);
        accountNoLabel.setText(null);
        balanceLabel.setText(null);
        historyTableView.setItems(null);
    }

    private void showAccountDetails(BankAccount bankAccount) {
        countFeeButton.setDisable(false);
        newOperationButton.setDisable(false);
        nameLabel.setText(bankAccount.getName());
        accountNoLabel.setText(bankAccount.getAccountNo());
        balanceLabel.setText(String.format("%.2f", bankAccount.getBalance()) + " PLN");
        historyTableView.setItems(FXCollections.observableArrayList(
                bankAccount.getHistory().getBankOperationOrPaymentOrTransfer()));
    }

    private void updateAccountDetails(BankAccount bankAccount, BankOperation bankOperation) {
        balanceLabel.setText(bankOperation.getBalanceAfter() + " PLN");
        historyTableView.getItems().add(bankOperation);
        bankAccount.setBalance(bankOperation.getBalanceAfter());
        bankAccount.getHistory().getBankOperationOrPaymentOrTransfer().add(bankOperation);
    }

    private String prepareSource(BankOperation bankOperation) {
        String source = null;
        switch (bankOperation.getClass().getSimpleName()) {
            case "Payment":
                source = "N/A";
                break;
            case "Withdrawal":
                source = bankOperation.getReceiverAccount();
                break;
            case "Transfer":
                source = ((Transfer) bankOperation).getSenderAccount();
                break;
            case "Fee":
                source = bankOperation.getReceiverAccount();
                break;
        }

        return source;
    }

    private String prepareTarget(BankOperation bankOperation) {
        String target = null;
        switch (bankOperation.getClass().getSimpleName()) {
            case "Payment":
                target = bankOperation.getReceiverAccount();
                break;
            case "Withdrawal":
                target = "N/A";
                break;
            case "Transfer":
                target = bankOperation.getReceiverAccount();
                break;
            case "Fee":
                target = "N/A";
                break;
        }

        return target;
    }
}
