package grapicsicon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGraphicsIcon extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("grapicsicons.fxml"));
        primaryStage.setTitle("Graphics Icon");
        primaryStage.setScene(new Scene(root,900,500));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }
}
