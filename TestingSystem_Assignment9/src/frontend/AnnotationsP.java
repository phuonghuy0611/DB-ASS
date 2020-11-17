package frontend;

import java.util.Date;

import backend.Annotations;

public class AnnotationsP {

	public static void main(String[] args) {
		Annotations annotations = new Annotations();

		quesiton1();
		annotations.question2();
	}

	
	@SuppressWarnings("deprecation")
	public static void quesiton1() {
		Date date = new Date(2020, 4, 29);
		System.out.println(date);
	}

	}


