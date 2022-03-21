package p1;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		CollectionDemo app = new CollectionDemo();
		
		app.arrayListDemo();
	}
	
	public void arrayListDemo()
	{
		List list1 = new ArrayList<>(); //  general list , it can take any object
		
		list1.add(45); // its Integer not int
		list1.add(true); // Boolean ,  not boolean
		list1.add(45.5f); // this is Float wrapper object not float primitive data type
		list1.add("Hello Java");
		list1.add(new Employee(1,"Ramesh", 2000, "ICICI- Bank Project"));
		list1.add(new Exception());
		list1.add(new Laptop("HP", 2500, 8, 130));
		list1.add(new Laptop("Dell", 3500, 16, 130));
		
		/// ---- approach 1 for  iteration ----
		
		for (Object object : list1) {
			
			object.toString();
			
			//object.doOfficeWork(); // business method
			
			//object.doOfficeMeeting(); // business method
		}
		
		// iteration -----
		
		
		
		
		//list2.add(34);
		
		
		
		
	}
	
	
	

}
