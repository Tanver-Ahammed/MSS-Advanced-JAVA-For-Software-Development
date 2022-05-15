package basic;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneDemo extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before the run.........");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ICT");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox parent = new VBox();

        Label label1 = new Label("I am a student of ICT department."); // child node
        Label label2 = new Label("My Name is Tanver Ahammed Aminul  Bari.");


        parent.getChildren().addAll(label1, label2);

        Scene scene1 = new Scene(parent);
        scene1.setCursor(Cursor.HAND);

        stage.setScene(scene1);


        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After the Run .........");
    }

    public static void main(String[] args) {
        launch();
    }
}
