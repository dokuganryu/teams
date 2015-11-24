package pl.edu.agh.to2;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.sun.org.apache.xml.internal.utils.ObjectPool;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Team implements ITeam {
	private long TeamId;
	private StringProperty teamName;
	private Date dateOfCreation;
	private List<Member> members;
	private List<Team> subteams;
	private ObjectProperty<Member> leader;
	
	public Team(String teamName, Member leader) {
		this.teamName = new SimpleStringProperty(teamName);
		this.leader = new SimpleObjectProperty<Member>(leader);
	}

	@Override
	public BigDecimal getCostOfTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getFullMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	public StringProperty getTeamNameProperty() {
		return teamName;
	}

	public String getTeamName() {
		return teamName.get();
	}

	public void setTeamName(String name) {
		this.teamName.set(name);
	}

	public ObjectProperty<Member> getLeaderProperty() {
		return leader;
	}
	
	public Member getLeader() {
		return leader.get();
	}

	public void setLeader(Member leader) {
		this.leader.set(leader);
	}

	

	
}