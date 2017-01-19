package pl.poznan.put.bsr.bank.front.utils;

import javafx.scene.control.Alert;

/**
 * Util class for showing information dialogs
 * @author Kamil Walkowiak
 */
public abstract class InformationDialogsUtil {
    /**
     * Shows success information dialog
     * @param message dialog message
     */
    public static void showSuccessDialog(String message) {
        showAlert(message, "Success", Alert.AlertType.INFORMATION);
    }

    /**
     * Shows warning dialog
     * @param message dialog message
     */
    public static void showExceptionDialog(String message) {
        showAlert(message, "Warning", Alert.AlertType.WARNING);
    }

    private static void showAlert(String message, String title, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
