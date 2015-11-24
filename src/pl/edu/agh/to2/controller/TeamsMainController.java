package pl.edu.agh.to2.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pl.edu.agh.to2.Member;
import pl.edu.agh.to2.Team;
import pl.edu.agh.to2.TeamGenerator;

public class TeamsMainController implements Initializable{
	@FXML
	private Button createTeamButton;
	
	@FXML
	private TextField teamSearcherTextField;
	
	@FXML
	private TableView<Team> teamsTable;
	
	@FXML
	private TableColumn<Team, String> teamNameColumn;
	
	@FXML
	private TableColumn<Team, Member> teamLeaderColumn;
	
	@FXML
	private void handleCreateTeamAction(Event event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/CreateTeamView.fxml"));
			Parent root = (Parent)loader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.DECORATED);
			stage.setTitle("Create team");
			stage.setScene(new Scene(root));
			stage.sizeToScene();
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Could not load .fxml file");
		}
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		teamsTable.getItems().setAll(TeamGenerator.genTeams());
	}
	
}
