package Ubung6;

public class u6a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(produkt(3,5));
	}
	
	public static int produkt(int x, int y) {
		int z = 0;
		while ( x > 0 ) {
			if ( x % 2 == 1) {
				z = z + y;
			}
			x >>= 1;
			y <<= 1;
		}
		return z;
	}

}
