package pl.poznan.put.bsr.bank.front;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.poznan.put.bsr.bank.front.utils.BankServiceUtil;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BankServiceUtil.getInstance().initialize();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginDialog.fxml"));
        primaryStage.setTitle("e-Bank - Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
