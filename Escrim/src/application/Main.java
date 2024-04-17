package application;
	
import java.io.IOException;

import application.controller.Controller;
import application.model.*;
import application.view.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {		
		try {
			ModelInterface model= new Model();
			ViewInterface view = new View();
			
			new Controller(view, model);
			
	        stage.setTitle("Hello!");
	        stage.setScene(new Scene( ((View) view).getRoot()));
	        stage.show();
	        stage.setMinWidth(stage.getWidth());
	        stage.setMaxWidth(stage.getWidth());
	        stage.setMinHeight(stage.getHeight());
	        stage.setMaxHeight(stage.getHeight());
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
//		try {
//			
//			
//	        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/view.fxml"));
//	        Scene scene = new Scene(fxmlLoader.load());
//	        stage.setTitle("Hello!");
//	        stage.setScene(scene);
//	        stage.show();
//	        
//	        stage.setMinWidth(stage.getWidth());
//	        stage.setMaxWidth(stage.getWidth());
//	        stage.setMinHeight(stage.getHeight());
//	        stage.setMaxHeight(stage.getHeight());
//	        
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
