package Ubung9;

public class Getraenk {

	String name;
	
	int abgabemenge; // pro Glas in ml
	int preis; // in cent
	int freigabe; // alter
	
	public Getraenk(String n, int a, int p, int f) {
		name = n;
		abgabemenge = a;
		preis = p;
		freigabe = f;
	}
	
	public String toString() {
		return "Name: " +name+", "+
				"Menge: "+abgabemenge+", "+
				"Preis: "+preis+", "+
				"Altersfreigabe: "+freigabe;
	}
}
