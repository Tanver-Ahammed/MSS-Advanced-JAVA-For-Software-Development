package buttonfielddemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainButton extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("buttonfield.fxml"));
        primaryStage.setTitle("Setting Button");
        primaryStage.setScene(new Scene(root,750,500));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }
}
