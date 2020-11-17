package entity;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	@Deprecated
	public int getID() {
		return id;
	}

	public String getIdV2() {
		return "MSV" + id;
	}

	public String getName() {
		return name;
	}
}
