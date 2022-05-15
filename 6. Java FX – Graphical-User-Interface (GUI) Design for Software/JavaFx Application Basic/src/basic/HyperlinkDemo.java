package basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HyperlinkDemo extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before the run.........");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hyperlink");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();


        Label text = new Label("Click not Touch");
        ImageView imageView = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8b589_KiZqOToFlveMaS97zVzYU78s__oNQ&usqp=CAU");
        Hyperlink link = new Hyperlink("Click Me", imageView);

        link.setOnAction(actionEvent -> {
            text.setText("I have been smacked.");
        });

        root.getChildren().addAll(text, link);

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
