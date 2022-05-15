package basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonToggleDemo extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before the run..............");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Toggle and Radio Button");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        ToggleButton toggleButton1 = new ToggleButton("Violet");
        ToggleButton toggleButton2 = new ToggleButton("Indigo");
        ToggleButton toggleButton3 = new ToggleButton("Blue");
        ToggleButton toggleButton4 = new ToggleButton("Green");
        ToggleGroup toggleGroup = new ToggleGroup();

        toggleButton1.setToggleGroup(toggleGroup);
        toggleButton2.setToggleGroup(toggleGroup);
        toggleButton3.setToggleGroup(toggleGroup);
        toggleButton4.setToggleGroup(toggleGroup);

        RadioButton radioButton1 = new RadioButton("Yellow");
        RadioButton radioButton2 = new RadioButton("Orange");
        RadioButton radioButton3 = new RadioButton("Red");

//        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);

        root.getChildren().addAll(toggleButton1,toggleButton2,toggleButton3,toggleButton4,radioButton1,radioButton2,radioButton3);

        toggleButton1.setOnAction(actionEvent -> {
            System.out.println("This Color is Violet.");
        });

        toggleButton2.setOnAction(actionEvent -> {
            System.out.println("This Color is Indigo.");
        });

        toggleButton3.setOnAction(actionEvent -> {
            System.out.println("This Color is Blue.");
        });

        toggleButton4.setOnAction(actionEvent -> {
            System.out.println("This Color is Green.");
        });

        radioButton1.setOnAction(actionEvent -> {
            System.out.println("This Color is Yellow.");
        });

        radioButton2.setOnAction(actionEvent -> {
            System.out.println("This Color is Orange.");
        });

        radioButton3.setOnAction(actionEvent -> {
            System.out.println("This Color is Red.");
        });




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
