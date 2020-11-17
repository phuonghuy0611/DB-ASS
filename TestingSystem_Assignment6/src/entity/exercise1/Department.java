package entity.exercise1;

import utils.ScannerUtils;

public class Department {

	private int id;
	private String name;

	public Department() {
		input();
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Question 9
	private void input() {
		System.out.println("Nhap id : ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");

		System.out.println("Nhap ten : ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}

	@Override
	public String toString() {
		return "Department{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

}
