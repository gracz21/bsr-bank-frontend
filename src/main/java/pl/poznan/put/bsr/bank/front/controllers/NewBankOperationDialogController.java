package pl.poznan.put.bsr.bank.front.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author Kamil Walkowiak
 */
public class NewBankOperationDialogController {
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
    private void handleOkButton() {

    }

    @FXML
    private void handleCancelButton() {

    }
}
