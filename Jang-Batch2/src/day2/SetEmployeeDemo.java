package day2;

import java.util.HashSet;
import java.util.Set;

import p1.Employee;

public class SetEmployeeDemo {

	public static void main(String[] args) {
		
		Set<Employee> empSet = new HashSet<>();
		
		Employee e1 = new Employee(1, "Mike", 2000, "ABC-App");// 2005 
		Employee e2 = new Employee(2, "Jenny", 2000, "XYZ-App");//2007
		Employee e3 = new Employee(1, "Mike", 2000, "ABC-App");
		Employee e4 = new Employee(3, "Rama", 2000, "ABC-App");//2007
		Employee e5 = e1;
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		
		System.out.println(empSet);
		System.out.println(empSet.size());
		
		
	}
}
