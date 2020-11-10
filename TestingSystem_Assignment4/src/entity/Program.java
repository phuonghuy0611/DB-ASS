//package testing2;
//
//import java.util.Date;
//
//import testing2.Account;
//import testing2.Department;
//import testing2.Group;
//import testing2.Position;
//
//public class Program {
//
//	@SuppressWarnings({ "deprecation", "unused" })
//	public static void main(String[] args) {
//		Department department1 = new Department();
//		department1.DepartmentId = 1;
//		department1.DepartmentName = "Sale";
//
//		Department department2 = new Department();
//		department2.DepartmentId = 2;
//		department2.DepartmentName = "Marketing";
//
//		Department department3 = new Department();
//		department3.DepartmentId = 3;
//		department3.DepartmentName = "IT";
//		// Position
//		Position position1 = new Position();
//		position1.positionId = 1;
//		position1.PositionName = "Dev";
//
//		Position position2 = new Position();
//		position2.positionId = 2;
//		position2.PositionName = "Test";
//
//		Position position3 = new Position();
//		position3.positionId = 3;
//		position3.PositionName = "PM";
//		// Group
//		Group group1 = new Group();
//		group1.groupId = 1;
//		group1.groupName = "Java Fresher";
//
//		group1.createDate = new Date("2020/1/1");
//
//		Group group2 = new Group();
//		group2.groupId = 2;
//		group2.groupName = "C# Fresher";
//		group2.createDate = new Date("2020/4/10");
//
//		Group group3 = new Group();
//		group3.groupId = 3;
//		group3.groupName = "Python Fresher";
//		group3.createDate = new Date("2020/3/5");
//		// Account
//		Account account1 = new Account();
//		account1.accountId = 1;
//		account1.email = "phuonghuy@gmail.com";
//		account1.username = "nnphuy";
//		account1.fullname = "Nguyen Ngoc Phuong Huy";
//		account1.department = department1;
//		account1.position = position1;
//		account1.createDate = new Date("2020/2/2");
//		account1.groupOfAccount = new Group[] { group1, group2 };
//
//		Account account2 = new Account();
//		account2.accountId = 2;
//		account2.email = "nguyenkhanh@gmail.com";
//		account2.username = "nvkhanh";
//		account2.fullname = "Nguyen Van Khanh";
//		account2.department = department2;
//		account2.position = position2;
//		account2.createDate = new Date("2020/8/20");
//		account2.groupOfAccount = new Group[] { group1, group2, group3 };
//
//		Account account3 = new Account();
//		account3.accountId = 3;
//		account3.email = "tuankhai@gmail.com";
//		account3.username = "ltkhai";
//		account3.fullname = "Lam Tuan Khai";
//		account3.department = department3;
//		account3.position = position3;
//		account3.createDate = new Date("2020/5/1");
//		account3.groupOfAccount = new Group[] { group2 };
//		// add GroupAccount
//		group1.accountOfGroup = new Account[] { account1, account2 };
//		group2.accountOfGroup = new Account[] { account1 };
//		group3.accountOfGroup = new Account[] { account1, account2, account3 };
//		// Group Account
//		GroupAccount groupaccount1 = new GroupAccount();
//		groupaccount1.account = account1;
//		groupaccount1.group = group1;
//		groupaccount1.joinDate = new Date("2020/3/3");
//
//		GroupAccount groupaccount2 = new GroupAccount();
//		groupaccount2.account = account2;
//		groupaccount2.group = group1;
//		groupaccount2.joinDate = new Date("2020/9/10");
//
//		GroupAccount groupaccount3 = new GroupAccount();
//		groupaccount3.account = account1;
//		groupaccount3.group = group3;
//		groupaccount3.joinDate = new Date("2020/6/8");
//
//		GroupAccount groupaccount[] = { groupaccount1, groupaccount2, groupaccount3 };
//		Account account[] = { account1, account2, account3, };
//		Department department[] = { department1, department2, department3 };
//
//		Program pro = new Program();
//		System.out.println("Cau 1:");
//		pro.question1(account[1]);
//		System.out.println("Cau 2:");
//		pro.question2(account[1]);
//		System.out.println("Cau 3:");
//		pro.question3(account[1]);
//		System.out.println("Cau 4:");
//		pro.question4(account[0]);
//		System.out.println("Cau 5:");
//		pro.question5(group3);
//		System.out.println("Cau 6:");
//		pro.question6(account[1]);
//		System.out.println("Cau 7:");
//		pro.question7(account[0]);
//		System.out.println("Cau 8:");
//		pro.question8(account);
//		System.out.println("Cau 9:");
//		pro.question9(department);
//		System.out.println("Cau 10:");
//		pro.question10(account);
//		System.out.println("Cau 11:");
//		pro.question11(department);
//		System.out.println("Cau 12:");
//		pro.question12(department);
//		System.out.println("Cau 13:");
//		pro.question13(account);
//		System.out.println("Cau 14:");
//		pro.question14(account);
//		System.out.println("Cau 15:");
//		pro.question15();
//		
//	}
//
//	// cau 1
//	public void question1(Account acc) {
//		if (acc.department == null) {
//			System.out.println("Nhan vien nay chua co phong ban");
//		} else {
//			System.out.println("Phong ban cua nhan vien nay la: " + acc.department.DepartmentName);
//		}
//
//	}
//
//	// cau 2
//	public void question2(Account acc) {
//		if (acc.groupOfAccount == null) {
//			System.out.println("Nhan vien nay chua co group");
//		} else if (acc.groupOfAccount.length == 1 || acc.groupOfAccount.length == 2) {
//			System.out.println("Group cua nhan vien nay la Java Fresher,C# Fresher");
//		} else if (acc.groupOfAccount.length == 3) {
//			System.out.println("Nhan vien nay la nguoi quan trong,tham gia nhieu group");
//		} else {
//			System.out.println("Nhan vien nay la nguoi hong chuyen,tham gia tat ca cac group");
//		}
//	}
//
//	// cau 3
//	public void question3(Account acc) {
//		System.out.println(acc.department == null ? "Nhan vien nay chua co phong ban"
//				: "Phong ban cua nhan vien nay la " + acc.department.DepartmentName);
//	}
//   //cau 4
//	public void question4(Account acc) {
//		System.out.println(acc.position.PositionName == "dev" ? "Day la developer" : "Day khong phai la developer");
//	}
//    //cau 5
//	public void question5(Group gr) {
//		switch (gr.accountOfGroup.length) {
//		case 0:
//			System.out.println("Nhom khong co thanh vien nao");
//			break;
//		case 1:
//			System.out.println("Nhom co mot thanh vien");
//			break;
//		case 2:
//			System.out.println("Nhom co hai thanh vien");
//			break;
//		case 3:
//			System.out.println("Nhom co ba thanh vien");
//			break;
//		default:
//			System.out.println("Nhom co nhieu thanh vien");
//		}
//		;
//	}
//     //cau 6
//	public void question6(Account acc) {
//		switch (acc.groupOfAccount.length) {
//		case 0:
//			System.out.println("Nhan vien nay chua co nhom nao");
//			break;
//		default: {
//			System.out.print("Nhom cua nhan vien nay la: ");
//			for (int i = 0; i < acc.groupOfAccount.length; i++) {
//				System.out.print(acc.groupOfAccount[i].toString());
//				System.out.println();
//			}
//		}
//		}
//
//	}
//    //cau 7
//	public void question7(Account acc) {
//		switch (acc.position.PositionName) {
//		case "dev":
//			System.out.println("Nhan vien nay la Dev");
//			break;
//		default:
//			System.out.println("Nhan vien nay khong phai Dev");
//		}
//	}
//    //cau 8
//	public void question8(Account[] acc) {
//		for (Account ac : acc) {
//			System.out.println(ac.email + ac.fullname + ac.department.DepartmentName);
//		}
//	}
//    //cau 9
//	public void question9(Department[] dpm) {
//		for (Department d : dpm) {
//			System.out.println(d.DepartmentId + " " + d.DepartmentName);
//		}
//	}
//    //cau 10
//	public void question10(Account[] acc) {
//		for (int i = 0; i < acc.length; i++) {
//			System.out.println("Thong tin account thu " + (i + 1) + " la:");
//			System.out.println("Email: " + acc[i].email);
//			System.out.println("Full name: " + acc[i].fullname);
//			System.out.println("Phong ban: " + acc[i].department.DepartmentName);
//
//		}
//
//	}
//    //cau 11
//	public void question11(Department[] dpm) {
//		for (int i = 0; i < dpm.length; i++) {
//			System.out.println("Thong tin deparment thu " + (i + 1) + " la:");
//			System.out.println("	ID: " + dpm[i].DepartmentId);
//			System.out.println("	Name: " + dpm[i].DepartmentName);
//			System.out.println();
//		}
//	}
//    //cau 12
//	public void question12(Department[] dpm) {
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Thong tin department thu " + (i + 1) + " la:");
//			System.out.println("	ID: " + dpm[i].DepartmentId);
//			System.out.println("	Name: " + dpm[i].DepartmentName);
//			System.out.println();
//		}
//	}
//    //cau 13
//	public void question13(Account[] acc) {
//		for (int i = 0; i < acc.length; i++) {
//			if (i != 1) {
//				System.out.println("Thong tin account thu " + (i + 1) + " la:");
//				System.out.println("Email: " + acc[i].email);
//				System.out.println("Full name: " + acc[i].fullname);
//				System.out.println("Phong ban: " + acc[i].department.DepartmentName);
//				System.out.println();
//			} else {
//				continue;
//			}
//		}
//	}
//    //cau 14
//	public void question14(Account[] acc) {
//		for (int i = 0; i < acc.length; i++) {
//			if (acc[i].accountId < 4) {
//				System.out.println("Email: " + acc[i].email);
//				System.out.println("Full name: " + acc[i].fullname);
//				System.out.println("Phong ban: " + acc[i].department.DepartmentName);
//				System.out.println();
//
//			} else {
//				continue;
//			}
//		}
//	}
//    //cau 15
//	public void question15() {
//		for (int i = 0; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			} else
//				continue;
//		}
//	}
//
//}
