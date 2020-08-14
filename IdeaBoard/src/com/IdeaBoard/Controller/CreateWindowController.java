package com.IdeaBoard.Controller;

import com.IdeaBoard.View.ViewFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.stage.Stage;

public class CreateWindowController extends BaseController{

	public CreateWindowController(ViewFactory viewFactory, String fxmlName) {
		super(viewFactory, fxmlName);
	}
    
	@FXML
    private Label nameHandle;
    
	@FXML
    void closeMenuButton(ActionEvent event) {
		var stage = (Stage)nameHandle.getScene().getWindow();
		viewFactory.closeStage(stage);
    }

    @FXML
    void dragDone(DragEvent event) {

    }

    @FXML
    void dragDropped(DragEvent event) {

    }

    @FXML
    void dragOnCanvas(MouseDragEvent event) {
    	System.out.println("Dragging");

    }

    @FXML
    void dragRealeased(MouseDragEvent event) {
    	System.out.println("dropped");

    }

}
