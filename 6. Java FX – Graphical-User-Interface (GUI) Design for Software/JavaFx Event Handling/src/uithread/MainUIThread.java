package uithread;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainUIThread extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("uithread.fxml"));
        primaryStage.setTitle("Action Event");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the the code .....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
