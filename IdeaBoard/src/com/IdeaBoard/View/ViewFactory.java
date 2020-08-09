package com.IdeaBoard.View;

import javafx.stage.Stage;
//import javafx.stage.StageStyle;
import javafx.stage.StageStyle;

import java.io.IOException;

import com.IdeaBoard.Controller.BaseController;
import com.IdeaBoard.Controller.SplashController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;

public class ViewFactory {
	public void showSplashScreen() throws Exception {
		BaseController con = new SplashController(this, "Splash.fxml");
		showStage(con);
		
	}
	
	public void showStage(BaseController controller) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
		loader.setController(controller);
		Parent root;
		try {
			root = loader.load();	
		}catch (IOException e) {
			System.out.print("Loading Failed");
			e.printStackTrace();
			return;
		}
		var scene = new Scene(root);
		var stage = new Stage();
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
		}
	}

//	public void showSplashScreen() {
//		
//		var canvas = new Pane();
//		var loader = new FXMLLoader();
//		canvas.setPrefSize(600,500);
////		var vbow = new VBox(new Label("A Label"));
//		var scene = new Scene(canvas);
//		
//		Stage stage = new Stage();
//		stage.initStyle(StageStyle.UNDECORATED);
//		stage.setScene(scene);
//		stage.setTitle("IdeaBoard");
//		stage.showAndWait();
//	}
	

