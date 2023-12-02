
public class Jahr {
	
	int jahreszahl;
	Tag[] tagListe;
	int belegt = 0;

	public Jahr(int jahr) {
		jahreszahl = jahr;
		tagListe = new Tag[365];
		for (int i = 0; i < tagListe.length; i++) {
			tagListe[i] = new Tag();
		}
	}
	
	public void eintragen(int tag, String was, int prioritaet) {
		if (tagListe[tag-1].getVerarbredung() == null) {
			tagListe[tag-1].eintragen(was, prioritaet);
			belegt++;
		} else {
			System.out.println("Fehler: "+was);
		}
	}
	
	public String getTermin(int tag) {
		return tagListe[tag-1].getVerarbredung();
	}
	
	public int getPrioritaet(int tag) {
		return tagListe[tag-1].getPrioritaet();
	}
	
	public int getBelegt() {
		return belegt;
	}
}

