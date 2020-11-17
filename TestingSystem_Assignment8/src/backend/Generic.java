package backend;

import entity.StudentG;

public class Generic {
	public void question1_2_3() {
		// Khoi tao student co id la int
		StudentG<Integer> student1 = new StudentG<Integer>(1, "Dang Black");

		// Khoi tao student co id la float
		StudentG<Float> student2 = new StudentG<Float>(2.0f, "Hai Dang Black");

		// Khoi tao student co id la double
		StudentG<Double> student3 = new StudentG<Double>(3.0, "Duy Nguyen VTI");

		// Question 2: T generic method print object
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		// print number
		System.out.println(1);
		System.out.println(2f);
		System.out.println(3d);
	}

	public void question4() {
		// init array
		Integer[] arrInt = { 5, 10, 15 };
		Float[] arrFloat = { 6f, 5f, 15f };
		Double[] arrDouble = { 5.2, 2.6, 6.9 };

		// print array
		System.out.println(arrInt);
		System.out.println(arrFloat);
		System.out.println(arrDouble);
	}
}
