package entity;

public class Student {
	public static String college = "Dai hoc bach khoa";
	private static int moneyGroup = 0;
	public static int counter = 0;
	public static final int maxStudent = 7;

	private int id;
	private String name;

	public Student(String name) throws Exception {

		if (counter > maxStudent) {
			throw new Exception("Khong the tao qua 7 sinh vien");
		}

		this.id = ++counter;
		this.name = name;

		// Nop quy
		moneyGroup += 100;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void spend(int money) {
		Student.moneyGroup -= money;
	}

	public void fund() {
		moneyGroup += 50;
	}

	public static void changecollege(String college) {
		Student.college = college;
	}

	public static String getCollege() {
		return college;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", college= " + college + '\'' + '}';
	}
}
