package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/view.fxml"));
	        Scene scene = new Scene(fxmlLoader.load());
	        stage.setTitle("Hello!");
	        stage.setScene(scene);
	        stage.show();
	        
	        stage.setMinWidth(stage.getWidth());
	        stage.setMaxWidth(stage.getWidth());
	        stage.setMinHeight(stage.getHeight());
	        stage.setMaxHeight(stage.getHeight());
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
