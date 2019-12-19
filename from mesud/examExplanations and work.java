package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	
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
}
