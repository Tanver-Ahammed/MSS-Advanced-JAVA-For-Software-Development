package basicevent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button btn1;

    @FXML
    Button btn2;

    @FXML
    TextField itemName;

    @FXML
    Label allItems;

    public void initialize() {
        btn1.setDisable(true);
    }

    public void onAddButtonClicked () {

        String item = itemName.getText();
        allItems.setText(allItems.getText() + "\n" + item);

        itemName.setText("");
        btn1.setDisable(true);

    }

    public void keyReleased() {
        if (itemName.getText().isEmpty()) {
            btn1.setDisable(true);
        } else
            btn1.setDisable(false);
    }
}
