package Ubung9;

public class Lounge {

	Getraenkekarte karte = new Getraenkekarte();

	public Lounge() {
		karte.neuesGetraenk(new Getraenk("Cola",200,250,0));
		karte.neuesGetraenk(new Getraenk("Bier",200,200,16));
		karte.neuesGetraenk(new Getraenk("Vodka",20,300,18));
	}

	public void bestellen(Person p, String g) {
		Getraenk getraenk = karte.suchen(g);
		if (p.alter < getraenk.freigabe) {
			System.out.println("nicht alt genug fuer das Getraenk");
		}
		if (p.alter >= getraenk.freigabe) {
			System.out.println("bitte schoen, ihr Getraenk");
		}
	}

}

