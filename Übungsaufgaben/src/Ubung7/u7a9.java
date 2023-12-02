package Ubung7;

public class u7a9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] feld = new int[args.length];
		for (int o = 0; o < feld.length; o++) {
			feld[o] = Integer.valueOf(args[o]);
		}
		int indexOfMax = 0;
		for (int i = 0; i <= 5; i++) {
			int anzahl = feldInWert(feld,i);
			
			if (anzahl > indexOfMax) {
				indexOfMax = i;
			}
			
		}
		
		// Sternchen verteilung
		for (int j = 0; j <= 5; j++) {
			String stern = "";
			int anzahl = feldInWert(feld,j);
//			System.out.println(stern);
			// Sterne berechnung
//			System.out.println("IdM:"+indexOfMax);
			if (j == indexOfMax) {
				stern += "**********";
//				System.out.println("Max: "+stern);
			} else {
				for (int l = 0; l <= (10 / feld[indexOfMax] * anzahl); l++) {
					stern += "*";
				}
			}
			
			// Ausgabe
			if (anzahl == 0) {
				System.out.println(j+":  (0,0)");
			} else {
				System.out.println(j+": "+stern+" "+"("+anzahl+","+stern.length()+")");
			}
		
		
		}
		
		
	}
	
	
	public static int feldInWert(int[] feld, int wert) {
		int counter = 0;
		for (int i=0; i < feld.length; i++) {
			if (feld[i] == wert) {
				counter++;
			}
		}
		return counter;
	}
	

}
