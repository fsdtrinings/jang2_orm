package p29;

import java.util.Comparator;

public class SortAccountsBasedOnLoction implements Comparator<Accounts>{

	@Override
	public int compare(Accounts o1, Accounts o2) {
		return o1.getLocation().compareTo(o2.getLocation());
	}

	
}
