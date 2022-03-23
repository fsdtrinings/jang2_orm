package extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import bo.Client;

public class MapDemo {
	
	public static void main(String[] args) {
		
		//mapExample1();
		//mapExample2();
		
		mapExample3();
		
	}
	public static void mapExample3()
	{
		Map<String, List<String>> deviceMap = new HashMap<>();
		
		List<String> phoneList = new ArrayList<String>();
		phoneList.add("Samsung ABC1");
		phoneList.add("Samsung ABC2");
		phoneList.add("One Plus 7 Pro");
		phoneList.add("One Plus 5 Pro");
		phoneList.add("RedMe ABC1 ");
		phoneList.add("Apple 10 ");
		
		List<String> laptopList = new ArrayList<String>();
		
		laptopList.add("HP -123");
		laptopList.add("HP -5623");
		laptopList.add("Dell -123");
		laptopList.add("Acer -123");
		laptopList.add("Apple -123");
		laptopList.add("Lenovo -123");
		
		List<String> watchList = new ArrayList<String>();
		
		watchList.add("Noice - 1");
		watchList.add("Noice - 2");
		watchList.add("Noice - 3");
		watchList.add("Apple - 1");
		watchList.add("Apple2");
		watchList.add("Fasttrack - 123");
		
		deviceMap.put("phone", phoneList);
		deviceMap.put("laptop", laptopList);
		deviceMap.put("watch", watchList);
		
		for (Map.Entry<String,List<String>> entry : deviceMap.entrySet()) 
		{
			System.out.println("\t"+entry.getKey());
			
			List<String> devices = entry.getValue();
			for (String deviceName : devices) {
				System.out.println(deviceName);
			}
			
			System.out.println("\n\n==============================================================================");
		
		}//end of for
	}
	
	public static void mapExample1()
	{
		//   number , animal name 
		Map<Integer, String> animalMap = new HashMap<>();
		
		animalMap.put(1, "Dog");
		animalMap.put(2, "Cat");
		animalMap.put(3, "Tiger");
		animalMap.put(3, "Lion");
		animalMap.put(10, "Cow");
		
		for (Map.Entry<Integer, String> entry : animalMap.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
			System.out.println("------------------------------------------");
	}
		
		
	}
	
	public static void mapExample2()
	{
	//   brandName   Laptop
			Map<String, Laptop> map = new HashMap<>();
			
			Laptop dellLaptop = new Laptop("Gray",80000, 16);
			Laptop appleLaptop = new Laptop("Gray",180000, 2);
			Laptop hpLaptop = new Laptop("Silver",70000, 8);
			
			map.put("Dell", dellLaptop);
			map.put("Apple", appleLaptop);
			map.put("HP", hpLaptop);
			
			System.out.println(map);
			
			System.out.println(map.get("HP"));
			
			System.out.println("\n\n\n");
			
			for (Map.Entry<String, Laptop> entry : map.entrySet()) {
					System.out.println(entry.getKey()+" - "+entry.getValue());
					System.out.println("------------------------------------------");
			}
	}

}
