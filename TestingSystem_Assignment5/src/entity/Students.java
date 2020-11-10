package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Students extends Person {
	private int maSV;
	private float diemTB;
	private String email;

	public Students() {
		inputInfo();
	}

	public Students(String name, Gender gender, LocalDate birthday, String address, int maSV, float diemTB,
			String email) {
		super(name, gender, birthday, address);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
	}

	public int getMaSV() {
		return maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	protected void inputInfo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap MSV: ");
		maSV = scanner.nextInt();

		super.inputInfo();

		System.out.println("Nhap diem TB: ");
		diemTB = scanner.nextFloat();

		System.out.println("Nhap email: ");
		email = scanner.nextLine();

	}

	@Override
	public void showInfo() {
		System.out.println("MSV: " + maSV);
		super.showInfo();
		System.out.println("Diem TB: " + diemTB);
		System.out.println("Email: " + email);
	}

	public boolean isStudentGetScholarship() {
		return diemTB >= 8;
	}

}
