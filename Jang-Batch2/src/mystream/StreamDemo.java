package mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import p29.Accounts;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		StreamDemo obj = new StreamDemo();
		
		//obj.basicThings();
		//obj.callingBasicTerminalOperations();
		//obj.minOrMaxOnAcounts();
		obj.filterOnAccounts();
	}
	
	public void callingBasicTerminalOperations()
	{
		List<Integer> list = Arrays.asList(14,48,90,678,74,12);
		// ---- old approach to print element one by one
		System.out.println(" --- Iteration through for each loop ----------------------------------");
		for (int data : list) {
			System.out.println(data);
		}
		
		//============================================================================
		// approach which u never use 
		System.out.println(" --- Iteration through anoy inner class Consumer ----------------------------------");
		list.parallelStream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
		
		//============================================================================
		// approach through lambda expression 
		System.out.println(" --- Iteration through Lambda on Consumer funcatioanl interface----------------------------------");
		List<Integer> list2 = Arrays.asList(14,48,90,678,74,12);
		List<Integer> list300 = new LinkedList<>();
		
		list2.stream().forEach((x)->{
			x+=200;
			list300.add(x);
			System.out.println(x);
		});
		
		long length = list2.stream().count();
		System.out.println(length);
		
		
		// --------------  old approach -----
		int njn = list2.stream().max(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// write code to get max element 
				return o1.compareTo(o2);// return max element
			}
				
			}).get();
		
		// stream api approach 
		
		
		int value= list2.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("------->> max value :- "+value);
		
		
		
	}//end of method
	
	
	
	
	public void basicThings()
	{
		/*
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(110);
		list.add(140);
		list.add(510);
		*/
		
		List<Integer> list = Arrays.asList(14,48,90,678,74,12);
		
		Stream<Integer> s = list.stream();
		System.out.println(s);
		Stream s2 = Stream.of(10,48,74,60);
		System.out.println(s2);
		
	}


	public void minOrMaxOnAcounts()
	{
		Accounts a1 = new Accounts(1058, "Gopala Krishna", 2500, "Banglore",8000);
		Accounts a2 = new Accounts(2047, "Hemamalini", 12500, "Manglore",25);
		Accounts a3 = new Accounts(113, "Surekha", 7500, "Pune",18000);
		Accounts a4 = new Accounts(40, "Sahana", 8500, "Hydrabad",4500);
		
		
		List<Accounts> list = Arrays.asList(a1,a2,a3,a4);
		
		
		Comparator<Accounts> comp = (acc1,acc2)->acc1.getBalance() - acc2.getBalance();
		Accounts a = list.stream().max(comp).get();
		
		System.out.println(a);
	}//end of min max of accounts

	
	public void filterOnAccounts()
	{
		
		List<Integer> list = Arrays.asList(48,60,10,5,3,9,78,954,40,16,87,36,40);
		
		// ---- old approach -----
		list.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t<50) return true;
				else return false;
			}
				
		}).forEach((x)->System.out.println(x));
		
		
		
		// ---- approach through lamdba expression -----
		System.out.println(" -------------- Filteration through lambda ------------- ");
		list.stream().filter((x)-> x<50).forEach((x)->System.out.println(x));
		
		
		System.out.println("\n");
		
		Accounts a1 = new Accounts(1058, "Gopala Krishna", 2500, "Banglore",8000);
		Accounts a2 = new Accounts(2047, "Hemamalini", 12500, "Manglore",25);
		Accounts a3 = new Accounts(113, "Surekha", 7500, "Pune",18000);
		Accounts a4 = new Accounts(40, "Sahana", 8500, "Hydrabad",4500);
		
		
		List<Accounts> list2 = Arrays.asList(a1,a2,a3,a4);
		
		List<Accounts> outputList = 
		list2.stream().
		      filter((acc)->acc.getAccountHolderName().startsWith("S")).
		      // forEach((acc)->System.out.println(acc));
		      collect(Collectors.toList());
		
		
		System.out.println(" outputlist \n "+outputList);
		
	}

}//end class



















