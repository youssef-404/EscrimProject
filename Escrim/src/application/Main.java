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
	        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
	        stage.setTitle("Hello!");
	        stage.setScene(scene);
	        stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
