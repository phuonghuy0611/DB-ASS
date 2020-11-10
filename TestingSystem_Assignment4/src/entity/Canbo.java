package entity;

import java.util.Scanner;

public class Canbo {
	private String hoTen;
	private byte tuoi;
	private Gender gioiTinh;
	private String diaChi;

	public Canbo() {
	}

	public String getHoTen() {
		return hoTen;
	}

	public Byte getTuoi() {
		return tuoi;
	}

	public Gender getGioiTinh() {
		return gioiTinh;
	}

	private void setGioiTinh(int gioiTinh) {
		if (gioiTinh == 0) {
			this.gioiTinh = Gender.valueOf("MALE");
		} else if (gioiTinh == 1) {
			this.gioiTinh = Gender.valueOf("FEMALE");
		} else {
			this.gioiTinh = Gender.valueOf("UNKNOWN");
		}
	}

	public String getDiachi() {
		return diaChi;
	}

	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ho ten: ");
		hoTen = scanner.nextLine();

		System.out.println("Nhap tuoi: ");
		tuoi = scanner.nextByte();

		System.out.println("Nhap gioi tinh (0:Nam, 1:Nu, khác: Unknown): ");
		setGioiTinh(scanner.nextInt());

		System.out.println("Nhap dia chi: ");
		diaChi = scanner.nextLine();
	}

	public void getInfor() {
		System.out.println("Ho ten      : " + hoTen);
		System.out.println("Tuoi        : " + tuoi);
		System.out.println("Gioi tinh   : " + gioiTinh);
		System.out.println("Dia chi     : " + diaChi);
	}

	@Override
	public String toString() {
		return "CanBo{" + "hoten='" + hoTen + '\'' + ", tuoi=" + tuoi + ", gt=" + gioiTinh + ", diachi='" + diaChi
				+ '\'' + '}';
	}

}
