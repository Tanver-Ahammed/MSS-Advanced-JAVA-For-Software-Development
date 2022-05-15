package layouts.vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainVBox extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("vbox.fxml"));
        primaryStage.setTitle("JavaFx VBox");
        primaryStage.setScene(new Scene(root, 700, 350));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
