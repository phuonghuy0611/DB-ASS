package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Canbo;
import entity.Congnhan;
import entity.Kysu;
import entity.Nhanvien;

public class QLCB {
	private ArrayList<Canbo> canbo;

	public QLCB() {
		canbo = new ArrayList<>();
	}

	
	public void addCanBo() {
		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so luong can bo:  ");
		n = scanner.nextInt();

		byte choose;
		Canbo canBo = new Canbo();
		for (int i = 0; i < n; i++) {
			System.out.println("Ban muon nhap can bo nao? (1:Cong nhan || 2: Ky su || 3: Nhan vien) ");
			choose = scanner.nextByte();

			switch (choose) {
			case 1:
				canBo = new Congnhan();
				break;
			case 2:
				canBo = new Kysu();
				break;
			case 3:
				canBo = new Nhanvien();
				break;
			default:
				System.out.println("Nhap sai !");
				i--;
				break;
			}

			canBo.input();
			canbo.add(canBo);

			scanner.close();
		}
	}

	
	@SuppressWarnings("resource")
	public void findCanBo() {
	
		Scanner scanner = new Scanner(System.in);

		String hoTen;
		System.out.println("Nhap ho ten can tim: ");
		hoTen = scanner.nextLine();

		for (Canbo canBo : canbo) {
			if (hoTen.equals(canBo.getHoTen())) {
				canBo.getInfor();
			}
		}
	}


	public void printInforCanBo() {
		for (Canbo canBo : canbo) {
			canBo.getInfor();
		}
	}

	
	@SuppressWarnings("resource")
	public void deleteCanBo() {
		Scanner scanner = new Scanner(System.in);

		String hoTen;
		System.out.println("Nhap ho ten can xoa: ");
		hoTen = scanner.nextLine();

		canbo.removeIf(cb -> hoTen.equals(cb.getHoTen()));
	}
}
