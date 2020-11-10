package backend;

import entity.Student;

public class StudentManagement {
	private Student[] students;

	public StudentManagement() {
		students = new Student[11];
	}

	public void initStudents() {
		students[1] = new Student(1, "Huy", 1);
		students[2] = new Student(2, "Khanh", 1);
		students[3] = new Student(3, "Duy", 1);
		students[4] = new Student(4, "Khai", 2);
		students[5] = new Student(5, "Nhat", 2);
		students[6] = new Student(6, "Dat", 2);
		students[7] = new Student(7, "Nghia", 3);
		students[8] = new Student(8, "Minh", 3);
		students[9] = new Student(9, "Hoang", 3);
		students[10] = new Student(10, "Nam", 3);
	}

	public void caLopDiemDanh() {
		for (int i = 1; i <= 10; i++) {
			students[i].diemDanh();
		}
	}

	public void nhomDiHocBai() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 1) {
				students[i].hocBai();
			}
		}
	}

	public void nhomDiDonVeSinh() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 2) {
				students[i].diDonVeSinh();
			}
		}
	}

}
