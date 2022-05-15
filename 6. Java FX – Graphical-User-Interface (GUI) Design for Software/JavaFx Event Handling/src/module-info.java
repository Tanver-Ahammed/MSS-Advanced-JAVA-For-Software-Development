module JavaFx.Event.Handling {
    requires javafx.fxml;
    requires javafx.controls;

    opens basicevent;
    opens eventaction;
    opens uithread;
}