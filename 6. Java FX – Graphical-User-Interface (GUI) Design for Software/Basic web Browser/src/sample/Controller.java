package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;

public class Controller {

    @FXML
    public WebView webSpace;

    @FXML
    public TextField urlField;

    public void keyCheck(KeyEvent keyEvent) {

        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            this.webSpace.getEngine().load(urlField.getText());
        }
    }
}
