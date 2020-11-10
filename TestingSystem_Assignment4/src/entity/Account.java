package entity;
import java.time.LocalDate;
import java.util.Arrays;


@SuppressWarnings("unused")
public class Account {
	private int accountId;
	private String email;
	private String username;
	private String fullname;
	private Department department;
	private Position position;
	private LocalDate createDate;
	private Group[] groupOfAccount;

	private float salary;

//	public Account() {
//		this.accountId = 0;
//		this.email = "";
//		this.username = "";
//		this.fullname = "";
//		this.department = new Department();
//		this.position = new Position();
//		this.createDate = new Date();
//		this.groupOfAccount = new Group[10];
//		this.salary = 0;
//	}
//
//	public Account(float s) {
//
//		this.salary = s;
//	}
	public Account() {
	}

	public Account(int id, String email, String username, String firstName, String lastName) {
		this.accountId = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + " " + lastName;
	}

	public Account(int id, String email, String username, String firstName, String lastName, Position position) {
		this.accountId = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + " " + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	public Account(int id, String email, String username, String firstName, String lastName, Position position,
			LocalDate createDate) {
		this.accountId = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	public Account(String username) {
		this.username = username;
	}

//	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", username=" + username + ", fullname="
				+ fullname + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groupOfAccount=" + Arrays.toString(groupOfAccount) + "]"+salary;
//		return "Account co luong: " + salary;
	}

}