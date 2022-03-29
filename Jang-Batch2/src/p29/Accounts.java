package p29;
                          // step 1 
public class Accounts implements Comparable<Accounts>
{

	int accountNumber;
	String accountHolderName;
	int balance;
	String location;
	int transactionCount;
	
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int accountNumber, String accountHolderName, int balance, String location) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.location = location;
	}
	
	public Accounts(int accountNumber, String accountHolderName, int balance, String location, int transactionCount) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.location = location;
		this.transactionCount = transactionCount;
	}
	
	public int getTransactionCount() {
		return transactionCount;
	}
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + accountNumber;
		result = prime * result + balance;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounts other = (Accounts) obj;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (balance != other.balance)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return " Account Number :- "+accountNumber+" ,User Name  :- "+accountHolderName+" , Account Balance "+balance+" , Location :-  "+location+" , Transaction Count:-  "+transactionCount;
	}
	
	
	// Step 2 : add overriden method
	@Override
	public int compareTo(Accounts a) {
		// this ref to current calling object
		
		return (this.accountNumber - a.accountNumber);
		
		//return (a.location.compareTo(this.location));
	}
	
	
	
	
	
	
	
	
}//end of class
















