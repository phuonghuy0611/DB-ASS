package entity.exercise1;

import backend.exception.InvalidAgeInputingException;
import utils.ScannerUtils;

public class Account {

	private int id;
	private String email;
	private String username;
	private String fullname;
	private int age;

	public Account() {
		input();
	}

	private void input() {
		System.out.println("Nhap id: ");
		id = ScannerUtils.inputInt("Please input a number as int, please input again.");

		System.out.println("Nhap email: ");
		email = ScannerUtils.inputString("Please input a email, please input again.");

		System.out.println("Nhap username: ");
		username = ScannerUtils.inputString("Please input a String, please input again.");

		System.out.println("Nhap fullname: ");
		fullname = ScannerUtils.inputString("Please input a String, please input again.");

		System.out.println("Nhap tuoi cua ban: ");
		age = inputAccountAge();

	}


	private int inputAge() throws InvalidAgeInputingException {
		int age = ScannerUtils.inputInt("Please input an age as int, please input again.");

		if (age < 0) {
			throw new InvalidAgeInputingException("The age must be greater than 0, please input again.");
		}

		return age;
	}

	private int inputAccountAge() {
		while (true) {
			try {
				int age = inputAge();
				if (age < 18) {
					System.out.println("Your age must be greater than 18, please input again.");
				} else {
					return age;
				}
			} catch (InvalidAgeInputingException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public String toString() {
		return "Account{" + "id=" + id + ", email='" + email + '\'' + ", username='" + username + '\'' + ", fullname='"
				+ fullname + '\'' + ", age=" + age + '}';
	}

}
