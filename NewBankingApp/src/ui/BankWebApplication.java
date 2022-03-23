package ui;

import java.util.List;
import java.util.Scanner;

import bl.ICICIBankServer;
import bo.Client;


/* replace by Angular or React or Mobile front end or ATM device code */

public class BankWebApplication {
	
	Scanner sc = new Scanner(System.in);
	ICICIBankServer server = new ICICIBankServer();// client can communicate with Server
	
	// main is the replacement of client code 
	public static void main(String[] args) {
		
		BankWebApplication app = new BankWebApplication();
		
		while(true)
		{
			
			System.out.println("\n\n ---------- Operations -----------");
			System.out.println("1 . Add Client ");
			System.out.println("2 . Search Client ");
			System.out.println("3 . ====>> Withdraw Amount");
			System.out.println("4 . View All ClientsBy Branch ");
			System.out.println("5 . ====>> View All Clients");
			System.out.println("6 . Deposite Amount ");
			System.out.println("7 . ====>> Change Bank Branch");
			
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
				app.printClientsBasedOnBranch();
				break;
			case 6:
				app.deposit();
				break;
			case 0:
				System.exit(0);
				break;
		
			}//end of switch case
		}//end of while true
	}//end main

	
	public void deposit()
	{
		System.out.println("--------- Deposit Amount Module --------");
		System.out.println("Enter client Account Number ");
		int accountNumber = Integer.parseInt(sc.nextLine()); // always take input in string

		System.out.println("Enter Amount ");
		int amount = Integer.parseInt(sc.nextLine()); // always take input in string

		if(server.doDeposit(accountNumber, amount))
		{
			System.out.println(" Amount Deposit ...");
		}
		else
		{
			System.out.println(" Error !!! ");
		}
	}
	
	
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

	
		Client dummyclient = new Client(accountNumber, clientName, balance, branchName);
		boolean status = server.addClient(dummyclient);
	
		if(status == true)
		{
			System.out.println(" Client Added !!! ");
		}
		else 
		{
			System.out.println("Contact to IT Department or mail info@icici.com");
		}
		
	}

	
	public void printClientsBasedOnBranch()
	{
		System.out.println("Enter Branch Name for Client's Information ");
		String branchName = sc.nextLine();
		
		List<Client> allClients = server.getAllClientsBasedOnBranch(branchName);
		if(allClients != null)
		{
			System.out.println("\n\n ==========  Client's Information ==========");
			int sno = 1;
			for (Client client : allClients) {
				System.out.println((sno++)+") "+client);
				System.out.println("_____________________________________________________");
			}
		}
		else
		{
			System.out.println("Branch Not in the Database ");
		}
		
	}
	
	
	
	public void searchClient() {
		System.out.println("Enter client Account Number for searching..");
		int searchAccountNumber = Integer.parseInt(sc.nextLine()); // always take input in string
		boolean isFound = false;
	
		Client c = server.searchClient(searchAccountNumber);
		
		if(c != null)
		{
			System.out.println(" ============== Client Information =============\n"+c);
		}
		else
		{
			System.out.println("Wrong Account Number  "+searchAccountNumber);
		}

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
