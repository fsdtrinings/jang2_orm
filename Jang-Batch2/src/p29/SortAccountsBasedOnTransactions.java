package p29;

import java.util.Comparator;

public class SortAccountsBasedOnTransactions implements Comparator<Accounts>{

	@Override
	public int compare(Accounts o1, Accounts o2) {
		return o1.getTransactionCount() - o2.getTransactionCount();
	}

	
}
