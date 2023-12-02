
public class Vektorwinkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] v1 = {1, 1, 1, 1};
		double[] v2 = {1, 2, 3, 4};
		System.out.println(winkel(v1,v2));
	}
	
	public static double winkel(double[] a, double[] b) {
		double skalar = skalarprodukt(a,b);
		double normA = normVektor(a);
		double normB = normVektor(b);
		double radiant = Math.acos(skalar / (normA * normB));
		
		return radiant * 180 / Math.PI;
	}
	
	public static double skalarprodukt(double[] vektor1, double[] vektor2) {
		// a und b sind immer in der gleichen dimension
		double sum = 0;
		for (int i = 0; i < vektor1.length; i++) {
			sum += vektor1[i] * vektor2[i];
		}
		return sum;
	}

	public static double normVektor(double[] vektor) {
		double skalar = skalarprodukt(vektor,vektor);
		return Math.sqrt(skalar);
	}
}

