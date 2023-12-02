
public class dreiWerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		x = 2;
		y = 1;
		z = 0;
		
		int min = 0;
		
		if (x <= y) {
			if (x <= z) {
				min = min + x;
				System.out.println(min + "x");
			}
			else {
				min = min + z;
				System.out.println(min + "z");
			}
		}
		else if (y <= z) {
			min = min + y;
			System.out.println(min + "y");
		}
		else {
			System.out.println("Alle gleich = "+x);
		}
	}

}
