package backend;

import entity.Employee;
import entity.Manager;
import entity.Phone;
import entity.VietnamesePhone;
import entity.Waiter;

public class Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Phuong Huy", "0965300250");
		phone.removeContact("Phuong Huy");
		phone.updateContact("Phuong Huy", "0987654321");
		phone.searchContact("Phuong Huy");
	}

	public void question2_3() {
		Employee employee = new Employee("Phuong Huy", 8.2);
		employee.displayInfo();

		Manager manager = new Manager("Van Khanh", 7.3);
		manager.displayInfo();

		Waiter waiter = new Waiter("Tuan Khai", 3.5);
		waiter.displayInfo();
	}
	


}
