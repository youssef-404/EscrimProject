package application.view;

import javafx.scene.Parent;

public interface ViewInterface {
	public Parent getRoot();
	public void loadPage(String viewPage);
}
