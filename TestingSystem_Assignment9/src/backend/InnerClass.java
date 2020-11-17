package backend;

import entity.CPU;
import entity.CPU.Processor;
import entity.CPU.Ram;
import entity.Car;
import entity.Car.Engine;

@SuppressWarnings("unused")
public class InnerClass {
	public void question1() {

		CPU cpu = new CPU(100);
		CPU.Ram ram = cpu.new Ram(8, "HP");
		CPU.Processor processor = cpu.new Processor(4, "Dell");

		
		System.out.println(ram.getClockSpeed());

		
		System.out.println(processor.getCache());
	}



	public void question2() {

		Car car = new Car("Mazda", "BMW");

		Engine engine = car.new Engine();
		engine.setEngineType("Crysler");

		car.setEngine(engine);

		car.printInfor();
	}
}
