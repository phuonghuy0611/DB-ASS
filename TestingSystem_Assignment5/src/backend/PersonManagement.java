package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Students;



public class PersonManagement {
	private List<Students> students;
	private Scanner scanner;

	public PersonManagement() {
		students = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void input() {
		System.out.println("Nhap so luong sinh vien : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien thu : " + i);
			students.add(new Students());
		}

	}

	public void showInforStudents() {
		for (Students student : students) {
			student.showInfo();
		}
	}

	public void xetHocBong() {
		System.out.println("Nhap ten sinh vien:");
		String name = scanner.nextLine();

		for (Students student : students) {
			if (student.getName().equals(name)) {
				if (student.isStudentGetScholarship()) {
					System.out.println("Sinh vien nay duoc hoc bong !");
				} else {
					System.out.println("Khong duoc hoc bong !");
				}
				break;
			}
		}
	}

}
