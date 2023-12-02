/**
 * 
 * @file Lauflaengenkodierung
 * @author patrick
 * @return String: Die Anzahl der Zahl mit dem char x verbunden mit der Zahl
 * 
*/
import java.util.*;

public class Lauflaengenkodierung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Deklarieren von temporärer var um die derzeitige Pos. in der Reihe zu speichern
		int temp = -1;
		
		// Die Aktuelle Ketten länge der Iteration
		int ketten_laenge = 0;
		
		// Die Laengste länge aller Ketten
//		int maxlaenge = 0;
		
		String output = "";
		
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			// 1 1 2 2 2 3 3 3 3 4 3 3 1 5 .
			
			if (temp == i) {
				ketten_laenge++;
			} else {
				if (ketten_laenge!=0) {
					output += ""+ketten_laenge+"x"+temp+".";
				}
				
				ketten_laenge = 1;
				temp = i;
				
			}

		}
		sc.close();
		
		output += ""+ketten_laenge+"x"+temp+".";
		
		if (temp != -1) {
			System.out.println(output);
		}
		
	}
}

