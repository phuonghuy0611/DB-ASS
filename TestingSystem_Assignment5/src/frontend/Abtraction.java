package frontend;

import java.util.Scanner;

import backend.New;
import backend.Tuyensinh;

public class Abtraction {

	public static void main(String[] args) {
		question1();
		question2();
	}
	private static void question1() {
		New myNews = new New();
		Scanner scanner = new Scanner(System.in);

		int choose;
		do {
			loadmenu();
			choose = scanner.nextInt();

			switch (choose) {

			case 1:
				myNews.insertNews();
				break;

			case 2:
				myNews.viewListNews();
				break;

			case 3:
				myNews.averageRate();
				myNews.viewListNews();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhap sai ! Nhap lai !");
				break;
			}
		} while (choose != 4);
	}

	private static void loadmenu() {
		System.out.println("=========MENU=========");
		System.out.println("==1. Insert news    ==");
		System.out.println("==2. View list news ==");
		System.out.println("==3. Average rate   ==");
		System.out.println("==4. Exit           ==");
		System.out.println("======================");
		System.out.println("==Ban chon:           ");
	}
	private static void question2() {

		Tuyensinh tuyenSinh = new Tuyensinh();
		Scanner scanner = new Scanner(System.in);

		int choose;

		do {
			loadMenu();
			choose = scanner.nextInt();

			switch (choose) {

			case 1:
				tuyenSinh.themThiSinh();
				break;

			case 2:
				tuyenSinh.hienThiSinh();
				break;

			case 3:
				tuyenSinh.timThiSinh();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhap sai!Nhap lai !");
				break;
			}

		} while (choose != 4);

		scanner.close();
	}

	private static void loadMenu() {
		System.out.println("===============MENU=================");
		System.out.println("=||1. Them thi sinh          ||=");
		System.out.println("=||2. Hien thong tin thi sinh    ||=");
		System.out.println("=||3. Tim kiem theo SBD  ||=");
		System.out.println("=||4. Thoat                      ||=");
		System.out.println("====================================");
		System.out.println("=====Ban chon:                      ");
	}
}


