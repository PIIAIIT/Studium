package Ubung8;

public class u8a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] eingabe = {1,2,3,3,4,5};
		double a = arithmetischerMittelwert(eingabe);
		double b = harmonischerMittelwert(eingabe);
		double c = standardabweichung(eingabe);
		System.out.println("arithmetischer Mittelwert: "+a);
		System.out.println("harmonischer Mittelwert: "+b);
		System.out.println("Standardabweichung: "+c);
	}
	
	public static double arithmetischerMittelwert(int[] v) {
		int n = v.length;
		double sum = 0.;
		for (int i = 0; i < n; i++) {
			sum += v[i];
		}
		return sum / n;
	}
	
	public static double harmonischerMittelwert(int[] v) {
		int n = v.length;
		double sum = 0.;
		for (int i = 0; i < n; i++) {
			double numDouble  = v[i];
			sum += (1. / numDouble);
		}
		return n / sum;
	}
	
	public static double standardabweichung(int[] v) {
		int n = v.length;
		double sum = 0.;
		for (int i = 0; i < n; i++) {
			sum += Math.pow(v[i] - arithmetischerMittelwert(v), 2);
		}
		return Math.sqrt(sum / ( n - 1));
	}

}
