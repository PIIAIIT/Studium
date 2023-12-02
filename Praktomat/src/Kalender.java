
public class Kalender {

	public static void main(String[] arsg) {
		Jahr j23 = new Jahr(2023);
		Jahr j24 = new Jahr(2024);

		j23.eintragen(45, "Klausur", 1);
		j24.eintragen(37, "Treffen", 5);

		String abfrage2 = j23.getTermin(17) == null ? "17. Tag ist frei" : "17. Tag ist belegt";
		String abfrage = j23.getTermin(45) == null ? "45. Tag ist frei" : "45. Tag ist belegt";
		
		System.out.println(abfrage2);
		System.out.println(abfrage);

		System.out.println(j23.getBelegt() + j24.getBelegt());
		

		
		
		
	}
}

