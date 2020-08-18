package com.IdeaBoard.View;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

import com.IdeaBoard.Controller.BaseController;
import com.IdeaBoard.Controller.CreateWindowController;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class ViewFactory {
	public void showCreateScreen() throws Exception {
		BaseController controller = new CreateWindowController(this, "CreateIdea.fxml");
		showStage(controller);
	}
	
	public void showSplashScreen() throws Exception {
		var loader = new FXMLLoader(getClass().getResource("Splash.fxml"));
		Parent root = loader.load();
		var scene = new Scene(root);
		var stage = new Stage();
		stage.setScene(scene);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.show();		
		PauseTransition delay = new PauseTransition(Duration.seconds(3));
		delay.setOnFinished(( event ) -> {
			stage.close();
			try {
				showCreateScreen();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		delay.play();
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
//		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setMinHeight(600);
		stage.setMinWidth(1000);
		stage.show();
		}
	
	public void closeStage(Stage stage) {
		stage.close();
	}
}


