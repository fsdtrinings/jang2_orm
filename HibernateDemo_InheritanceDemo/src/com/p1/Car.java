package com.p1;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@DiscriminatorColumn(name="Car_Type",discriminatorType=DiscriminatorType.STRING)



@Entity
@Table(name="Car")
@Inheritance(strategy=InheritanceType.JOINED)// SingleTable , TablePerClass
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	int id;
	
	String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
