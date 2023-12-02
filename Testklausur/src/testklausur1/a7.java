package testklausur1;


public class a7 {

	public static void main(String[] args) {
		// Umrechnung von Grad F in Grad C
		
		// Eingabe über Kommandozeile 
		// eine Relle Zahl
		double fahrenheit = Double.parseDouble(args[0]);

		
		// Umrechnung in Celsius
		double celsius = (5. / 9.) * (fahrenheit - 32.);
		
		System.out.println(celsius);
		
		
	}

}
