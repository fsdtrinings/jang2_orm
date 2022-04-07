package p1;

import java.time.LocalDate;
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
		Transaction t = hibernate.beginTransaction();
		
		Subject java = new Subject();
		java.setSubjectName("Java");
		java.setDuration(150);
		
		Subject aws = new Subject();
		java.setSubjectName("aws");
		java.setDuration(50);
		
		Subject gc = new Subject();
		java.setSubjectName("Google Cloud");
		java.setDuration(30);
		
		Subject salesforce = new Subject();
		java.setSubjectName("SFDC");
		java.setDuration(100);
		
		Subject oracle = new Subject();
		java.setSubjectName("oracle");
		java.setDuration(170);
		
		Subject python = new Subject();
		java.setSubjectName("python");
		java.setDuration(120);
		
		Subject angular = new Subject();
		java.setSubjectName("Angular");
		java.setDuration(40);
		
		Subject React = new Subject();
		java.setSubjectName("React");
		java.setDuration(55);
		
		
		
		Instructor ramesh = new Instructor();
		Instructor neha = new Instructor();
		Instructor surekha = new Instructor();
		
		
		ramesh.setInstructorName("Ramesh Kumar");
		ramesh.setEmailId("ramesh@gmail.com");
		Set<Subject> rameshSubjects = new HashSet<>();
		rameshSubjects.add(React);
		rameshSubjects.add(angular);
		rameshSubjects.add(java);
		ramesh.setSubjects(rameshSubjects);

		
		neha.setInstructorName("Neha");
		neha.setEmailId("neha@gmail.com");
		Set<Subject> nehaSubjects = new HashSet<>();
		nehaSubjects.add(salesforce);
		neha.setSubjects(nehaSubjects);

		surekha.setInstructorName("surekha");
		surekha.setEmailId("ramesh@gmail.com");
		Set<Subject> surekhaSubjects = new HashSet<>();
		surekhaSubjects.add(gc);
		surekhaSubjects.add(aws);
		surekhaSubjects.add(oracle);
		surekha.setSubjects(surekhaSubjects);

		
		
		hibernate.save(ramesh);
		hibernate.save(neha);
	//	hibernate.save(surekha);
		
		
		
		t.commit();
	}
	
	
	public static void readOperation(Session hibernate)
	{
		
	}
	
	
}
