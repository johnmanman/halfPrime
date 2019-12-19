package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	static {
//		new Random().nextInt(32); // because this will automatically generated and is static variable in the class
//									// Student.
	}

	public static void main(String[] args) {
		// TODO: Fix the code issues before anything
		// TODO: create a list of students (may be five items)
		// TODO: sort the list using last name of the student
		// TODO: sort the list using the zip code of the mailing address
		// TODO: find a student(s) by the last name which contain a given string
		// TODO: create a set of students (may be five items) where unique student
		// should be defined by their
		// 1)last name, 2)first name and 3)permanent address

		// TODO: remove all of the addresses (may be set it to null) of all students and
		// return them in a list

		// create the mailingAddress objects;

		Address mailingAddress = new Address(2030, "dc str", "silverspring", "Maryland", 20770);
		Address mailingAddress1 = new Address(2030, "dc str", "silverspring", "Maryland", 20770);
		Address mailingAddress2 = new Address(1023, "mc str", "greenbelt", "Maryland", 21345);
		Address mailingAddress3 = new Address(1056, "adm str", "ohio", "ohio", 20435);

		// create the permanent addresse objects;
		Address permanentAddress = new Address(2034, "ACD str", "Greenbelt", "Maryland", 20770);
		Address permanentAddress1 = new Address(203, "AC str", "Grblt", "Marynd", 20770);
		Address permanentAddress2 = new Address(2050, "DMV str", "Greenbelt", "Myand", 21233);
		Address permanentAddress3 = new Address(2020, "ZXT str", "Greenbelt", "Maryland", 24567);

		System.out.println();
		// create a list of 5 Students using their permannent and mailing addresses;
		Student std = new Student("Aregawi", "Gebremariam", mailingAddress, permanentAddress);

		Student std1 = new Student("Aregawi", "Gebremariam", mailingAddress, permanentAddress);
		Student std2 = new Student("Dave", "John", mailingAddress1, permanentAddress3);
		Student std3 = new Student("Alem", "Hagos", mailingAddress3, permanentAddress1);
		Student std4 = new Student("Berhanu", "Tareke", mailingAddress2, permanentAddress2);

		// add the Student objects into an ArrayList named list;
		List<Student> list = new ArrayList<Student>();
		list.add(std);
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);

//for(Student st: list)

		// When I first tried to print it(using System.out.println(list), it only gave
		// me few
		// hexadecimal numbers and alphabets;
//		I then generated the toString() for the Student and the address classes. It then worked well;

		System.out.println(" ========== The list of Students BEFORE sorting == works fine==");
		System.out.println(list);
		System.out.println("\n\n");
		System.out.println(" ========== The list of Students AFTER sorting == works fine==");
		// we need to sort it it out by implementing the CompareTo interface in
		// java.util;
		// first, we create a new class (in my case- LastNameCompare) that implements
		// the compareTo interface;
		// then, the compare methed is implemented and overridden and uses lastName as a
		// comparison criteria;
		// we then come back to the Application class and call the

		Collections.sort(list, new LastNameCompare());
		list.forEach(System.out::println);

		System.out.println("===Sort using ZipCod of Address === works fine ====");

//		override the equals () and hashCode using only the zip code 
		// autogenerate it by selecting the zipCode variable and deselect the others;;

		// Collections.sort(list);

// searching for a string in the Array list - list:
		System.out.println("\n");
		if (list.contains("John")) {
			System.out.println("yes");
		}
		if (!(list.contains("John"))) {
			System.out.println("No");
		}

		// to empty the ArrayList
		System.out.println("\n");
		list.clear();
		System.out.println(list);

		// TODO: find a student(s) by the last name which contain a given string
		// add the Student objects into an ArrayList named list;
		// add the Student objects into an ArrayList named list;
		List<Student> list1 = new ArrayList<Student>();
		list1.add(std);
		list1.add(std1);
		list1.add(std2);
		list1.add(std3);
		list1.add(std4);

		String search = "greenbelt";
		int list1Length = list1.size();
		for (int i = 0; i < list1Length; i++) {
			if (list1.get(i).contains(search)) {
			}
		}

		
		// TODO: create a set of students (may be five items) where unique student
		// should be defined by their
		// 1)last name, 2)first name and 3)permanent address
		
		// my Answer
		//we override the equals() and HashCode() in a way that compares using last name, first name and Permanent name;
		
	}

}
