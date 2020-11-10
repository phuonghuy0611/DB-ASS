package testing3;

import java.util.Scanner;

import testing2.Account;

public class DatatypeCasting {

	public static void main(String[] args) {
		//cau1
		Account acc1 = new Account(5240.5f);
		Account acc2 = new Account(10970.055f);

		System.out.println(acc1.toString());
		System.out.print(acc2.toString());
	

		// cau2+3
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.print("Nhap so:");
		x = scanner.nextInt();
		String s = String.format("%05d", x);
		System.out.printf("So sau khi nhap: " + s);
		System.out.printf("So sau khi nhap: " + x%100);
		//cau4
		int a,b;
		System.out.print("Nhap so:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.print("Ket qua:" +a/b);
	
	}
	
};
