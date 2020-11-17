package frontend.exception;

import utils.ScannerUtils;

public class Question78 {
	public static void main(String[] args) {

		System.out.println("Nhap id: ");
		int id = ScannerUtils.inputInt("id phai la so, moi nhap lai: ");

		System.out.println("id cua ban: " + id);

		System.out.println("Nhap money: ");
		float money = ScannerUtils.inputFloat("money phai la so thuc, moi nhap lai: ");

		System.out.println("Money cua ban: " + money);

		System.out.println("Nhap ten: ");
		String name = ScannerUtils.inputString("Ten cua ban phai la String khac rong,moi nhap lai: ");

		System.out.println("Money cua ban: " + name);
	}
}
