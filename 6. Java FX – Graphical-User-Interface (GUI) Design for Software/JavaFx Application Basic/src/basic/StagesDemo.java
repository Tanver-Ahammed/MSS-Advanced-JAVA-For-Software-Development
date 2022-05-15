package basic;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StagesDemo extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("before");
    }

    @Override
    public void start(Stage stage1) throws Exception {
        stage1.setTitle("A cool window");
        stage1.show();

        Stage stage2 = new Stage();
        stage2.setTitle("Second window");

        stage2.setWidth(400);
        stage2.setHeight(400);

        stage2.setX(50);
        stage2.setY(50);

        stage2.show();

        // Modality
        Stage newWindow = new Stage();

        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initOwner(stage2);

        newWindow.initStyle(StageStyle.UTILITY);

        newWindow.getIcons();


        newWindow.setFullScreen(true);


        newWindow.show();



    }

    @Override
    public void stop() throws Exception {
        System.err.println("After");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
