package pl.poznan.put.bsr.bank.front;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;
import pl.poznan.put.bsr.bank.front.views.LoginDialogView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BankServiceUtil.getInstance().initialize();

        LoginDialogView loginDialog = new LoginDialogView();
        loginDialog.showAndWait();

        if(BankServiceUtil.getInstance().isAuthorized()) {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/AccountOverview.fxml"));
            primaryStage.setTitle("e-Bank");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
    }

    @Override
    public void stop() throws Exception {
        BankServiceUtil bankServiceUtil = BankServiceUtil.getInstance();
        if(bankServiceUtil.isAuthorized()) {
            bankServiceUtil.getUserService().logout();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
