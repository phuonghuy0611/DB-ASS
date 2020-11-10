package backend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;

public class Contructor {
	public void question1() {

		// construct object
		Department department = new Department();
		Department department1 = new Department("Sale");

		// print object
		System.out.println(department);
		System.out.println(department1);
	}
	public void question2() {
		// a
		Account account = new Account();
		System.out.println(account);

		// b
		Account account1 = new Account(1, "phuonghuy@gmail.com", "phuonghuy", "Nguyen Ngoc Phuong", "Huy");
		System.out.println(account1);

		// c
		Position position1 = new Position(1, "Sale");
		Position position2 = new Position(2, "Marketing");
		Account account2 = new Account(2, "nguyenkhanh@gmail.com", "khanhnguyen", "Nguyen Van", "Khanh", position1);
		System.out.println(account2);

		// d
		Account account3 = new Account(3, "tuankhai@gmail.com", "tuankhai", "Lam Tuan", "Khai", position2,
				LocalDate.parse("2020-02-02"));
		System.out.println(account3);
	}
	public void question3() {
	// a
	Group group = new Group();
	System.out.println(group);

	// b
	Account creator = new Account(1, "phuonghuy@gmail.com", "phuonghuy", "Nguyen Ngoc Phuong", "Huy");
	Account account2 = new Account(2, "nguyenkhanh@gmail.com", "khanhnguyen", "Nguyen Van", "Khanh");
	Account account3 = new Account(3, "tuankhai@gmail.com", "tuankhai", "Lam Tuan", "Khai");
	Account[] accounts = { creator, account2, account3 };
	Group group1 = new Group(1,"Sale",1, accounts, LocalDate.parse("2020-05-10"));
	System.out.println(group1);

	// c
	String[] usernames = { "phuonghuy1", "phuonghuy2", "phuonghuy3" };
	System.out.println(group1);
	Group group2 = new Group(2, "BOD", 2, usernames, LocalDate.parse("2020-05-15"));
	System.out.println(group2);

	}
}
