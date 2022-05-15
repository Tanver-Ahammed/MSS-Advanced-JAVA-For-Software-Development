package addcss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainAddCSS extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addcssbuttonfield.fxml"));

        setUserAgentStylesheet(STYLESHEET_MODENA);
        setUserAgentStylesheet(STYLESHEET_CASPIAN);

        primaryStage.setTitle("Setting Button");
        primaryStage.setScene(new Scene(root,850,550));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }
}
