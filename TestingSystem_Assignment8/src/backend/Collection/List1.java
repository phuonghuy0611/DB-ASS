package backend.Collection;

import java.util.ArrayList;



import entity.Student;

public class List1 {
	private ArrayList<Student> students;
	

	public List1() {
		
		students = new ArrayList<>();
		inputStudents();
	}

	private void inputStudents() {

		students.add(new Student("Huy"));
		students.add(new Student("Khanh"));
		students.add(new Student("Khai"));
		students.add(new Student("Duy"));
		students.add(new Student("Nhat"));
		students.add(new Student("Hoa"));
	}

	public void printStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	// a) In ra so phan tu student
	public void getAmountOfStudent() {
		System.out.println("Student Amount: " + students.size());
	}

	// b) Lay phan tu thu 4 cua student
	public void getIndex4OfStudent() {
		System.out.println("Student thu 4: ");
		System.out.println(students.get(3));
	}

	// c) In ra phan tu dau va phan tu cuoi cua student
	public void printFirstAndLastStudent() {
		System.out.println(students.get(0));

		System.out.println(students.get(students.size() - 1));
	}

	// d) Them 1 phan tu vao vi tri dau cua student
	public void addStudentIntoFirstStudents() {
		students.add(0, new Student("Van"));

		System.out.println("List Students after adding: ");
		printStudent();
	}

	// e) Them 1 phan tu vao vi tri cuoi cua student
	public void addStudentIntoLastStudents() {
		students.add(students.size(), new Student("Thanh"));

		System.out.println("List Students after adding: ");
		printStudent();
	}

	
}
