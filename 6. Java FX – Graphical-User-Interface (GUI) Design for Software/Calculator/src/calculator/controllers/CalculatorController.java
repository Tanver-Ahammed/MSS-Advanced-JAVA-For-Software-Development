package calculator.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalculatorController {

    @FXML
    private Label expression;

    public void insertNumber(String number) {
        expression.setText(expression.getText() + number);
    }


    public void onMouseClicked(MouseEvent mouseEvent) {

        Button button = (Button) mouseEvent.getSource();
        String number = button.getText();

        insertNumber(number);

        switch (number) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                insertNumber(number);
                break;

        }
    }
}
