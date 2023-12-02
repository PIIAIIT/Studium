package Ubung9;

class Rueckgabeautomat{
	
	int[] automat = new int[8];
	int[] muenzen = new int[] {200,100,50,20,10,5,2,1};

	int einzahlung; // in Cent
	int zuzahlen; // in Cent
	int rueckgeld; // in Cent
	
	public Rueckgabeautomat(int[] munz) {
		automat = munz;
	}
	
	public void einzahlen(double betrag) {
		einzahlung = (int) Math.round(betrag*100);
	}
	
	public int[] zahlbetrag(double betrag) {
		int[] ruckgeld = new int[8];
		zuzahlen = (int) Math.round(betrag*100);
		rueckgeld = einzahlung - zuzahlen;

		while (rueckgeld != 0) {
			int count = 0;
			for (int i = 0; i < ruckgeld.length; i++) {
				while (rueckgeld >= muenzen[i]) {
					rueckgeld -= muenzen[i];
					count++;
				}
				ruckgeld[i] = count;
				count = 0;
			}
		}
		for (int i = 0; i < ruckgeld.length; i++) {
			if (ruckgeld[i] > automat[i]) {
				System.out.println("Fehler: Nicht genug Geld im Automaten.");
			}
			automat[i] -= ruckgeld[i];
		}
		
		return ruckgeld;
	}
	
	public String toString() {
		String autom = intString(muenzen)+": "+intString(automat);
		return autom;
	}
	
	public String intString(int[] a) {
		String[] s = new String[a.length];
		int i = 0;
		for (int b: a) {
			s[i++] = Integer.toString(b);
		}
		String z = "["+String.join(",", s) +"]";
		return z;
	}
	
	
	
	
}

