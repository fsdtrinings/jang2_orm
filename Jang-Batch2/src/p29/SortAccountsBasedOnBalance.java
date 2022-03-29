package p29;

import java.util.Comparator;

public class SortAccountsBasedOnBalance implements Comparator<Accounts>{

	@Override
	public int compare(Accounts a1, Accounts a2) {
		return a1.getBalance() - a2.getBalance();
	}
	
	

}
