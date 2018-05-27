package edu.neu.csye6200;

public class Person extends AbstractPersonAPI{
	private String name;
	private int ID;
	
	public Person() {
		super();
		this.name = "John Doe";
		this.ID = 100;
	}

	public Person(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public void show() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("The Name of child is: ").append(this.getName());
		info.append(" with ID: ").append(this.getID());
		return info.toString();
	}
	

}
