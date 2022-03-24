package task1;

import java.util.ArrayList;
import java.util.List;

class SocialApps
{
	public String appName;
	public int numberofUsers;
	public float rating;
	
	public SocialApps(String appName, int numberofUsers, float rating) {
		super();
		this.appName = appName;
		this.numberofUsers = numberofUsers;
		this.rating = rating;
	}
	
	
}

public class Task1MainClass {
	
	
	public static void main(String[] args) {
		/*
		List<String> socialApps = new ArrayList<>();
		  its just a String information
		socialApps.add("Facebook");
		socialApps.add("Instgram");
		socialApps.add("Whatsapp");
		socialApps.add("Twitter");
		socialApps.add("Snapchat");
		
		*/
		
		Task1MainClass obj = new Task1MainClass();
		List<SocialApps> appList = new ArrayList<>();
		
		SocialApps app1 = new SocialApps("Facebook", 5000, 3.8f);
		SocialApps app2 = new SocialApps("Instagram", 15000, 4.8f);
		SocialApps app3 = new SocialApps("Whatsapp", 55000, 4.8f);
		SocialApps app4 = new SocialApps("Twitter", 3000, 4.2f);
		
		
		
		appList.add(app1);
		// add few more social apps
		
		// take social app inputs 
		// create social app object 
	}
	
	// insert social app in the list
	public ___________ addSocialApp(___________)
	{
		
		// write code to insert social app in list 
		
		// write code to return social app
		
	}
	
	// print list through argument
	public void printList(____________________)
	{
		// write code to print social app
	}

}
