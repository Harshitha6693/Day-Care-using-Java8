package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.Month;

public class Student extends Person{
	private LocalDate dateOfBirth;
	private long age;

	public Student() {
		super();
		this.dateOfBirth = LocalDate.of(2013, Month.APRIL,30);
		this.age = 5;
	}

	public Student(String name, int iD, LocalDate dateOfBirth) {
		super(name, iD);
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("The Name of child is: ").append(this.getName());
		info.append(" with ID: ").append(this.getID());
		info.append(" is born on: ").append(this.dateOfBirth);
		return info.toString();	}

}
