module Calculator {
    requires javafx.fxml;
    requires javafx.controls;

    opens calculator;
    opens calculator.controllers;
}