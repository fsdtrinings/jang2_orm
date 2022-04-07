package p1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "techSubjects")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;
	private String subjectName;
	private int duration;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "subjects")
	private List<Instructor> instructors;
	
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return ""+subjectName+" ";
	}
	
	
	
}
