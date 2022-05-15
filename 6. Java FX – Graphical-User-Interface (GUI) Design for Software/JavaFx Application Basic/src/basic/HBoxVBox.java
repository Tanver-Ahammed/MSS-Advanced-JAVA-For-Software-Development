package basic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxVBox extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before the run the code.....");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("HBox vs VBox");
        stage.setWidth(400);
        stage.setHeight(500);

//        HBox root = new HBox();
        VBox root = new VBox();

        Button button1 = new Button("ONE");
        Button button2 = new Button("TWO");
        Button button3 = new Button("THREE");
        Button button4 = new Button("FOUR");

        root.setSpacing(50);
//        root.setAlignment(Pos.CENTER);
//        root.setPadding(new Insets(10,20,10,10));
//        root.setMargin(button2, new Insets(50, 20,10,10));


        root.getChildren().addAll(button1, button2, button3, button4);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After the run the code.....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
