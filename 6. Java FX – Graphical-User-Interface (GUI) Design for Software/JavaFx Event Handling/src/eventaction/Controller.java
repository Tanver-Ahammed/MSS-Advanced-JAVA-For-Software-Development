package eventaction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField itemName;

    @FXML
    Label allItems;

    @FXML
    Button btn1;

    @FXML
    Button btn2;

    public void initialize() {
//        btn1.setDisable(true);
    }

    public void onAddButtonClicked(ActionEvent event) {
        if (event.getSource().equals(btn1)){
            allItems.setText("Add Clicked");
        } else if (event.getSource().equals(btn2)) {
            allItems.setText("Delete Clicked!!");
        }
    }

    public void keyReleased() {
        if (itemName.getText().isEmpty()) {
            btn1.setDisable(true);
        } else {
            btn1.setDisable(false);
        }
    }
}
