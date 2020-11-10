package entity;

import java.util.Scanner;

public class Nhanvien extends Canbo {
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	@SuppressWarnings("resource")
	@Override
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap cong viec: ");
		congViec = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Cong viec  : " + getCongViec());
	}

}
