package basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuButtonDemo extends Application {
    @Override
    public void init() throws Exception {
        System.err.println("Before the run..............");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Menu Button");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        MenuItem item1 = new MenuItem("ICT");
        MenuItem item2 = new MenuItem("CSE");
        MenuItem item3 = new MenuItem("TE");
        MenuItem item4 = new MenuItem("CPS");

        MenuButton menuButton = new MenuButton("Department of MBSTU", null,item1,item2,item3,item4);
        Label label = new Label("please, Choice!!");

        item1.setOnAction(actionEvent -> {
            System.out.println("Welcome to ICT Department....");
        });

        item2.setOnAction(actionEvent -> {
            System.out.println("Welcome to CSE Department....");
        });

        item3.setOnAction(actionEvent -> {
            System.out.println("Welcome to TE Department....");
        });

        item4.setOnAction(actionEvent -> {
            System.out.println("Welcome to CPS Department....");
        });


        root.getChildren().addAll(menuButton, label);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After the run ..............");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
