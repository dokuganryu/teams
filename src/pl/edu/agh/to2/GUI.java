package pl.edu.agh.to2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application{

	private TableView<Team> table;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button createTeamButton = new Button("Create team");	
		createTeamButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Show new window");
			}
		});
		
		Label searchLabel = new Label("Search:");
		TextField searchField = new TextField();
		searchField.setPromptText("name, leader");
		
		table = new TableView<Team>();
		table.setEditable(false);
		
		TableColumn<Team, String> teamName = new TableColumn<>("Team name");
		TableColumn<Team, String> teamLeaderFullName = new TableColumn<>("Team Leader");
		
		table.getColumns().addAll(teamName, teamLeaderFullName);
		
		
		
		
		
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(5);
		grid.setPadding(new Insets(15, 10, 15, 10));
		grid.setAlignment(Pos.CENTER);
		
		grid.add(createTeamButton, 2, 0);
		grid.add(searchLabel, 0, 0);
		grid.add(searchField, 1, 0);
		grid.add(table, 0, 1, 2, 1);

		Scene scene = new Scene(grid, 800, 600);
		primaryStage.setTitle("Hello");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
