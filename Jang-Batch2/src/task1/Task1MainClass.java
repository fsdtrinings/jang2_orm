package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	@Override
	public String toString() {
		return appName+" - "+numberofUsers+" - "+rating;
	}
	
	
}

public class Task1MainClass {
	
	
	public static void main(String[] args) {
		
				
		Task1MainClass obj = new Task1MainClass();
		List<SocialApps> appList = new ArrayList<>();
		
		appList = obj.addSocialApp(appList);
		appList = obj.addSocialApp(appList);
		appList = obj.addSocialApp(appList);
		appList = obj.addSocialApp(appList);
		
		obj.printList(appList);
		
		
		// take social app inputs 
		// create social app object 
	}
	
	// insert social app in the list
	public List<SocialApps> addSocialApp(List<SocialApps> appList)
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Social App Name ");
		String appName = sc.nextLine();
		
		System.out.println("Enter Number of Active Users");
		int activeUsers = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter User Raiting");
		float rating = Float.parseFloat(sc.nextLine());
		
		// creation of social app 
		SocialApps app = new SocialApps(appName, activeUsers, rating);
		
		// write code to insert social app in list 
		appList.add(app);
		
		// write code to return social app
		return appList;
	}
	
	// print list through argument
	public void printList(List<SocialApps> appList)
	{
		// write code to print social app
		for (SocialApps app : appList) {
			System.out.println(app);
		}
	}

}
