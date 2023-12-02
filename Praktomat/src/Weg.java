
public class Weg {
	Punkt[] pi = new Punkt[1];
	Punkt p;
	
	public Weg(int x, int y) {
		p = new Punkt(x,y);
		pi[0] = p;
	}
	
	public int getAnzahl() {
		return pi.length;
	}

	public void verlaengern(Weg w) {
		Punkt[] new_pl = new Punkt[getAnzahl()+1];
		for (int i = 0; i < pi.length; i++) {
			new_pl[i] = pi[i];
		}
		new_pl[getAnzahl()] = w.p;
		pi = new_pl;
	}
	
	public String toString() {
		String anw = "";
		for (int i = 0; i < getAnzahl(); i++) {
			if (i != 0) {
				anw += "-";
			}
			anw += pi[i].toString();
		}
		return anw;
	}
}

