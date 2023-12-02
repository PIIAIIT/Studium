public class BoolExpression {

	public static void main(String[] args) {
		/** Praktomat Nr. 2*/
		
		
		// variablen deklarieren
		boolean wert1, wert2;

		wert1 = false;
		wert2 = true;

		// Resultat ausgeben
		System.out.println(!wert1 && (wert1 || wert2));
		
		// Variable verändern
		wert1 = true;
		
		// Resultat ausgeben
		System.out.println(!wert1 && (wert1 || wert2));
	}

}
