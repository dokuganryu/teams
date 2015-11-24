package pl.edu.agh.to2;

import java.util.List;

public class Member {
	private IWorker worker;
	private Role role;
	private Member supervisor;
	private List<Member> subordinates;
	
	public Member(IWorker worker) {
		super();
		this.worker = worker;
	}

	@Override
	public String toString() {
		return worker.getName();
	}
	
	
	
}