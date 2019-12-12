package practice;

public class PrimeClass2 {
	boolean isPrimeTest1(int value) {

		int count = 0;
		boolean fact = true;
		
    if (value < 2) {
			System.out.println("Try another Number greater or equal to Three");
			return false;
      }
      
    for (int i = 2; i < value / 2; ++i) {
			count++;
			if (value % i == 0) {
				fact = false;
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
		PrimeClass2 pc = new PrimeClass2();
		pc.prime2111(1103);
	}
}
