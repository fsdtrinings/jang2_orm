package extra;

public class Laptop {
	
	private String color;
	private int cost;
	private int ramSize;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String color, int cost, int ramSize) {
		super();
		this.color = color;
		this.cost = cost;
		this.ramSize = ramSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Laptop Info "+color+" , "+ramSize+", "+cost;
	}
	
	

}
