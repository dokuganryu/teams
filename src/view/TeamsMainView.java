package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TeamsMainView extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = null;
		
		try {
			root = FXMLLoader.load(getClass().getResource("TeamsMainView.fxml"));	
		} catch (NullPointerException e) {
			System.err.println("Could not load .fxml file");
		}
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
