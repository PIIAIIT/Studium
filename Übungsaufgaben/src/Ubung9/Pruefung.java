package Ubung9;

public class Pruefung {

	String name;
	String date;
	int credit;
	String ausgabe = "";
	
	public Pruefung(String p_name, String p_date, int p_credit) {
		name = p_name;
		date = p_date;
		credit = p_credit;
		ausgabe += name + " vom " + date + " mit " + credit + " Credites";
	}
	
	public void neuesErgebnis(Ergebnis e) {
		ausgabe += "\n"+e.toString();
	}
	
	public String toString() {
		return ausgabe;
	}
}
