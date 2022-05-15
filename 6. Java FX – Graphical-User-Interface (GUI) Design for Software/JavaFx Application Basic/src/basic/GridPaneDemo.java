package basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.......");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("GridPane");
        stage.setWidth(400);
        stage.setHeight(500);

        Label userName = new Label("Username: ");
        Label email = new Label("E-Mail:");
        Label password = new Label("Password: ");

        TextField userNameField = new TextField();
        TextField emailField = new TextField();
        TextField passwordField = new PasswordField();

        Button finishButton = new Button("Create Account");

        GridPane root = new GridPane();

        root.add(userName,0,0);
        root.add(email,0,1);
        root.add(password,0,2);

        root.add(userNameField,1,0);
        root.add(emailField,1,1);
        root.add(passwordField,1,2);

        root.add(finishButton, 1,3);

        // customize GridPane
        root.setVgap(10);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("After run the code .......");
    }
}
