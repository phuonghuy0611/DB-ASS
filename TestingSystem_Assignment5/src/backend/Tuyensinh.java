package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Exam;

public class Tuyensinh implements ITuyensinh {
	private Scanner scanner;

	private List<Exam> examinees;

	public Tuyensinh() {
		examinees = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void themThiSinh() {
		System.out.println("Nhap so luong thi sinh: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			Exam examinee = new Exam();
			examinee.nhap();
			examinees.add(examinee);
		}
	}

	@Override
	public void hienThiSinh() {
		for (Exam examinee : examinees) {
			System.out.println(examinee);
		}
	}

	@Override
	public void timThiSinh() {

		System.out.println("Nhap SBD: ");
		String sbd = scanner.nextLine();

		for (Exam examinee : examinees) {
			if (examinee.getSbd().equals(sbd)) {
				System.out.println(examinee);
			}
		}
	}

}
