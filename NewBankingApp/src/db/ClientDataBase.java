package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

import bo.Client;

// replace Hibernate / JDBC / JPA / Spring DataJPA

public class ClientDataBase {
     //  branchName   , list of clients 
	Map<String, List<Client>> bankDB = new HashMap<>();
	
	
	
	
	public ClientDataBase() {
		
		// pre filled data 
		
		List<Client> bangloreList = new ArrayList<>();
		
		Client bangloreClient1 = new Client(101, "Athulya",2000, "Banglore");
		Client bangloreClient2 = new Client(102, "Bhagyashree",12000, "Banglore");
		Client bangloreClient3 = new Client(103, "Jaikumar",4000, "Banglore");
		
		bangloreList.add(bangloreClient1);
		bangloreList.add(bangloreClient2);
		bangloreList.add(bangloreClient3);
		
		
		
		List<Client> delhiList = new ArrayList<>();
		
		Client delhiClient1 = new Client(201, "Ramesh",12000, "Delhi");
		Client delhiClient2 = new Client(202, "Suresh",4000, "Delhi");
		
		delhiList.add(delhiClient1);
		delhiList.add(delhiClient2);
		
		bankDB.put("Banglore", bangloreList);
		bankDB.put("Delhi", delhiList);
		
			
	}

	public boolean addClientInBranch(String branchName,Client client)
	{
		boolean status = false;
		
		List<Client> clientList = bankDB.get(branchName);
		
		if(clientList == null)
		{
			List<Client> list = new ArrayList<>(); // create new list of clients if branch info is not available
			list.add(client);
			bankDB.put(branchName, list);
			status = true;
			
		}
		else
		{
			
			clientList.add(client); // in case if branchInfo is already available , update the previous list
			bankDB.put(branchName, clientList);
			status = true;
		}
		
		return status;
	}
	
	public Map<String, List<Client>> getAllClientsInfo()
	{
		return bankDB;
	}
	
	public List<Client> getAllClientsInfoBasedOnBrach(String branchName)
	{
		return bankDB.get(branchName);
	}
	
	
	public Client getClientInfo(int searchAccountNumber)
	{
		boolean isFound = false;
		for (Map.Entry<String, List<Client>> entry : bankDB.entrySet() )
		{
			
			List<Client> clientList = entry.getValue();
			
			for (Client client : clientList) {
				
				int currentClientAccountNumber = client.getAccountNumber();
				
				if(currentClientAccountNumber == searchAccountNumber)
				{
					isFound = true;
					return client;
				}
			}//end list
			
		}//end of map 
		
		return null;
	}//end of method
	
	
	public boolean depositAmount(int searchAccountNumber,int amount)
	{
		Client c = getClientInfo(searchAccountNumber);
		
		//System.out.println(" ---->> inside DB class client "+c);
		
		if(c == null) return false;
		else
		{
			
			String branchName = c.getBranchName();
			int currentBalance = c.getBalance();
			
			//System.out.println(" ----->> inside else branch Name "+branchName+"  and curret balance "+currentBalance);
			
			
			List<Client> clients = bankDB.get(branchName);
			for (Client client : clients) {
				
				
				if(client.getAccountNumber() == searchAccountNumber)
				{
					//System.out.println("----->> inside for loop clients only "+client);
					client.setBalance(currentBalance+amount);
					break;
				}
			}
			
			//System.out.println("\n\n\n"+clients);
			
			bankDB.put(branchName, clients);
			
			//System.out.println("\n\n\n"+bankDB);
			return true;
		}
		
			
	}//end of deposit amount () 
	
	
	
	
	
}
