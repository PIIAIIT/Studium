package Ubung8;

public class u8a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] feld = {1,2,3,4,5,6,7,8,9,10};
		double[] a = {1,1,1,1,1,1,1,1,1};
		double s = kettenbruch(feld,a);
		System.out.print(s);
	}
	
	public static double kettenbruch(double[] bwert) {
		int n = bwert.length;
		double[] new_bwert = new double[n-1];
		
		if (n == 1) {
			return bwert[0] + ( 1 / bwert[n-1]);
		}
		for (int i = 0; i < n-1; i++) {
			new_bwert[i] = bwert[i+1];
		}
		return bwert[0] + ( 1 / kettenbruch(new_bwert));
	}
	
	public static double kettenbruch(double[] bwert, double[] a) {
		int n = bwert.length;
		if (n-1 != a.length) {
			System.out.println("Fehler: a muss genau einer kürzer sein als die kette");
		}
		double[] new_bwert = new double[n-1];
		double[] new_a = new double[a.length-1];

		if (n == 2) {
			return bwert[0] + ( a[0] / bwert[n-1]); 
		}
		
		for (int i = 0; i < n-1; i++) {
			new_bwert[i] = bwert[i+1];
		}
		for (int j = 0; j < a.length-1; j++) {
			new_a[j] = a[j+1];
		}

		return bwert[0] + ( a[0] / kettenbruch(new_bwert,new_a));
	}

}
