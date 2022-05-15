package bar;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Arrays;

public class MainBarChart extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before run the code.....");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList("Speed", "User rating", "Milage", "Safety")));
        xAxis.setLabel("category");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("score");

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Comparison between various cars");

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Fiat");
        series1.getData().add(new XYChart.Data<>("Speed", 1.0));
        series1.getData().add(new XYChart.Data<>("User rating", 3.0));
        series1.getData().add(new XYChart.Data<>("Milage", 5.0));
        series1.getData().add(new XYChart.Data<>("Safety", 5.0));

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Audi");
        series2.getData().add(new XYChart.Data<>("Speed", 5.0));
        series2.getData().add(new XYChart.Data<>("User rating", 6.0));

        series2.getData().add(new XYChart.Data<>("Milage", 10.0));
        series2.getData().add(new XYChart.Data<>("Safety", 4.0));

        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("Ford");
        series3.getData().add(new XYChart.Data<>("Speed", 4.0));
        series3.getData().add(new XYChart.Data<>("User rating", 2.0));
        series3.getData().add(new XYChart.Data<>("Milage", 3.0));
        series3.getData().add(new XYChart.Data<>("Safety", 6.0));

        barChart.getData().addAll(series1, series2, series3);

        Group root = new Group(barChart);

        Scene scene = new Scene(root ,600, 300);
        primaryStage.setTitle("Sample Application");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {
        System.err.println("After run the code .....");
    }
}
