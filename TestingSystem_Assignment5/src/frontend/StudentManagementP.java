package frontend;

import backend.StudentManagement;

public class StudentManagementP {

	public static void main(String[] args) {
		StudentManagement studentManagement = new StudentManagement();

		studentManagement.initStudents();
		studentManagement.caLopDiemDanh();
		studentManagement.nhomDiHocBai();
		studentManagement.nhomDiDonVeSinh();

	}

}
