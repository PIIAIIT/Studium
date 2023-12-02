
public class Rational {
	
	int zaehler;
	int nenner;
	
	public Rational(int x) {
		new Rational(x,1);
	}
	
	public Rational(int zaeh, int nen) {
		if (nen == 0) {
			System.out.println("Fehler: Nenner ist 0");
		}
		if ( nen < 0) {
			if ( zaeh < 0) {
				zaeh *= -1;
				nen *= -1;
			} else {
				zaeh *= -1;
				nen *= -1;
			}
		}
		zaehler = zaeh / ggT(Math.abs(zaeh),Math.abs(nen));
		nenner = nen / ggT(Math.abs(zaeh),Math.abs(nen));
	}
	
	private int ggT(int zahl1, int zahl2) {
		int zw;
		while (zahl2 != 0) {
			zw = zahl1 % zahl2;
			
			zahl1 = zahl2;
			zahl2 = zw;
		}
		return zahl1;
	}
	
	
	public String toString() {
		return String.valueOf(zaehler) + "/" + String.valueOf(nenner);
	}
	
	public Rational add(Rational bruch) {
		// Auf den gemeinsamen Nenner kommen
		int faktor = 1;
		if (bruch.nenner > nenner){
			faktor = bruch.nenner / nenner;
		}
		int new_z = zaehler * faktor;
		int new_n = nenner * faktor;

		// Addition
		new_z = new_z + bruch.zaehler;
		
		return new Rational(new_z, new_n);
	}
	
	public Rational sub(Rational bruch) {
		// Auf den gemeinsamen Nenner kommen
		int faktor = 1;
		if (bruch.nenner > nenner){
			faktor = bruch.nenner * nenner;
		}
		int new_z = zaehler * faktor;
		int new_n = nenner * faktor;

		// Subtraction
		new_z = new_z - bruch.zaehler;
		
		return new Rational(new_z, new_n);
	}

	public Rational mul(Rational bruch) {
		// beide zaehler multiplizieren
		int new_z = zaehler * bruch.zaehler;
		int new_n = nenner * bruch.nenner;
		
		return new Rational(new_z, new_n);
	}

	public Rational div(Rational bruch) {
		// Kehrwert
		int tmp = bruch.nenner;
		bruch.nenner = bruch.zaehler;
		bruch.zaehler = tmp;
		
		return mul(bruch);
	}

}

