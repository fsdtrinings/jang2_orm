package bl;

import java.util.List;

import bo.Client;
import db.ClientDataBase;

/*  Replace by RestController 
 * This code deals with all server related activities */

public class ICICIBankServer
{
	
	ClientDataBase db = new ClientDataBase();// so that server can communicate with DB
	
	public boolean addClient(Client client)
	{
		boolean isClientAdded = false;
		
		// validation 
		
		// security code
		
		// business compliance 
		
		isClientAdded = db.addClientInBranch(client.getBranchName(), client);
		
		return isClientAdded;
		
	}//end of add client
	
	
	public List<Client> getAllClientsBasedOnBranch(String branchName)
	{
		List<Client> clientList = null;
		
		clientList = db.getAllClientsInfoBasedOnBrach(branchName);
		
		
		return clientList;
	
	}
	
	public int getBalanceBasedOnAccountNumber(int accountNumber)
	{
		int balance = 0;
		
		// code to get balance from DB
		
		return balance;
		
	}
	
	public boolean updateBranch(int accountNumber,String newBranchName)
	{
		boolean updateStatus = false;
		
		// code to update branch 
		return updateStatus;
	}
	
	public boolean doDeposit(int accountNumber , int amount)
	{
		return db.depositAmount(accountNumber, amount);
	}
	
	public Client searchClient(int accountNumber)
	{
		return db.getClientInfo(accountNumber);
	}
}//end class
