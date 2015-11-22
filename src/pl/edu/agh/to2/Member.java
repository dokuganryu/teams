package pl.edu.agh.to2;

import java.util.List;

public class Member {
	private IWorker worker;
	private Role role;
	private Member supervisor;
	private List<Member> subordinates;
}