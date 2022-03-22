package com.mybank;
/*
 *   all properties have to be private
 *   default constructor
 *   getters & setters
 *   toString 
 *   equals and hashcode 
 *   compareTo
 * */

public class Client {
	
	private int accountNumber;
	private String clientName;
	private int balance;
	private String branchName;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int accountNumber, String clientName, int balance, String branchName) {
		super();
		this.accountNumber = accountNumber;
		this.clientName = clientName;
		this.balance = balance;
		this.branchName = branchName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Client [accountNumber=" + accountNumber + ", clientName=" + clientName + ", balance=" + balance
				+ ", branchName=" + branchName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + balance;
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
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
		Client other = (Client) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (balance != other.balance)
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		return true;
	}
	
	
	

}
