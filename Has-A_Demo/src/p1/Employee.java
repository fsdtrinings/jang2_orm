package p1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NovalVistaEmployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "novalId")
	private int id;
	
	@Column(name = "NovalEmpName",nullable = false)
	private String name;
	private int salary;
	@Column(unique = false)
	private String department;
	private String designation;
	
	@Embedded
	private ProfileDetails profile;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "ProjectDetails")
	private Project projectinfo;
	
	
	
	public Project getProjectinfo() {
		return projectinfo;
	}

	public void setProjectinfo(Project projectinfo) {
		this.projectinfo = projectinfo;
	}

	public Employee() {
		super(); // important 
		// TODO Auto-generated constructor stub
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public ProfileDetails getProfile() {
		return profile;
	}

	public void setProfile(ProfileDetails profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", profile=" + profile + "]";
	}


	

}
