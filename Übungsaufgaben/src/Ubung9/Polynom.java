package Ubung9;

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
	// Aufgabe 6
	public Polynom addieren(Polynom p) {
		int mx = Math.max(koeff.length, p.koeff.length);
		double[] new_koeff = new double[mx];
		
		for (int i = mx-1; i >= 0; i--) {
			double ko1 = (i < koeff.length ? koeff[i] : 0);
			double ko2 = (i < p.koeff.length ? p.koeff[i] : 0);
			new_koeff[i] = ko1 + ko2;
		}
		return new Polynom(new_koeff);
	}
	// Aufgabe 6
	public Polynom ableiten() {
		double[] new_koeff = new double[koeff.length-1];
		
		for (int i = new_koeff.length; i >= 0; i--) {
			if (i == 0) {
				break;
			}
			new_koeff[i-1] = koeff[i] * i;
		}
		return new Polynom(new_koeff);
	}
	
	// Aufgabe 7
	public Polynom multiplizieren(Polynom p) {
		int grad1 = koeff.length - 1;
        int grad2 = p.koeff.length - 1;
        int gesamtGrad = grad1 + grad2;

        double[] ergebnisKoeffizienten = new double[gesamtGrad + 1];

        for (int i = 0; i <= grad1; i++) {
            for (int j = 0; j <= grad2; j++) {
                ergebnisKoeffizienten[i + j] += this.koeff[i] * p.koeff[j];
            }
        }

        return new Polynom(ergebnisKoeffizienten);
        }
	
	// Aufgabe 7
		public Polynom integrieren() {
			int grad1 = grad - 1;
			double[] new_koeff = new double[grad1+2];
			
			for (int i = grad1; i >= 0; i--) {
				new_koeff[i+1] = koeff[i] / ( i +1 );
			}
			return new Polynom(new_koeff);
		}
}
