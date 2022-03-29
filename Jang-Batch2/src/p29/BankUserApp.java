package p29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BankUserApp {

	
	List<Accounts>  dbOutput = new ArrayList<>();
	// act like as db , [select * from AccountsTable]
	
	public BankUserApp() {
	
		Accounts a1 = new Accounts(1058, "Gopala Krishna", 2500, "Banglore",8000);
		Accounts a2 = new Accounts(2047, "Hemamalini", 12500, "Manglore",25);
		Accounts a3 = new Accounts(113, "Surekha", 12500, "Pune",18000);
		Accounts a4 = new Accounts(40, "Sahana", 8500, "Hydrabad",4500);
		
		dbOutput.add(a1);
		dbOutput.add(a2);
		dbOutput.add(a3);
		dbOutput.add(a4);
		
	}
	
	public static void main(String[] args) {
	
		BankUserApp app = new BankUserApp();
		
		while(true)
		{
			System.out.println("1. Load All Accounts");
			System.out.println("2. Sort account based on Balance");
			System.out.println("3. Sort account based on Location");
			System.out.println("4. Sort account based on Number of Transaction");
			System.out.println("0. Exit");
			System.out.println(" Enter ur Choice :- ");
			int userChoice = new Scanner(System.in).nextInt();
			
			
			switch (userChoice) {
			case 1:
				// loading all data to user
				app.sendAllDataToUser();
				break;
				
			case 2: 
				
				app.sortBasedOnBalance();
				break;
			
			case 3:
				app.sortBasedonLocation();
				break;
				
			case 4:
				app.sortBasedonTransactions();
				break;
				
			

			case 0: System.exit(0);
			default:
				break;
			}
			
			
			
		}//end while
		
		
	}//end of main
	
	public void print(Accounts a)
	{
		System.out.println(a);
		System.out.println("--------------------------------");
	}
	
	public void sendAllDataToUser()
	{
	//	TreeSet<Accounts> set = new TreeSet<>(dbOutput); // treeset will automatically sort our data , based on natural order (natural order code is written in compareTo method of bean class)
		
		Collections.sort(dbOutput);
		
		for (Accounts account : dbOutput) {
			print(account);
		}
	}
	
	// not based on natural ordering of the accounts , so create new sorting class
	public void sortBasedOnBalance()
	{
		SortAccountsBasedOnBalance sortingCode = new SortAccountsBasedOnBalance();
		Collections.sort(dbOutput,sortingCode);
		for (Accounts account : dbOutput) {
			print(account);
		}
	}
	
	public void sortBasedonLocation()
	{
		
		Collections.sort(dbOutput,new SortAccountsBasedOnLoction());
		for (Accounts account : dbOutput) {
			print(account);
		}
	}
	
	public void sortBasedonTransactions()
	{
		
		Collections.sort(dbOutput,new SortAccountsBasedOnTransactions());
		for (Accounts account : dbOutput) {
			print(account);
		}
	}
	
	
	
}//end of class
