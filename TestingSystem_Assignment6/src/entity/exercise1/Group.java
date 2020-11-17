package entity.exercise1;

import java.time.LocalDate;
import java.util.Arrays;

import utils.ScannerUtils;

public class Group {

	private int id;
	private String name;
	private Account[] accounts;
	private LocalDate createDate;

	public Group() {
		accounts = new Account[1000];
		input();
	}

	private void input() {
		System.out.println("Nhap id : ");
		id = ScannerUtils.inputInt("Please input a group id as int, please input again.");

		System.out.println("Nhap ten : ");
		name = ScannerUtils.inputString("Please input a group name, please input again.");

		confirmAddAccount();
	}

	private void confirmAddAccount() {
		System.out.println("Ban co muon add account khac? (nhap 1 la co, 2 la khong): ");

		int choose;
		while (true) {
			choose = ScannerUtils.inputInt("Please input a number as int");

			switch (choose) {
			case 1:
				return;

			case 2:
				addAccount();
				return;

			default:
				System.out.println("Chi duoc nhap 1 hoac 2, moi ban nhap lai: ");
				break;
			}
		}
	}

	private void addAccount() {
		System.out.println("Nhap so luong account co trong group: ");
		int n = ScannerUtils.inputInt("Please input a number as int, please input again.");

		for (int i = 0; i < n; i++) {
			accounts[i] = new Account();
		}
	}

	@Override
	public String toString() {
		return "Group{" + "id=" + id + ", name='" + name + '\'' + ", accounts=" + Arrays.toString(accounts)
				+ ", createDate=" + createDate + '}';
	}
}
