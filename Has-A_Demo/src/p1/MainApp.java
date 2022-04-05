package p1;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		Session hibernate = factory.openSession();   // hibernate - session 
		
	    saveOperation(hibernate);
		// readOperation(hibernate);
		
	}
	
	public static void saveOperation(Session hibernate)
	{
		Transaction t = hibernate.beginTransaction();
		
		Employee e = new Employee();
		// e.setId(0); // id should be automated field
		e.setName("Ramesh Kumar");
		e.setSalary(2000);
		e.setDepartment("HR");
		e.setDesignation("HR Executive");
		
		ProfileDetails profile = new ProfileDetails();
		profile.setEmailId("ramesh@abc.com");
		profile.setHomeAddress("NewDelhi-123");
		profile.setBankAccountNumber(123456789);
		profile.setBankName("ICICI- Bank");
		profile.setIfscCode("ICIC00048484");
		profile.setLinkinProfileLink(".../varun");
		profile.setPanNumber("ABC123XYZ4");
		profile.setPhoneNumber("959595954");
		
		e.setProfile(profile);
		
		
		Project p1 = new Project();
		p1.setProjectName("New Mobile Lead Generation");
		p1.setHours(50);
		p1.setStartDate(LocalDate.of(2022,3,15));
		p1.setEndDate(LocalDate.of(2022,4,7));
		
		e.setProjectinfo(p1);
		
		hibernate.save(e); // save query which replace SQL insert
		
		t.commit();
	}
	
	
	public static void readOperation(Session hibernate)
	{
		// for read operation we dont need transaction object
		           // 1st argument :- class Name.class
				   // 2nd argument  :- ID (primary key value)
		Employee outputValue = (Employee)hibernate.get(Employee.class, 2);
		System.out.println(outputValue);
	}
	
	
}
