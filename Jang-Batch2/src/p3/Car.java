package p3;

public class Car {

	String brandName = "Honda";
	String color = "White";
	int cost = 2000;
	
	@Override
	public String toString()
	{
		return brandName+"- "+color+" - "+cost;
	}
}
