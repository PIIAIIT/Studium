package Ubung5;

public class u5a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double c = 3*10E8; //m/s Lichgeschwindigkeit

		double mnull = 90; // Gewicht in kg
//		double v = 0; //Geschwindigkeit m/s

		
		for (double v = c/4.; v <= c; v += v / 2) {
			
			double dMasseN = Math.sqrt( 1 - (v*v) / (c*c) );
			
			double dynamischeMasse = mnull/dMasseN;

//			if (v < c/10) i = 500000;
//			if (v < c-c/20) i = 200000;
//			if (v < c-c/100) i = 2000;
//			if (v < c-c/200) i = 1000;
//			else i = 1;
			System.out.println(v);
//			if (v>c) break;

			System.out.println("Die Dynamische Masse beträgt: "+dynamischeMasse);
			System.out.println("Die Geschwindigkeit beträgt: "+v);
			System.out.println();
		}
		
		
		
	}

}
