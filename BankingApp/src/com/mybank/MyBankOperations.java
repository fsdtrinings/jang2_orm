package com.mybank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBankOperations {

	List<Client> clientList = new ArrayList<>(); // act like as database for us
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		MyBankOperations app = new MyBankOperations();
		
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
		
	}//end of main

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

		// create client object and populate data inside object
		Client client = new Client();
		client.setAccountNumber(accountNumber);
		client.setBalance(balance);
		client.setClientName(clientName);
		client.setBranchName(branchName);

		// insert object into List/ Database
		clientList.add(client); // insert query of the database

	}

	public void searchClient() {
		System.out.println("Enter client Account Number for searching..");
		int searchAccountNumber = Integer.parseInt(sc.nextLine()); // always take input in string
		boolean isFound = false;

		for (Client client : clientList) {

			if (client.getAccountNumber() == searchAccountNumber) {
				isFound = true;
				System.out.println(" -----   Client Details -----");
				System.out.println(client);
				break;
			}

		}

		if (isFound == false) {
			System.out.println(" Enter Account number Again !!! ");
		}

	}
	
	
	public void viewAllClients()
	{
		for (Client client : clientList) {
			System.out.println(client);
		}
	}

	public void updateBalance() 
	{
		System.out.println("Enter client Account Number for Updating Balance..");
		int searchAccountNumber = Integer.parseInt(sc.nextLine()); // always take input in string

		boolean isFound = false;

		for (Client client : clientList) {

			if (client.getAccountNumber() == searchAccountNumber) {
				isFound = true;
				
				// code to update the balance 
				
				System.out.println("Enter New Balance ");
				int newbalance = Integer.parseInt(sc.nextLine()); // always take input in string

				client.setBalance(newbalance);
				System.out.println(" Balance Updated !!! ");
				
				break;
			}

		}

		if (isFound == false) {
			System.out.println(" Enter Account number Again !!! ");
		}
	}
}//end of class
