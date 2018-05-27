package edu.neu.csye6200;

import java.time.LocalDate;

public class SimpleStudentFactory {
	
	enum SimpleStudentCriteria {
		STUDENT
	}
	
	private SimpleStudentFactory() {

	}
	
	public static Student getObject(SimpleStudentCriteria criteria) {
		Student obj = null;
		if (criteria == SimpleStudentCriteria.STUDENT) {
			obj = new Student();
		} else {
			obj = null;
		}
		
		return obj;
	}
	
	public static Student getObject(SimpleStudentCriteria criteria,String name, int id, LocalDate dateOfBirth) {
		Student obj = null;
		if (criteria == SimpleStudentCriteria.STUDENT) {
			obj = new Student(name,id,dateOfBirth);
		} else {
			obj = null;
		}
		return obj;
	}
	
}
