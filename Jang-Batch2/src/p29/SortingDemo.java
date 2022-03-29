package p29;

import java.util.TreeSet;

public class SortingDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set1 = new TreeSet<>();
		
		set1.add(15);
		set1.add(105);
		set1.add(5);
		set1.add(25);
		set1.add(99);
		
		System.out.println(set1);
		
		TreeSet<String> set2 = new TreeSet<>();
		
		set2.add("fgerg");
		set2.add("afgerg");
		set2.add("aafgerg");
		set2.add("abfgerg");
		set2.add("abcfgerg");
		set2.add("tabcfgerg");
		set2.add("tbabcfgerg");
		set2.add("zabcfgerg");
		System.out.println(set2);
		
		
		
	}

}
