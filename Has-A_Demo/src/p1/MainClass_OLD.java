package p1;

import java.time.LocalDate;

public class MainClass_OLD {

	public static void main(String[] args) {
		
		
		
		Employee ramesh = new Employee();
		ramesh.setId(101);
		ramesh.setName("Ramesh Kumar");
		ramesh.setSalary(8000);
		ramesh.setDesignation("SEO Agent");
		ramesh.setDepartment("Digital Marketing");
		
	//	ramesh.setProject("Mobile Brand");  /// gives error , req Project not String
	//	ramesh.setLaptop("Dell- Laptop");// should pass Laptop not string 
		
		Project p1 = new Project();
		p1.setProjectId(800);
		p1.setProjectName("New Mobile Lead Generation");
		p1.setHours(50);
		p1.setStartDate(LocalDate.of(2022,3,15));
		p1.setEndDate(LocalDate.of(2022,4,7));
		
		Laptop dell = new Laptop();
		dell.setBrandName("Dell");
		dell.setLaptopId(7000);
		dell.setDop(LocalDate.of(2020,1,5));
		dell.setRamSize(8);
		
		/*
		 * ramesh.setProject(p1); ramesh.setLaptop(dell);
		 * 
		 * // --- after 1000 lines of code
		 * 
		 * System.out.println(ramesh.getProject());
		 * System.out.println(ramesh.getProject().getProjectName());
		 * System.out.println(ramesh.getProject().getStartDate());
		 * 
		 * System.out.println(ramesh.getLaptop().getDop());
		 */
		
	}
}





















