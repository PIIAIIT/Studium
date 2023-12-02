package Ubung6;

public class u6a2 {
	public static void main(String[] args) {
		
		int x = 16777216;
		int y;
		
		do {
			x++;
			float f = x;
			y = (int) f;
			
			System.out.println("" + x + " == " + y + " => " + (x==y));
		} while (x == y);
	}
}
