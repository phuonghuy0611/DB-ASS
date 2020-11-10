package entity;

import java.util.Scanner;

public class Congnhan extends Canbo {
	private byte bac;

	public byte getBac() {
		return bac;
	}

	@SuppressWarnings("resource")
	@Override
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap bac cua cong nhan: ");
		bac = scanner.nextByte();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Bac: " + bac);
	}

}
