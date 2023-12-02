package Ubung5;
import java.util.Scanner;

public class u5a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/* 
		 * x; Die erste Eingabe
		 * y: Die zweite Eingabe
		 * epsilon: 
		*/
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double epsilon = sc.nextDouble();
		
		boolean b1 = x<y;
		boolean b2 = epsilon>0;
		boolean b3 = Math.abs(y-x) > epsilon;

		
		double r;
		double zahl1, zahl2;
		
		
		/* Wenn eine Bedingung Falsch ist kommt eine dieser Fehlermeldungen. */
		if (!b1) System.out.println("Die erste Eingabe x muss kleiner als die zweite Eingabe y.");
		if (!b2) System.out.println("Die dritte Eingabe epsilon muss größer als 0 sein.");
		if (!b3) System.out.println("Die Differenz von 'y - x' muss größer als Epsilon sein.");
		
		sc.close();
		
		/* Wenn eine Bedingung Falsch ist passiert nicht. */
		if (b1 && b2 && b3) {
			/* 
			 * solange a und b deklarieren bis a und b deklarieren bis die 
			 * Differenz von a und b größer gleich epsilon ist. 
			*/
			do {
				r = Math.random();
				zahl1 = x + r *(y - x);
				r = Math.random();
				zahl2 = x + r *(y - x);
				
			} while(Math.abs(zahl2 - zahl1) < epsilon);
				
			/* a und b werden ausgegeben */
			System.out.println(zahl1);
			System.out.println(zahl2);
			
		}
	
	}

}
