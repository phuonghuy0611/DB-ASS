package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private Gender gender;
	private LocalDate birthday;
	private String address;

	public Person() {
		inputInfo();
	}

	public Person(String name, Gender gender, LocalDate birthday, String address) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	protected void inputInfo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ten:");
		name = scanner.nextLine();

		System.out.println("Nhap gioi tinh (0:Nam,1:Nu, Khac: UNKNOWN): ");
		byte choose = scanner.nextByte();

		switch (choose) {
		case 0:
			gender = Gender.valueOf("MALE");
			break;

		case 1:
			gender = Gender.valueOf("FEMALE");
			break;

		default:
			gender = Gender.valueOf("UNKNOWN");
			break;
		}

		System.out.println("Nhap ngay sinh (yyyy-MM-dd): ");
		birthday = LocalDate.parse(scanner.nextLine());

		System.out.println("Nhap dia chi: ");
		address = scanner.nextLine();
	}

	public void showInfo() {
		System.out.println("Ten: " + name);
		System.out.println("Gioi tinh: " + gender);
		System.out.println("Ngay sinh: " + birthday);
		System.out.println("Dia chi: " + address);
	}

}
