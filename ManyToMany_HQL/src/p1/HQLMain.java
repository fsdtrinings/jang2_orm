package p1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session hibernate = factory.openSession(); // hibernate - session

		// getAllRecords(hibernate);
		//getAllRecords_2(hibernate);
		//getRecordsBasedOnId(hibernate,2,"neha@gmail.com");
		updateEmailId(hibernate,3,"surekha@capg.com");
	}

	public static void getAllRecords(Session hibernate) {
		String sqlForAllRecords = "SELECT * FROM jang5.instructor";
		String hqlForAllRecords = "FROM Instructor i";

		Query q = hibernate.createQuery(hqlForAllRecords);
		List<Instructor> allInstructors = q.list();

		System.out.println(" All Instructors \n___________________________________\n ");
		allInstructors.stream().forEach((i) -> System.out.println(i));
	}

	public static void getAllRecords_2(Session hibernate) {
		// extract specific columns only
		String hqlForAllRecords = "select  i.instructorName FROM Instructor i";

		Query q = hibernate.createQuery(hqlForAllRecords);
		List<String> allInstructorsName = q.list();

		System.out.println(" All Instructors \n___________________________________\n ");
		allInstructorsName.stream().forEach((name) -> System.out.println(name));

	}
	
	
	public static void getRecordsBasedOnId(Session hibernate,int userInput,String userInputemail) {
		
		String sqlOldQuery = "SELECT * FROM jang5.capginstructor where instructorId = userInput";
		
		
		String hqlQuery = "FROM Instructor where instructorId = :userInput and emailId = :abc";
		Query q = hibernate.createQuery(hqlQuery);
		q.setInteger("userInput", userInput);
		q.setString("abc", userInputemail);
		
		List<Instructor> instructor = q.list(); // q .list internally execute query

		System.out.println(" All Instructors \n___________________________________\n ");
		instructor.stream().forEach((i) -> System.out.println(i));
	}
	
	
	public static void updateEmailId(Session hibernate,int instructorId,String newEmailId)
	{
		Transaction t = hibernate.getTransaction();
		t.begin();
		
		//String sqlOldQuery = "update jang5.capginstructor set emailid = 'neha@capg.com' where instructorId = 2";
	
		
		
		String hqlQuery = "UPDATE Instructor SET emailId = :newabc WHERE instructorId = :userInput";
		Query q = hibernate.createQuery(hqlQuery);
		q.setInteger("userInput", instructorId);
		q.setString("newabc", newEmailId);
		
		int noOfRowEffected = q.executeUpdate();
		System.out.println(noOfRowEffected+" row Updated !!! ");
		t.commit();
		hibernate.close();
	}
	
	
	
	
}// end class
