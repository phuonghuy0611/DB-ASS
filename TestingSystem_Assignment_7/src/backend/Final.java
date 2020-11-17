package backend;

import entity.Final.MyMath;
import entity.Final.Q3.PrimaryStudent;
import entity.Final.Q3.SecondaryStudent;
import entity.Final.Q3.Student;


public class Final {
	public void question1() {
		System.out.println(MyMath.sum(6));
	}

	public void question2() throws Exception {
		Student student1 = new Student(1, "Huy");
		System.out.println(student1);
		Student student2 = new Student(2, "Khanh");
		System.out.println(student2);
	}

	public void question3() {
		PrimaryStudent.study();
		SecondaryStudent.study();
	}
}
