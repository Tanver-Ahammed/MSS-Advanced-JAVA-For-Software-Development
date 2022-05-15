package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before ru the code......");
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code......");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resource/sample.fxml"));
        Parent loginFile = FXMLLoader.load(getClass().getResource("resource/login.fxml"));

        Scene login = new Scene(loginFile);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(login);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
