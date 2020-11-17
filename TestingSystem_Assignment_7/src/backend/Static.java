package backend;

import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Static {
	private Student[] students;

	public void question1() throws Exception {
		students = new Student[3];
		students[0] = new Student("Nguyen Van A");
		students[1] = new Student("Nguyen Van B");
		students[2] = new Student("Nguyen Van C");

		for (Student student : students) {
			System.out.println(student);
		}

		// Thay doi thanh Dai hoc Cong nghe
		Student.college = "Dai hoc Cong nghe";

		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void question2() {
		// Question2
		System.out.println("So tien cua nhom truoc khi tieu: ");
		System.out.println(Student.getMoneyGroup());

		// Student 1 mua bim bim
		students[0].spend(50);
		System.out.println("So tien sau khi student 1 tieu: ");
		System.out.println(Student.getMoneyGroup());

		System.out.println("So tien cua student 2 truoc khi tieu: ");
		System.out.println(Student.getMoneyGroup());

		// Student 2 mua banh mi
		students[1].spend(20);
		System.out.println("So tien sau khi student 2 tieu: ");
		System.out.println(Student.getMoneyGroup());

		System.out.println("So tien truoc khi student 3 tieu: ");
		System.out.println(Student.getMoneyGroup());

		// Student 3 lay 150k
		students[2].spend(150);
		System.out.println("Số tiền sau khi student 3 tiêu: ");
		System.out.println(Student.getMoneyGroup());

		// Dong quy 50k
		for (Student student : students) {
			student.fund();
		}

		System.out.println("So tien sau khi dong quy: ");
		System.out.println(Student.getMoneyGroup());
	}

	public void question3() {
		System.out.println(MyMath.max(6, 9));
		System.out.println(MyMath.min(6, 9));
		System.out.println(MyMath.sum(6, 9));
	}

	public void question4() {
		Student.changecollege("Dai hoc Thuy loi");

		System.out.println("Sau khi goi method changeCollege: ");
		for (Student student : students) {
			System.out.println(student.getCollege());
		}
	}

	public void question5() {
		System.out.println("So sinh vien duoc tao: ");
		System.out.println(Student.counter);
	}

	public void question6() throws Exception {
		Student student1 = new PrimaryStudent("Nguyen Van A");
		Student student2 = new PrimaryStudent("Nguyen Van B");
		Student student3 = new SecondaryStudent("Nguyen Van C");
		Student student4 = new SecondaryStudent("Nguyen Van D");
		Student student5 = new SecondaryStudent("Nguyen Van E");
		Student student6 = new SecondaryStudent("Nguyễn Van F");

		System.out.println("Couter of Student: " + Student.counter);
		System.out.println("Couter of Primary Student: " + PrimaryStudent.counterPrimary);
		System.out.println("Couter of Secondary Student: " + SecondaryStudent.counterSecondary);
	}

	public void question7() throws Exception {
		Student student1 = new PrimaryStudent("Nguyen Van A");
		Student student2 = new PrimaryStudent("Nguyen Van B");
		Student student3 = new SecondaryStudent("Nguyen Van C");
		Student student4 = new SecondaryStudent("Nguyen Van D");
		Student student5 = new SecondaryStudent("\"Nguyen Van E");
		Student student6 = new SecondaryStudent("Nguyễn Van F");
		Student student7 = new SecondaryStudent("Nguyen Van G");
		Student student8 = new SecondaryStudent("Nguyen Van H");
		Student student9 = new SecondaryStudent("Nguyen Van I");
	}

}
