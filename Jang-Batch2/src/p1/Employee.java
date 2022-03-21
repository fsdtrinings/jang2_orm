package p1;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String projectName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary, String projectName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.projectName = projectName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void doOfficeWork()
	{
		
	}
}
