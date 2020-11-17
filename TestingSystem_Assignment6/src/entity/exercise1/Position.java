package entity.exercise1;

import utils.ScannerUtils;

public class Position {

	private int id;
	private String name;

	public Position() {
		input();
	}

	public Position(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private void input() {
		System.out.println("Nhap id : ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");

		System.out.println("Nhap ten : ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}

	@Override
	public String toString() {
		return "Position{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
