module Escrim {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.swt;

	opens application to javafx.graphics, javafx.fxml;
}
