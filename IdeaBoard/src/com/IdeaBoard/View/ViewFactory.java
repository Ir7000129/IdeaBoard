package com.IdeaBoard.View;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;

public class ViewFactory {
	public void showSplashScreen() {
		System.out.print("Application Running");
		var canvas = new Pane();
		
		canvas.setPrefSize(600,500);
//		var vbow = new VBox(new Label("A Label"));
		var scene = new Scene(canvas);
		
		Stage stage = new Stage();
		stage.initStyle(StageStyle.UNDECORATED);
		stage.setScene(scene);
		stage.setTitle("IdeaBoard");
		stage.showAndWait();
	}
	
}
