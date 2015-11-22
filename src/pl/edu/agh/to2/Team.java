package pl.edu.agh.to2;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Team implements ITeam {
	private long TeamId;
	private String name;
	private Date dateOfCreation;
	private List<Member> members;
	private List<Team> subteams;
	private Member leader;
	
	
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

}