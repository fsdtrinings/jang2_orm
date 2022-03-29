package p29;

import java.util.TreeSet;

public class CustomSortingDemo {

	public static void main(String[] args) {
		
		TreeSet<Accounts> accountsSet = new TreeSet<>();
	
		Accounts a1 = new Accounts(1058, "Gopala Krishna", 2500, "Banglore");
		Accounts a2 = new Accounts(2047, "Hemamalini", 12500, "Manglore");
		Accounts a3 = new Accounts(113, "Surekha", 12500, "Pune");
		Accounts a4 = new Accounts(40, "Sahana", 8500, "Hydrabad");
		
		
		accountsSet.add(a1);
		accountsSet.add(a2);
		accountsSet.add(a3);
		accountsSet.add(a4);
		
		for (Accounts accounts : accountsSet) {
			System.out.println(accounts);
		}//end of for
		
		
	}//end main
}//end class
