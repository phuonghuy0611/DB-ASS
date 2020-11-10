package entity;

import java.util.Scanner;

public class Kysu extends Canbo {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	@SuppressWarnings("resource")
	@Override
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Nganh dao tao : " + nganhDaoTao);
	}
	

}
