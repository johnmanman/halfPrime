package practice;

import java.util.Scanner;

public class PrimeClass3 {
	
	boolean primeTesting(int value) {
		int count = 0;
		int root = (int) Math.sqrt(value);
		boolean fact = true;

		if (value < 3) {
			System.out.println("Try another Number greater or equal to Three");
			return false;
		}

		if (value % 2 == 0) {
			System.out.println(value + " is not a prime number.");
			count++;
			System.out.println("count:" + count);
			return false;

		} else if (value % 2 != 0) {

			for (int i = 3; i <= root; i += 2) {
				count++;

				if (value % i == 0) {
					System.out.println(value + " is not a prime number.");
					System.out.println("count:" + count);
					fact = false;
					return false;
				}
			}
		}
		System.out.println(value + " is a prime number.");
		System.out.println("count:" + count);
		return false;
	}
	
	

	//test it here;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first by creating new object and instance method;
		PrimeClass3 pc = new PrimeClass3();
		pc.prime22233(1103);

		//Second, using a user input;
		System.out.println("please enter your Integer here: ");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();

		PrimeClass3 pc1 = new PrimeClass3();

		pc1.prime22233(input);

	}
}
