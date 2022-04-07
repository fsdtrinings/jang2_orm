package p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
		Transaction t = hibernate.getTransaction();
		t.begin();
		
		Subject java = new Subject();
		java.setSubjectName("Java");
		java.setDuration(150);
		
		Subject aws = new Subject();
		aws.setSubjectName("aws");
		aws.setDuration(50);
		
		Subject gc = new Subject();
		gc.setSubjectName("Google Cloud");
		gc.setDuration(30);
		
		Subject salesforce = new Subject();
		salesforce.setSubjectName("SFDC");
		salesforce.setDuration(100);
		
		Subject oracle = new Subject();
		oracle.setSubjectName("oracle");
		oracle.setDuration(170);
		
		Subject python = new Subject();
		python.setSubjectName("python");
		python.setDuration(120);
		
		Subject angular = new Subject();
		angular.setSubjectName("Angular");
		angular.setDuration(40);
		
		Subject React = new Subject();
		React.setSubjectName("React");
		React.setDuration(55);
		
		
		
		Instructor ramesh = new Instructor();
		Instructor neha = new Instructor();
		Instructor surekha = new Instructor();
		
		
		ramesh.setInstructorName("Ramesh Kumar");
		ramesh.setEmailId("ramesh@gmail.com");
		ArrayList<Subject> rameshSubjects = new ArrayList<>();
		rameshSubjects.add(React);
		rameshSubjects.add(angular);
		rameshSubjects.add(java);
		ramesh.setSubjects(rameshSubjects);

		
		neha.setInstructorName("Neha");
		neha.setEmailId("neha@gmail.com");
		ArrayList<Subject> nehaSubjects = new ArrayList<>();
		nehaSubjects.add(salesforce);
		nehaSubjects.add(React);
		nehaSubjects.add(java);
		
		neha.setSubjects(nehaSubjects);

		surekha.setInstructorName("surekha");
		surekha.setEmailId("ramesh@gmail.com");
		ArrayList<Subject> surekhaSubjects = new ArrayList<>();
		surekhaSubjects.add(gc);
		surekhaSubjects.add(aws);
		surekhaSubjects.add(oracle);
		surekhaSubjects.add(angular);
		surekha.setSubjects(surekhaSubjects);

		
		
		hibernate.save(ramesh);
		hibernate.flush();
		hibernate.save(neha);
		hibernate.save(surekha);
		
		
		
		t.commit();
		hibernate.close();
	}
	
	
	public static void readOperation(Session hibernate)
	{
		
	}
	
	
}
