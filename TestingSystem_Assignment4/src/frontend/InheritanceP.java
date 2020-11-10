package frontend;

import java.util.Scanner;

import backend.QLCB;

public class InheritanceP {

	public static void main(String[] args) {
		
		InheritanceP inheritance = new InheritanceP();
		inheritance.question1_2();
		
	}

	private static void menuQuesion1_2() {
		System.out.println("=======MENU==========");
		System.out.println("==  1.Them can bo ==");
		System.out.println("==  2.Hien can bo ==");
		System.out.println("==  3. Tim can bo  ==");
		System.out.println("==  4. Xoa can bo  ==");
		System.out.println("==  0. Thoat      ==");
		System.out.println("=====================");
	}

	@SuppressWarnings("resource")
	public void question1_2() {
		QLCB qlcb = new QLCB();

		byte choose;
		do {
			Scanner scanner = new Scanner(System.in);
			menuQuesion1_2();
			choose = scanner.nextByte();

			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.printInforCanBo();
				break;
			case 3:
				qlcb.findCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhap sai ! Nhap lai !");
				break;
			}
		} while (choose != 0);

	}
	}


