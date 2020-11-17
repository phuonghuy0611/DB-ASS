package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student;

public class Comparing {
	private List<Student> students;

	public Comparing() {
		students = new ArrayList<>();
		inputStudents();
	}

	private void inputStudents() {
		students.add(new Student("Huy", LocalDate.parse("2020-10-29"), 8));
		students.add(new Student("Huy", LocalDate.parse("2020-8-29"), 10));
		students.add(new Student("Khanh", LocalDate.parse("2016-05-04"), 6));
		students.add(new Student("Khai", LocalDate.parse("2019-01-29"), 5));
		students.add(new Student("Nhat", LocalDate.parse("2018-04-29"), 8));
		students.add(new Student("Hoa", LocalDate.parse("2020-02-02"), 3));

		System.out.println("List student vua khoi tao: ");
		printStudent();
	}

	private void printStudent() {
		for (Student st : students) {
			System.out.println(st);
		}
	}


//	In ra hoc sinh sap xep theo name
	public void question1() {
		Collections.sort(students);

		System.out.println("List sau khi sap xep theo ten/ ngay sinh/ diem: ");
		printStudent();
	}

}
