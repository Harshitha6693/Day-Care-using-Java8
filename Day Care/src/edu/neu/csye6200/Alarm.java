
package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import edu.neu.csye6200.SimpleStudentFactory.SimpleStudentCriteria; 

public class Alarm implements Comparable<Student>{

	/**
	 * Method to determine whether the child requires immunization or not
	 * Here age is calculated in terms of Months
	 * @param child
	 */
	public static void checkImmunizationStatus(Student child){
		LocalDate currentDate = LocalDate.now();
		child.setAge(Period.between(child.getDateOfBirth(), currentDate).toTotalMonths());
		System.out.println("Total Months: "+ Period.between(child.getDateOfBirth(), currentDate).toTotalMonths());
		if(child.getAge()>4 && child.getAge()<6) {
			System.out.println(" PRESENT: Immunization is required for this child: " + child.getName());
		}
		
		else if(child.getAge()<4) {
			System.out.println(" FUTURE: This child should get Immunized by this date: "+ child.getDateOfBirth().plusMonths(4));
		}
		else {
			System.out.println(" PAST: This child does not require immunization. It is already done");
		}
	}
	
	/**
	 * Method to determine whether the child requires registration or not
	 * Here age is calculated in terms of Years
	 * @param child
	 */
	public static void checkRegistrationStatus(Student child) {
		LocalDate currentDate = LocalDate.now();
		child.setAge(Period.between(child.getDateOfBirth(), currentDate).getYears());
		System.out.println("AGE: "+ child.getAge());
		if(child.getAge()==1) {
			System.out.println(" PRESENT: Registration is required for this child: " + child.getName());
		}
		else if(child.getAge()>1){
			System.out.println(" PAST: This child has already been registered");
		}
		else {
			System.out.println(" FUTURE: This child should be registered by this date: "+ child.getDateOfBirth().plusYears(1));
		}
	}
	
	/**
	 * Method to obtain Birthday dates for the present year and to know if the child's birthday is today
	 * @param child
	 */
	public static void birthdayStatus(Student child) {
		MonthDay birthday = MonthDay.of(child.getDateOfBirth().getMonth(), child.getDateOfBirth().getDayOfMonth());
		MonthDay presentMonthDay = MonthDay.from(LocalDate.now());	
		int year = LocalDate.now().getYear ();
		if(presentMonthDay.equals(birthday)) {
			System.out.println(" BIRTHDAY: Today is "+ child.getName() +"'s Birthday!!.");
		}
		else {
			System.out.println(" BIRTHDAY: This child has birthday on: "+ MonthDay.from(birthday).atYear(year));
		}

	}
	
	/**
	 * Method to add details of children to the list and to execute the desired functions
	 */
	public static void performAction() {
		Student a1 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Jimmy" ,1,LocalDate.of(2017,01,01));
		Student a2 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Sally" ,2,LocalDate.of(2018,03,30));
		Student a3 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Lizzy" ,3,LocalDate.of(2016,10,10));
		Student a4 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Markie" ,4,LocalDate.of(2017,10,01));
		Student a5 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Johnny" ,5,LocalDate.of(2017,03,30));
		Student a6 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Bobby" ,6,LocalDate.of(2015,12,25));
		Student a7 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Billy" ,7,LocalDate.of(2017,9,10));
		Student a9 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Evie" ,8,LocalDate.of(2018,02,01));
		Student a8 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Becky" ,9,LocalDate.of(2018,03,01));
		Student a10 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Jessie" ,10,LocalDate.of(2017,9,01));
		Student a11 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Jackie" ,11,LocalDate.of(2017,03,29));
		Student a12 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Laurie" ,12,LocalDate.of(2016,3,30));
		Student a13 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Cathey" ,13,LocalDate.of(2016,9,06));
		Student a14 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Millie" ,14,LocalDate.of(2017,11,21));
		Student a15 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Ruthie" ,15,LocalDate.of(2016,12,31));
		Student a16 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Stanley" ,16,LocalDate.of(2015,03,30));
		Student a17 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Mary" ,17,LocalDate.of(2016,5,30));
		Student a18 = SimpleStudentFactory.getObject(SimpleStudentCriteria.STUDENT,"Annie" ,18,LocalDate.of(2017,6,6));
		
		List<Student> students = new ArrayList<>();
		students.add(a1);
		students.add(a2);
		students.add(a3);
		students.add(a4);
		students.add(a5);
		students.add(a6);
		students.add(a7);
		students.add(a8);
		students.add(a9);
		students.add(a10);
		students.add(a11);
		students.add(a12);
		students.add(a13);
		students.add(a14);
		students.add(a15);
		students.add(a16);
		students.add(a17);
		students.add(a18);
		
		
//		students.stream().sorted()
		
		
		
		
		
		for(Student x: students) {
			System.out.println(x);
			checkImmunizationStatus(x);
			checkRegistrationStatus(x);
			birthdayStatus(x);
			System.out.println("\n");
		}	
		
		
		
	}

	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
