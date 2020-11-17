package backend.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import entity.Student;

public class Set1 {
	private Set<Student> students;
	@SuppressWarnings("unused")
	private Scanner scanner;

	public Set1() {
		scanner = new Scanner(System.in);
		students = new HashSet<>();
		inputStudents();
	}

	private void inputStudents() {

		// fix list students for testing
		students.add(new Student("Huy"));
		students.add(new Student("Khanh"));
		students.add(new Student("Khai"));
		students.add(new Student("Duy"));
		students.add(new Student("Nhat"));
		students.add(new Student("Hoa"));
	}

	public void printStudent() {
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
	}

	// a) In ra tong so phan tu students
	public void getAmountOfStudent() {
		System.out.println("Student Amount: " + students.size());
	}

	// b) Lay phan tu thu 4 cua student
	public void getIndex4OfStudent() {
		Iterator<Student> studentIterator = students.iterator();
		for (int i = 0; i < 2; i++) {
			studentIterator.next();
		}

		System.out.println("Student thu 4: ");
		System.out.println(studentIterator.next());
	}
	// c) In ra phan tu dau va cuoi students
		public void printFirstAndLastStudent() {
			Iterator<Student> studentIterator = students.iterator();
			System.out.println("Student dau tien:");
			System.out.println(studentIterator.next());

			for (int i = 0; i < students.size() - 2; i++) {
				studentIterator.next();
			}

			System.out.println("Student cuoi cung: ");
			System.out.println(studentIterator.next());
		}

		// d) Them 1 phan tu vao vi tri dau students
		public void addStudentIntoFirstStudents() {

		}

		// e) Them 1 phan tu vao vi tri cuoi students
		public void addStudentIntoLastStudents() {

		}
}
