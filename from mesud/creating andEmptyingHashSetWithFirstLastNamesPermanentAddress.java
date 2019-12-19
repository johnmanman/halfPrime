
//create a set of Student Objects;

		Student std11 = new Student("Aregawi", "Gebremariam", mailingAddress, permanentAddress);
		Student std21 = new Student("Dave", "John", mailingAddress1, permanentAddress3);
		Student std31 = new Student("Alem", "Hagos", mailingAddress3, permanentAddress1);
		Student std41 = new Student("Berhanu", "Tareke", mailingAddress2, permanentAddress2);

		// add the Student objects into an ArrayList named list;
		 HashSet<Student> set=new HashSet<Student>(); 
		list.add(std);
		list.add(std11);
		list.add(std21);
		list.add(std31);
		list.add(std41);

//To Print it:
System.out.println(list);


//to make it empty:
list.clear();







//we override the equals() and hashCodes() in the Student Class as follows (explanation isexplained in the other questions);

package org.learn.java;

import java.util.Random;

public class Student {

	public static int id;

	private String firstName;
	private String lastName;
	private Address mailingAddress;
	private Address permanentAddress;

	public Student(String firstName, String lastName, Address mailingAddress, Address permanentAddress) {
		super();
		id = new Random().nextInt(32);
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailingAddress = mailingAddress;
		this.permanentAddress = permanentAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mailingAddress="
				+ mailingAddress + ", permanentAddress=" + permanentAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		return true;
	}

}
