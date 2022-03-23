package bl;

import java.util.List;

import bo.Client;

/*  Replace by RestController 
 * This code deals with all server related activities */

public class ICICIBankServer
{

	public boolean addClient()
	{
		boolean isClientAdded = false;
		
		// code to insert user into DB
		
		return isClientAdded;
		
	}//end of add client
	
	
	public List<Client> getAllClientsInfo()
	{
		List<Client> clientList = null;
		// code to fetch all clients information from database 
	    
		// load information in List
		
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
	
}//end class
