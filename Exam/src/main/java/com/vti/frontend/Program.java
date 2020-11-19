package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.entity.User;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function function = new Function();
		
		System.out.println("Cau 3:");
		System.out.println("Danh sach Manager cua cac project:");
		function.getListmanager();
		
		System.out.println("Cau 4:");
		System.out.println("MỜI BẠN LOGIN");
		User user = function.login();
		System.out.println("Login successfull!");
		System.out.println("Chào mừng " + user.getFullName() + "!");
	}

}
