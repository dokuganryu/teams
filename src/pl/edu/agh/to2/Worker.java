package pl.edu.agh.to2;

public class Worker implements IWorker {
	private String name;

	public Worker(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
