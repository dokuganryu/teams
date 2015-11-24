package pl.edu.agh.to2.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreateTeamController {

	@FXML
	private Button cancelButton;
	
	@FXML
	private void handleCancelAction(Event event) {
		Stage stage = (Stage)cancelButton.getScene().getWindow();
		//TODO: make sure everything is ok
		stage.close();
	}
}