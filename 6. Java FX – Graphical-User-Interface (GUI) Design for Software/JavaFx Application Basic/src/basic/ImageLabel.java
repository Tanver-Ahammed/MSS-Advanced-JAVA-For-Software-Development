package basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ImageLabel extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before the run.........");
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Image and Label");


        VBox root = new VBox();

        // setting image
        /*

        Image image = new Image("https://i.ytimg.com/vi/FPw_Pgeixf4/maxresdefault.jpg");
        ImageView imageView = new ImageView(image);
        root.getChildren().add(imageView);
        */

        // setting label

        stage.setWidth(500);
        stage.setHeight(500);


        ImageView imageView = new ImageView("https://mbstu.ac.bd/images/logo_large.jpg");

        Label label1 = new Label("this is a Text Label.", imageView);
        Label label2 = new Label("This is MBSTU logo");
        root.getChildren().addAll(label1, label2);
        label2.setTextFill(Color.web("#9042f5"));
        label2.setFont(new Font(45));
        label2.setRotate(10);


        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.err.println("After the run.........");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
