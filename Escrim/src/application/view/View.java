package application.view;

import java.io.IOException;

import application.controller.ControllerInterface;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


public class View implements ViewInterface{
	private ControllerInterface controller;
	private Parent root;
    private Pane contentPane;
    private Button inventoryButton;
    private Button deployButton;
    private Button configurationButton;
    private Button statisticsButton;

	public View() throws IOException{
		super();
		this.root = FXMLLoader.load(getClass().getResource("view.fxml"));
		this.inventoryButton = (Button) root.lookup("#inventoryButton");
		this.deployButton = (Button) root.lookup("#deployButton");
		this.configurationButton = (Button) root.lookup("#configurationButton");
		this.statisticsButton = (Button) root.lookup("#statisticsButton");
		this.contentPane = (Pane) root.lookup("#contentPane");
		
		inventoryButton.setOnAction(e -> {
			controller.changePage("inventories");
		});
		
		deployButton.setOnAction(e -> {
			controller.changePage("deploy");
		});
		
		configurationButton.setOnAction(e -> {
			controller.changePage("configuration");
		});
		
		statisticsButton.setOnAction(e -> {
			controller.changePage("statistics");
		});
		
		
		
	}

	public Parent getRoot() {
		inventoryButton.fire();
		return root;
	}
	
	public ControllerInterface getController() {
		
		return controller;
	}
	public void setController(ControllerInterface controller) {
		this.controller = controller;
	}
	
	public void loadPage(String viewPage) {
		try {
			Node pane = FXMLLoader.load(getClass().getResource(viewPage+".fxml"));
			contentPane.getChildren().setAll(pane);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
