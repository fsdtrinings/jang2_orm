package day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// hashset is by default unordered 
		Set<Integer> hashset = new HashSet<>();
		hashset.add(154);
		hashset.add(54);
		hashset.add(10);
		hashset.add(88);
		hashset.add(88);
		hashset.add(84);
		hashset.add(19);
		System.out.println(hashset);
		
		// linkedhashset is by default ordered 
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(154);
		linkedHashSet.add(54);
		linkedHashSet.add(10);
		linkedHashSet.add(88);
		
		linkedHashSet.add(84);
		linkedHashSet.add(19);
		System.out.println(linkedHashSet);
		
		// hashset is by default sorted 
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(154);
		treeSet.add(54);
		treeSet.add(10);
		treeSet.add(88);
		
		treeSet.add(84);
		treeSet.add(19);
		System.out.println(treeSet);
		
		
		
		
	}

}
