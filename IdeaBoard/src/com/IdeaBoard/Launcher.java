package com.IdeaBoard;

import com.IdeaBoard.View.ViewFactory;

import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {
//pmement strwans
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start (Stage primaryStage) throws Exception{
		var view = new ViewFactory();
		view.showSplashScreen();
	}

}
