package com.IdeaBoard.Controller;

import com.IdeaBoard.View.ViewFactory;

//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
//import javafx.scene.input.DragEvent;
//import javafx.scene.input.MouseDragEvent;
import javafx.stage.Stage;

public class CreateWindowController extends BaseController{

	public CreateWindowController(ViewFactory viewFactory, String fxmlName) {
		super(viewFactory, fxmlName);
	}
    
	@FXML
    private Label nameHandle;
    
	@FXML
    void closeMenuButton() {
		var stage = (Stage)nameHandle.getScene().getWindow();
		viewFactory.closeStage(stage);
    }

}
