package basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonMnemonics extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before the run.............");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Button and Mnemonics");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        // button
        Button button1 = new Button("_Click Me");
//        button1.setStyle("-fx-font-size: 20px");
//        button1.setText("ICT is best.");
//        button1.setWrapText(true);

        button1.setMinSize(50,50);
        button1.setPrefSize(100,100);
        button1.setMaxSize(150,150);

        // Mnemonics shortcut buttons
        button1.setMnemonicParsing(true);
        button1.setOnAction(actionEvent -> {
            System.out.println("This is Mnemonics Button.");
        });


        root.getChildren().addAll(button1);
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
