package practice;

import java.util.Scanner;
//looking great
public class PrimeClass {

	boolean primeTesting(int value) {
		int count = 0;
		int root = (int) Math.sqrt(value);
		boolean fact = true;

		if (value <= 0) {
			System.out.println("please give a positive number");
			return false;
		}

		if (value % 2 == 0) {
			System.out.println(value + " is not a prime number: it is already divisible by 2.");
			return false;
		}
		for (int i = 3; i <= root; i += 2) {
			count++;

			if (value % i == 0) {
				System.out.println(value + " is not a prime number.");
				System.out.println("count:" + count);
				return false;
			}
		}
		System.out.println(value + " is a prime number.");
		System.out.println("count:" + count);
		return false;
	}

	// test it here;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first by creating new object and instance method;
		PrimeClass pc = new PrimeClass();
		pc.primeTesting(1103);

		// Second, using a user input;
		System.out.println("please enter your Integer here: ");
		Scanner scn = new Scanner(System.in);

		PrimeClass pc1 = new PrimeClass();

		pc1.primeTesting(scn.nextInt());
	}
}
