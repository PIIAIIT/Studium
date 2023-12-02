package Ubung9;

public class TestA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student willi = new Student("Willi", "Wichtig", 900);
		Student helga = new Student("Helga", "Eifrig", 901);

		Ergebnis e1 = new Ergebnis(willi, 4.f, 60);
		Ergebnis e2 = new Ergebnis(helga, 1.f, 118);
		
		Pruefung eidp = new Pruefung("Einfuehrung in die Programmierung", "29.01.2024", 9);
		eidp.neuesErgebnis(e1);
		eidp.neuesErgebnis(e2);
		
		System.out.println(eidp);
	}

}
