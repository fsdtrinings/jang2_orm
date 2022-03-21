package p2;

import java.util.ArrayList;
import java.util.List;

import p1.Employee;

public class ClassAssignment {

	int x = 10;
	public static void main(String[] args) {

		ClassAssignment app = new ClassAssignment();

		List<Employee> empList = new ArrayList<>(); // Specific list of Employees only
		empList.add(new Employee(1, "Ramesh", 2000, "ICICI- Bank Project"));
		empList.add(new Employee(2, "Pooja", 3000, "Citi- Bank Project"));
		empList.add(new Employee(3, "Sahana", 1500, "ABC Project"));
		empList.add(new Employee(4, "Jai Kumar", 4500, "ICICI- Bank Project"));
		empList.add(new Employee(5, "Neha", 800, "Citi - Bank Project"));

		System.out.println("\n\n ----------Employee Based on ID ----------------------------");
		app.displayEmployeeBasedonId(5, empList);
		
		System.out.println("\n\n ----------Employee Based on Project Name ----------------------------");
		app.displayEmployeeBasedOnProject("ICICI- Bank Project", empList);
		
		System.out.println("\n\n ----------Employee Based on Salary Range ----------------------------");
		app.displayEmployeeBasedonSalary(1800, 5000, empList);
		
		
		
		
	}

	public void displayEmployeeBasedonId(int searchId, List<Employee> empList) {
		for (Employee employee : empList) {

			if (employee.getId() == searchId) {
				System.out.println(employee);
				System.out.println(x);
			}

		} // end of for loop
	}// end of display Id method

	public void displayEmployeeBasedOnProject(String projectName, List<Employee> empList) {
		for (Employee employee : empList) {

			if (employee.getProjectName().equals(projectName)  ) {
				System.out.println(employee);
			}

		} // end of for loop
	}

	public void displayEmployeeBasedonSalary(int range1, int range2, List<Employee> empList) {
		for (Employee employee : empList) {

			if(employee.getSalary()>= range1 && employee.getSalary()<=range2)
			{
				System.out.println(employee);
			}
			

		} // end of for loop
	}
}
