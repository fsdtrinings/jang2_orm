package p1;

public class Laptop {

	private String brandName;
	private int cost;
	private int ramSize;
	private int hddSize;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brandName, int cost, int ramSize, int hddSize) {
		super();
		this.brandName = brandName;
		this.cost = cost;
		this.ramSize = ramSize;
		this.hddSize = hddSize;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	public int getHddSize() {
		return hddSize;
	}
	public void setHddSize(int hddSize) {
		this.hddSize = hddSize;
	}
	
	void doOfficeMeeting()
	{
		
	}
	
}
