package com.IdeaBoard;

import com.IdeaBoard.View.ViewFactory;

import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start (Stage primaryStage) {
		var view = new ViewFactory();
		view.showSplashScreen();
	}

}
