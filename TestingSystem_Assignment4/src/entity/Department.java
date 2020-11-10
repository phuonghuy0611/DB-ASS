package entity;

public class Department {
	private int DepartmentId;
	private String DepartmentName;
	public Department() {

	}

	public Department(String name) {
		this.DepartmentId = 0;
		this.DepartmentName = name;
	}

	public int getId() {
		return DepartmentId;
	}

	public void setId(int id) {
		this.DepartmentId = id;
	}

	public String getName() {
		return DepartmentName;
	}

	public void setName(String name) {
		this.DepartmentName = name;
	}
	@Override public String toString(){
	return "Department[DepartmentId: "+DepartmentId+" DepartmentName: "+DepartmentName+"]";
	}
}
