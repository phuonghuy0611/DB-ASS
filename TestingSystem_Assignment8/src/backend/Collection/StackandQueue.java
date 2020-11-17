package backend.Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import entity.Student;

public class StackandQueue {
	public void question2() {

		System.out.println("Thu tu student den phong van tu som nhat den muon nhat: ");
		printStudentComeEarly();

		System.out.println("Thu tu student den phong van tu muon nhat den som nhat: ");
		printStudentComeLate();
	}

	public void printStudentComeEarly() {
		// init data
		Stack<Student> students = new Stack<>();
		students.push(new Student("Nguyen Ngoc Phuong Huy"));
		students.push(new Student("Nguyen Van Khanh"));
		students.push(new Student("Lam Tuan Khai"));
		students.push(new Student("Do Minh Huy"));

		// Su dung pop de lay Data Element trong stack
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}

	public void printStudentComeLate() {
		// init data
		Queue<Student> students = new LinkedList<>();
		students.add(new Student("Nguyen Ngoc Phuong Huy"));
		students.add(new Student("Nguyen Van Khanh"));
		students.add(new Student("Lam Tuan Khai"));
		students.add(new Student("Do Minh Huy"));


		// Su dung poll de lay Data Element trong stack
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());

	}
}
