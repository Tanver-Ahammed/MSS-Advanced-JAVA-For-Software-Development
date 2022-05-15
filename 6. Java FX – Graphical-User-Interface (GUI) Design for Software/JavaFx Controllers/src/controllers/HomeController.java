package controllers;

import javafx.scene.input.MouseEvent;

public class HomeController {
    public void onClickEvent(MouseEvent mouseEvent) {
        System.out.println("The Archer pane was clicked");
    }

    public void onDragEvent(MouseEvent mouseEvent) {
        System.out.println("Mouse Drag Event..");
    }
}
