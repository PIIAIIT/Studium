
public class Polynom {
	double[] koeff;
	int grad;
	static int erzeugung = 0;
	
	public Polynom(double[] koeffizienten) {
		if (koeffizienten.length == 0) {
			System.out.println("Fehler: Keine Koeffizienten angegeben.");
		} else {
			// erstelle koeff[] ohne hoechstwert. == 0
			int last = koeffizienten.length-1;
			koeff = koeffizienten;
			if (koeffizienten[last] == 0) {
				koeff = new double[last];
				for (int i = 0; i < koeff.length; i++) {
					koeff[i] = koeffizienten[i];
				}
			}
			grad = koeff.length;
		}
		
		erzeugung += 1;
	}
	
	public String toString() {
		String anw = "";
		for (int i = grad-1; i >=0; i--) {
			anw += koeff[i] + "*" + "x^"+ i;
			if ( i != 0) {
				anw += " + ";
			}
		}
		return anw;
	}

	public double auswerten(double x) {
		double sum = 0.0;
		for (int i = grad-1; i >=0; i--) {
			sum += koeff[i] * Math.pow(x, i);
		}
		return sum;
	}
	
	public static int getAnzahl() {
		return erzeugung;
	}
}

