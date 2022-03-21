package p2;

import java.util.ArrayList;
import java.util.List;

import p1.Employee;

public class ClassAssignment {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>(); //  Specific list of Employees only 
		empList.add(new Employee(1,"Ramesh", 2000, "ICICI- Bank Project"));
		empList.add(new Employee(2,"Pooja", 3000, "Citi- Bank Project"));
		empList.add(new Employee(3,"Sahana", 1500, "ABC Project"));
		empList.add(new Employee(4,"Jai Kumar", 4500, "ICICI- Bank Project"));
		empList.add(new Employee(4,"Neha", 800, "Citi - Bank Project"));
		
		
	}
	
	public void displayEmployeeBasedonId(int id,List<Employee> empList)
	{
		
	}
	
	public void displayEmployeeBasedOnProject(String projectName,List<Employee> empList)
	{
		
	}
	public void displayEmployeeBasedonSalary(int range1,int range2,List<Employee> empList)
	{
		
	}
}
