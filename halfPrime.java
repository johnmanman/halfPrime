package practice;

// check with 4 if it is prime or not, program should return it not prime
//please remove the local variable as you actually don't need it (the lesson is write very few lines of code as less as possible but the code should be readable and understandable)

public class PrimeClass2 {
	boolean prime2111(int value) {

		int count = 0;
		boolean fact = true;
		
    if (value < 2) {
			System.out.println("Try another Number greater or equal to Three");
			return !fact;
      }
      
    for (int i = 2; i < value / 2; ++i) {
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
