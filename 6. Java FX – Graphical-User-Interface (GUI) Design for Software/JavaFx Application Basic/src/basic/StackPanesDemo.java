package basic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPanesDemo extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Stack Panes");
        stage.setWidth(400);
        stage.setHeight(500);

//        Label label1 = new Label("This Label 1");
        ImageView image = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR75kLiavjdpK5fA2M0lO6gVQftgy2rFsFo1Q&usqp=CAU");
        Button button1 = new Button("Button 1");
//        StackPane.setAlignment(button1, Pos.CENTER_LEFT);
//        StackPane.setMargin(button1, new Insets(30));

        StackPane root = new StackPane(image, button1);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
