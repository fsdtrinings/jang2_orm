package p1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		Session hibernate = factory.openSession();   // hibernate - session 
		
	     //saveOperation(hibernate);
		// readOperation(hibernate);
		
	}
	
	public static void saveOperation(Session hibernate)
	{
		Transaction t = hibernate.beginTransaction();
		
		Employee e = new Employee();
		// e.setId(0); // id should be automated field
		e.setName("Varun Kumar");
		e.setSalary(2000);
		e.setDepartment("HR");
		e.setDesignation("HR Executive");
		
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
	
	
}//end class
