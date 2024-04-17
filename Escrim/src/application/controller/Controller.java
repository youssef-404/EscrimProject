package application.controller;

import application.model.ModelInterface;
import application.view.*;

public class Controller implements ControllerInterface {
	private ViewInterface view;
	private ModelInterface model;
	
	public Controller(ViewInterface view, ModelInterface model) {
		super();
		this.view = view;
		this.model = model;
		
		((View) this.view).setController(this);
	}
	
	
	public void changePage(String page) {
		view.loadPage(page);
		
	}
	
}
