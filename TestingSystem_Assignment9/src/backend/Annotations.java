package backend;

import entity.Student;

public class Annotations {
	@SuppressWarnings("deprecation")
	public void question2() {
		Student student = new Student(1, "Nguyen Van A");
		System.out.println(student.getID());
		System.out.println(student.getName());



		System.out.println(student.getIdV2());

	}
}
