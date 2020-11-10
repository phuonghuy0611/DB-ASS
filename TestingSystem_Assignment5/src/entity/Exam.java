package entity;

import java.util.Scanner;

public class Exam {
	private String sbd;
	private String hoTen;
	private String diaChi;
	private byte mucUuTien;
	private Khoi khoi;

	public String getSbd() {
		return sbd;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap SBD: ");
		sbd = scanner.nextLine();

		System.out.println("Nhap ho ten: ");
		hoTen = scanner.nextLine();

		System.out.println("Nhap dia chi: ");
		diaChi = scanner.nextLine();

		System.out.println("Nhap muc uu tien: ");
		mucUuTien = scanner.nextByte();

		System.out.println("Nhap khoi A/B/C");
		khoi = new Khoi();
		khoi.setTen(scanner.nextLine());
	}

	@Override
	public String toString() {
		return "Examinee{" + "sbd='" + sbd + '\'' + ", hoTen='" + hoTen + '\'' + ", diaChi='" + diaChi + '\''
				+ ", mucUuTien=" + mucUuTien + ", khoi=" + khoi.getMonThi() + '}';
	}
}
