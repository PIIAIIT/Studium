package Ubung6;

public class u6a13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = -3;
		System.out.println(signum(x));
		short y = 0;
		System.out.println(signum(y));
		int z = 4;
		System.out.println(signum(z));
		long a = -9;
		System.out.println(signum(a));
		float b = 0;
		System.out.println(signum(b));
		double c = 3.0;
		System.out.println(signum(c));
	}
	public static byte signum(byte x) {
		if ( x == 0 ) return 0;
		if ( x < 0 ) return -1;
		return 1;
	}
	
	public static short signum(short x) {
		if ( x == 0 ) return 0;
		if ( x < 0 ) return -1;
		return 1;
	}
	
	public static int signum(int x) {
		if ( x == 0 ) return 0;
		if ( x < 0 ) return -1;
		return 1;
	}
	
	public static long signum(long x) {
		if ( x == 0 ) return 0;
		if ( x < 0 ) return -1;
		return 1;
	}
	
	public static float signum(float x) {
		if ( x == 0 ) return 0;
		if ( x < 0 ) return -1;
		return 1;
	}

	public static double signum(double x) {
		if ( x == 0 ) return 0;
		if ( x < 0 ) return -1;
		return 1;
	}
}
