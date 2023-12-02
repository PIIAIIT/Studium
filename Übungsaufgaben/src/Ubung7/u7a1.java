package Ubung7;

public class u7a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ggT(5,10));
	}
	
	public static int ggT(int x, int y) {
		if (x < 0 || y < 0) {
			return -1;
		} else {
			if (y == 0) {
				return x;
			}
			else {
				if ( x < y) {
					return ggT(y,x); /* Argumente werden vertauscht */
				}
				else {
					return ggT(x-y,y);
				}
			}
		}
	}
	
}
