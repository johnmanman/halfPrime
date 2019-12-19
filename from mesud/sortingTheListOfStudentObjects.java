package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
  
// TODO: sort the list using last name of the student
// When I first tried to print it(using System.out.println(list), it only gave
		// me few
		// hexadecimal numbers and alphabets;
//		I then generated the toString() for the Student and the address classes. It then worked well;



//Explanation:  we need to sort it out by implementing the CompareTo interface in java.util;
		// first, we create a new class (in my case- LastNameCompare (see - it is Created Down below this class)) that implements
		// the compareTo interface;
		// then, the compare methed is implemented and overridden and uses lastName as a
		// comparison criteria;
		// we then come back to the Application class and call the Collections.sort by creating a new LastNameCompare object (criteria according to the overridden criteria);
    //import Collections interface to use the Collections.sort();

List<Student> list = new ArrayList<Student>();
		list.add(std);
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);


Collections.sort(list, new LastNameCompare());
//it works;

}
}






//creating a LastNameCompare class;

package org.learn.java;

import java.util.Comparator;

public class LastNameCompare implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getLastName().compareTo(arg1.getLastName());
	}
}
