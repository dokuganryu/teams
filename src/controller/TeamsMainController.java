package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
		System.out.println("Button clicked");
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		teamsTable.getItems().setAll(TeamGenerator.genTeams());
	}
	
}
