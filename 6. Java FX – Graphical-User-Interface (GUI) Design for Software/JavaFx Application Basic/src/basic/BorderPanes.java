package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPanes extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code..............");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Border Panes");
        stage.setWidth(400);
        stage.setHeight(500);

        BorderPane root = new BorderPane();

        Button button1 = new Button("ICT");
        Button button2 = new Button("CSE");
        Button button3 = new Button("TE");
        Button button4 = new Button("CPS");
        Button button5 = new Button("BMB");


        root.setCenter(button1);
        root.setTop(button3);
        root.setBottom(button2);
        root.setLeft(button5);
        root.setRight(button4);

        BorderPane.setAlignment(button3, Pos.CENTER);
        BorderPane.setAlignment(button4, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Before run the code ..............");
    }
}
