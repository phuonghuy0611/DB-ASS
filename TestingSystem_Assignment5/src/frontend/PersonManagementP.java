package frontend;

import java.util.Scanner;

import backend.PersonManagement;

public class PersonManagementP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PersonManagement personManagement = new PersonManagement();

		int choose;
		do {
			loadMenu();
			choose = scanner.nextInt();

			switch (choose) {
			case 1:
				personManagement.input();
				break;

			case 2:
				personManagement.showInforStudents();
				break;

			case 3:
				personManagement.xetHocBong();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhap sai!Nhap lai !");
				break;
			}

		} while (choose != 4);
	}

	private static void loadMenu() {
		System.out.println("==========MENU=========");
		System.out.println("=||1. Nhap sinh vien  ||=");
		System.out.println("=||2. Hien sinh vien  ||=");
		System.out.println("=||3. Xet hoc bong  ||=");
		System.out.println("=||4. Thoat         ||=");
		System.out.println("=======================");
	}

	}


