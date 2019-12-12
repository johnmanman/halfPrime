package practice;

public class PrimeClass2 {
	boolean prime2111(int value) {

		int count = 0;
		boolean fact = true;
		for (int i = 2; i < value; ++i) {
			count++;
			if (value % i == 0) {
				fact = false;
				System.out.println(value + " is not a prime number.");
				System.out.println("count:" + count);
				return fact;
			}
		}
		System.out.println(value + " is a prime number.");
		System.out.println("count:" + count);
		return fact;
	}

	// test it here;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeClass2 pc = new PrimeClass2();
		pc.prime2111(1103);
	}
}


