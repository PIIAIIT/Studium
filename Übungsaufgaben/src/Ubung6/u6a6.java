/**
 * 
 * Die Klasse dient als Lösung
 * der Übung 6 Aufgabe 6 von EidP von Berrendorf
 * 
 * @author patrick
 * 
*/

package Ubung6;

public class u6a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Newton-Verfahren zu Berechnung einer Nullstelle.
		double x = 1;
		double epsilon = 10E-15; 
		
		int counter = 0;

		do {
			double ersteIt = f(x);
			double zweiteIt = fstrich(x);
			counter++;

			x = (x - (ersteIt/zweiteIt));
		}
		while (abs(f(x)) >= epsilon);
		
		System.out.println(counter);
	}

	public static double f(double x) { return (x*x) - 2;}
	
	public static double fstrich(double x) { return 2*x;}
	
	public static double abs(double f) {
		if (f < 0) return f * -1;
		return f;
	}
}
