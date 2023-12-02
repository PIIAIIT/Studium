package Ubung9;

public class TestA2 {

	public static void main(String[] args) {
		aufgabe1bis3();
//		aufgabe4();
	}
	
	public static void aufgabe4() {
		// erzeuge Loung mit Getraenkekarte
		Lounge lounge = new Lounge();
		
		// erzeuge Person
		Person paul = new Person("Paul", 16);
		
		// Karte zeigen von der Lounge
		System.out.println("Unsere Karte:\n" + lounge.karte);
		
		// Paul bestellen
		lounge.bestellen(paul, "Vodka");
		lounge.bestellen(paul, "Bier");
	}
	
	public static void aufgabe1bis3() {
		Getraenkekarte gk = new Getraenkekarte();
		
		gk.neuesGetraenk(new Getraenk("Cola",200,250,0));
		gk.neuesGetraenk(new Getraenk("Bier",200,200,16));
		gk.neuesGetraenk(new Getraenk("Vodka",20,300,18));
		
		System.out.println(gk);
		
		Getraenk g = gk.suchen("Cola");
		if (g != null) {
			System.out.println(g);
		}
		
	}

}
