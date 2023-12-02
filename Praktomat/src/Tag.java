
public class Tag {

	String termin = null;
	int wichtigkeit = 0;
	
	
	public void eintragen(String was, int prioritaet) {
		termin = was;
		wichtigkeit = prioritaet;
	}
	
	public String getVerarbredung() {
		return termin;
	}
	
	public int getPrioritaet() {
		return wichtigkeit;
	}
}

