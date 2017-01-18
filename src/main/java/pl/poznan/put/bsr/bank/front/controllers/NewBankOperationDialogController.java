package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.utils.InformationDialogsUtil;
import pl.poznan.put.bsr.bank.services.*;

/**
 * @author Kamil Walkowiak
 */
public class NewBankOperationDialogController {
    private String selectedBankAccountNo;
    private BankOperation resultBankOperation;

    @FXML
    private ComboBox<String> operationTypeComboBox;
    @FXML
    private TextField titleTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private Label sourceAccountNoLabel;
    @FXML
    private Label targetAccountNoLabel;
    @FXML
    private TextField targetAccountNoTextField;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;

    public void setSelectedBankAccountNo(String selectedBankAccountNo) {
        this.selectedBankAccountNo = selectedBankAccountNo;
        targetAccountNoLabel.setText(selectedBankAccountNo);
    }

    public BankOperation getResultBankOperation() {
        return resultBankOperation;
    }

    @FXML
    private void handleOperationTypeComboBox() {
        switch(operationTypeComboBox.getValue()) {
            case "Payment":
                sourceAccountNoLabel.setText("N/A");
                targetAccountNoLabel.setVisible(true);
                targetAccountNoLabel.setText(selectedBankAccountNo);
                targetAccountNoTextField.setVisible(false);
                targetAccountNoTextField.setText(null);
                break;
            case "Withdrawal":
                sourceAccountNoLabel.setText(selectedBankAccountNo);
                targetAccountNoLabel.setVisible(true);
                targetAccountNoLabel.setText("N/A");
                targetAccountNoTextField.setVisible(false);
                targetAccountNoTextField.setText(null);
                break;
            case "Transfer":
                sourceAccountNoLabel.setText(selectedBankAccountNo);
                targetAccountNoLabel.setVisible(false);
                targetAccountNoTextField.setVisible(true);
                break;
        }
    }

    @FXML
    private void handleOkButton() {
        BankOperationService bankOperationService = BankServiceUtil.getInstance().getBankOperationService();
        String title = titleTextField.getText();
        String amount = amountTextField.getText();

        try {
            switch (operationTypeComboBox.getValue()) {
                case "Payment":
                    resultBankOperation = bankOperationService.makePayment(title, amount, selectedBankAccountNo);
                    break;
                case "Withdrawal":
                    resultBankOperation = bankOperationService.makeWithdrawal(title, amount, selectedBankAccountNo);
                    break;
                case "Transfer":
                    String targetAccountNo = targetAccountNoTextField.getText();
                    try {
                        resultBankOperation = bankOperationService.makeTransfer(title, amount, selectedBankAccountNo, targetAccountNo);
                    } catch (IOException_Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }

            Stage stage = (Stage) okButton.getScene().getWindow();
            stage.close();
        } catch (AuthException_Exception | BankOperationException_Exception | BankServiceException_Exception | ValidationException_Exception e) {
            InformationDialogsUtil.showExceptionDialog(e.getMessage());
        }
    }

    @FXML
    private void handleCancelButton() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
