package Ubung6;

public class u6a14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 120;
		int y = 30;
		System.out.println(ggT(x,y));
		System.out.println(ggT1(x,y));
		System.out.println(ggT2(x,y));
		System.out.println(ggT3(x,y));
	}

	public static int ggT(int x, int y) {
		// Schleife
		while (y != 0) {
			if(x == 0) {
				// gebe das Ergebnis / den ggT aus
				System.out.println (y);
			}
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}
		return x;
	}
	
	public static int ggT1(int x, int y) {
		// recursive 
		x = x - y;
		if (x == 0) {
			return y;
		}
		y = y - x;
		return ggT(x,y);
	}
	
	public static int ggT2(int x, int y) {
		// Schleife mit Modulo
		while (y != 0) {
			if(x == 0) {
				// gebe das Ergebnis / den ggT aus
				System.out.println (y);
			}
			if (x > y) {
				x = x % y;
			} else {
				y = y % x;
			}
		}
		return x;
	}
	
	public static int ggT3(int x, int y) {
		// recursive mit Modulo
		int rest = x % y;
		if (rest == 0) {
			return y;
		}
		x = y;
		y = rest;
		return ggT(x,y);
	}
	
	

}
