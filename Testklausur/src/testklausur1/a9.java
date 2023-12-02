package testklausur1;


public class a9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int wert = 1;
		
		
		// Iteration from 0 to n+1		
		for (int x = 0; x <= n;x++) {
			
			System.out.println(x+" "+wert);
			wert = wert << 1;
			
		}
	}

}
