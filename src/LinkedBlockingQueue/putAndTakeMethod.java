package LinkedBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Employee{
	String name;
	int salary;
	String department;
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String toString() {
		return "Employee Name : "+ name + " Employee salary : "+salary+" Employee Department : " + department;
	}
}
public class putAndTakeMethod {
public static void main(String[] str) throws InterruptedException {
	BlockingQueue<Employee> queue = new LinkedBlockingQueue<>();
	queue.put(new Employee("Ambaris",121000,"Marketing"));
	queue.put(new Employee("Amba",321000,"Head Marketing"));
	queue.put(new Employee("Ambar",521000,"Global Marketing"));
	queue.put(new Employee("Ambari",1121000,"VP"));
	System.out.println(queue);
	
	while(queue.size() != 0) {
	Employee employee = queue.take();
	System.out.println(employee.toString());
	}
	
}
}
