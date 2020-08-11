package com.IdeaBoard.Controller;

import com.IdeaBoard.View.ViewFactory;

import javafx.fxml.FXML;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;

public class CreateWindowController extends BaseController{

	public CreateWindowController(ViewFactory viewFactory, String fxmlName) {
		super(viewFactory, fxmlName);
	}

    @FXML
    void dragDone(DragEvent event) {

    }

    @FXML
    void dragDropped(DragEvent event) {

    }

    @FXML
    void dragOnCanvas(MouseDragEvent event) {

    }

    @FXML
    void dragRealeased(MouseDragEvent event) {

    }

}
