package exeHandling;

import java.util.Iterator;

class Dog
{
	String dogName;
}//end dog class

public class Demo1 {
	
	public static void main(String[] args) {
		try // contains code which may generate an execption
		{
			Dog myDog = new Dog();
			myDog.dogName = "akiko"; 
			System.out.println(myDog.dogName);
			
			Dog newDog = null;
			newDog.dogName = "Jono"; 	  // leads to Null Pointer Exception
			/* if execption occurs , object of exception will be created and passes to catch block*/
			System.out.println(newDog.dogName);
		
			System.out.println("statement - 3 , will not execute if execption occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("Problem is "+e.getMessage());
		}
		
		applicationCloseActivity();
		
	}//end main
	
	public static void applicationCloseActivity()
	{
		int task = 1;
		for ( task = 1; task<=10;task++) {
			// code to execute 10 closing task 
		}
		System.out.println(" ---------- Application close "+task+" closing task executed --------------- ");
	}

}//end class


