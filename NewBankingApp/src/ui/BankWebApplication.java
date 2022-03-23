package ui;

import java.util.Scanner;


/* replace by Angular or React or Mobile front end or ATM device code */

public class BankWebApplication {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		BankWebApplication app = new BankWebApplication();
		
		while(true)
		{
			
			System.out.println("\n\n ---------- Operations -----------");
			System.out.println("1 . Add Client ");
			System.out.println("2 . Search Client ");
			System.out.println("3 . Update Balance");
			System.out.println("4 . View All Clients");
			
			System.out.println("0 . Exit ");
			
			System.out.println("Enter Ur Choice :- ");
			int choice = Integer.parseInt(app.sc.nextLine()); // need object in order to access non-static data
			
			switch (choice) {
			case 1:
				app.addClient();
				break;
			case 2:
				app.searchClient();
				break;
			case 3:
				app.updateBalance();
				break;
			case 4: 
				app.viewAllClients();
			case 0:
				System.exit(0);
				break;
		
			}//end of switch case
		}//end of while true
	}//end main

	
	public void addClient() {
		// input information of the client

		System.out.println("Enter client Account Number ");
		int accountNumber = Integer.parseInt(sc.nextLine()); // always take input in string

		System.out.println("Enter client Account Name ");
		String clientName = sc.nextLine();

		System.out.println("Enter Balance ");
		int balance = Integer.parseInt(sc.nextLine()); // always take input in string

		System.out.println("Enter Branch Name ");
		String branchName = sc.nextLine();

		System.out.println(" User has entered "+accountNumber+" - "+clientName+" "+balance+"- "+branchName);

	}

	public void searchClient() {
		System.out.println("Enter client Account Number for searching..");
		int searchAccountNumber = Integer.parseInt(sc.nextLine()); // always take input in string
		boolean isFound = false;
		
		System.out.println(" search from DB ...(pending...)");
		

	}
	
	
	public void viewAllClients()
	{
		System.out.println(" load from DB ...(pending...)");
	}

	public void updateBalance() 
	{
		System.out.println("Enter client Account Number for Updating Balance..");
		int searchAccountNumber = Integer.parseInt(sc.nextLine()); // always take input in string

		System.out.println(" search user and update in DB ...(pending...)");
	}
	
	
	
}//end of class
