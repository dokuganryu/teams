package pl.edu.agh.to2;

import java.util.ArrayList;
import java.util.List;

public class TeamGenerator {
	
	public static List<Team> genTeams() {
		List<Team> teams = new ArrayList<>();
		
		teams.add(new Team("The Starks", new Member(new Worker("Eddard Stark"))));
		teams.add(new Team("We have no idea what we are doing", new Member(new Worker("Mikołaj Grzywacz"))));
		teams.add(new Team("The nuts", new Member(new Worker("John Cena"))));
		
		return teams;
	}
}
