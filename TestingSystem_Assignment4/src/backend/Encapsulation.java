package backend;

import entity.Student;

public class Encapsulation {
	public void question1() {
		Student student1 = new Student("Huy", "Ha Noi");
		student1.setScore(10);

		Student student2 = new Student("Khanh", "Ha Noi");
		student2.setScore(8);

		Student student3 = new Student("Khai", "Ha Noi");
		student3.setScore(4);

		student3.plusScore(3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
