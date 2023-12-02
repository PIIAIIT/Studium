
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int x = 0; x < 10000; x++) {
			if (isPrime(x)) {
				System.out.print("Number: "+ x+" - ");
				System.out.println(isPrime(x));
			}
		}
	}
	
	public static boolean isPrime(int number) {
		if (number == 2 || number == 3) {
			return true;
		}
		if ( number < 2 || number%2 == 0) {
			return false;
		}
		if ( number < 9) {
			return true;
		}
		if ( number % 3 == 0) {
			return false;
		}
		int r = (int) Math.pow(number, 0.5);
		
		int f = 5;
		
		while (f <= r) {
			if ( number % f == 0) {
				return false;
			}
			if ( number % (f+2) == 0) {
				return false;
			}
			f += 6;
		}
		return true;
	}
}
