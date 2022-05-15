package graph;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class MainGraphChart extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        NumberAxis xAxis = new NumberAxis(-10,10,1);
        xAxis.setLabel("X Axis Label");

        NumberAxis yAxis = new NumberAxis(-50,100,5);
        yAxis.setLabel("Y Axis Label");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("Line chart Example.");

        series.getData().add(new XYChart.Data(-4,16));
        series.getData().add(new XYChart.Data(-2,4));
        series.getData().add(new XYChart.Data(0,0));
        series.getData().add(new XYChart.Data(2,4));
        series.getData().add(new XYChart.Data(4,16));
        series.getData().add(new XYChart.Data(6,36));
        series.getData().add(new XYChart.Data(8,64));
        series.getData().add(new XYChart.Data(10,100));
        series.getData().add(new XYChart.Data(-6,36));
        series.getData().add(new XYChart.Data(-8,100));
        series.getData().add(new XYChart.Data(-1.5,-15));

        lineChart.getData().add(series);

        Group root = new Group(lineChart);
        Scene scene = new Scene(root, 900,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
























