package Ubung7;

public class u7a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1,2,3,4,2,3,4,2,3,4,2,3,4,2,3,4,2,3,4,3,4,4};
		double[] b = {1,2,3,4,2,3,4,2,3,4,2,3,4,2,3,4,2,3,4,3,4,4};
		double[][] c = {{1,2,3,4},{1,2,3,4},{3,4,2,5},{6,1,2,6},{2,3},{3,2,1,4}};
		double[][] d = {{1,2,3,4},{1,2,3,4},{3,4,2,5},{6,1,2,6},{2,3},{3,2,1,4}};
		double ep = 1E-3;
		System.out.println(istGleichFurEinDIMEN(a,b,ep));
		System.out.println(istGleichFurZweiDIMEN(c,d,ep));
	}
	
	public static boolean istGleichFurEinDIMEN(double[] a, double[] b, double epsilon) {
		for (int i = 0; i < a.length; i++) {
			double abso = Math.abs(a[i] - b[i]);
			if ( abso >= epsilon) {
				return false;
			}
		}
		return true;
	}

	public static boolean istGleichFurZweiDIMEN(double[][] a, double[][] b, double epsilon) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				double abso = Math.abs(a[i][j] - b[i][j]);
				if ( abso >= epsilon) {
					return false;
				}
			}
		}
		return true;
	}
}
