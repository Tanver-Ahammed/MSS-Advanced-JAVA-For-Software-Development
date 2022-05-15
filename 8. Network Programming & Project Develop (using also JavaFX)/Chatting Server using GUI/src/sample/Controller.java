package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.ObjectOutputStream;

public class Controller {

    ObjectOutputStream oos;

    public ObjectOutputStream getOos() {
        return oos;
    }

    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
    }

    public void clientListClicked(MouseEvent mouseEvent) {

    }

    public void offlineClicked(ActionEvent event) {

    }
}
