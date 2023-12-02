/**
 * 
 * Hiermit wird die Laengste Kette einer String eingaben ausgeben.
 * 
 * @file LaengsteKette
 * @return int: Die Anzahl der Kette die am laengsten vorkommt
 * @author patrick 
 * 
*/


/* Importiere Scanner aus dem util package */
import java.util.*;

public class LaengsteKette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Deklarieren von temporärer var um die derzeitige Pos. in der Reihe zu speichern
		int aktuellerWert = -1;
		
		// Die Aktuelle Ketten länge der Iteration
		int kettenLaenge = -1;
		
		// Lange der aktuellen Kette
		int aktuelleKette = 0;
		
		while (sc.hasNextInt()) {
			int neuerWert = sc.nextInt();
			// 1 1 2 2 2 3 3 3 3 4 3 3 1 5 .
			
			if (aktuellerWert == neuerWert) {
				kettenLaenge++;
			} else {
				if (kettenLaenge > aktuelleKette) {
					aktuelleKette = kettenLaenge;
				}
				// neue Kette beginnen
				kettenLaenge = 1;
				aktuellerWert = neuerWert;
			}
			
			
		}
		// Scanner schließen
		sc.close();
		
		// Die Anzahl der Kette die am laengsten vorkommt ausgeben
		System.out.println(aktuelleKette);
	}
}

