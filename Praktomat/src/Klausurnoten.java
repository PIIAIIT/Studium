
public class Klausurnoten {
	
	public static void main(String[] args) {
		int[] punkte = {30, 74, 81, 67, 95, 65};
		int[] punktGrenzen = {59, 69, 79, 89};		/* 5: 0-59, 4: 60-69, 3: 70-79, 2: 80-89, 1: 90-*/
		
		verarbeiteKlausurPunktzahl(punkte, punktGrenzen);
	}
	
	public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen) {
		// Anzahl der Teilnehmer
		System.out.println(punkte.length);
		
		int[] noten = inNoten(punkte, punktGrenzen);
		
		// beste Noten und schlechteste
		bestAndWorst(noten);
		
		// bestanden und durchgefallen
		bestanden(noten);
		
		// Durchschnittliche Punktzahl
		System.out.println(averageNote(punkte));
		
		// Histogramm von den Noten und der jeweiligen Anzahl
		histogrammNote(noten,punktGrenzen);
	
		
	}
	
	public static double averageNote(int[] punkte) {
		double sum = 0;
		for (int j = 0; j < punkte.length; j++) {
			sum += punkte[j];
		}
		return sum / punkte.length;
	}
	
	public static int[] inNoten(int[] punkte, int[] grenzen) {
		int[] note = new int[punkte.length];
		for (int i = 0; i < punkte.length; i++) {
			note[i] = 5;
			if (punkte[i] > grenzen[0]) {
				note[i] = 4;
			}
			if (punkte[i] > grenzen[1]) {
				note[i] = 3;
			}
			if (punkte[i] > grenzen[2]) {
				note[i] = 2;
			}
			if (punkte[i]>grenzen[3]) {
				note[i] = 1;
			}
			
		}
		return note;
	}
	
	public static void bestAndWorst(int[] noten) {
		int beste = 6;
		int schlechte = 0;
		for (int i = 0; i < noten.length; i++) {
			if (noten[i] > schlechte) {
				schlechte = noten[i];
			}
			if (noten[i] < beste) {
				beste = noten[i];
			}
		}
		System.out.println(beste + " " + schlechte);
	}
	
	public static void bestanden(int[] noten) {
		int bestanden = 0;
		int nichtBestanden = 0;
		for (int i = 0; i < noten.length; i++) {
			if (noten[i] <= 4) {
				bestanden++;
			} else {
				nichtBestanden++;
			}
		}
		System.out.println(bestanden + " " + nichtBestanden);
	}
	
	public static void histogrammNote(int[] noten, int[] grenzen) {
		for (int i = 1; i <= grenzen.length+1; i++) {
			System.out.print(i+" ");
			
			int count = 0;
			for (int j = 0; j < noten.length; j++) {
				if (noten[j] == i) {
					count ++;
				}
			}
			
			System.out.println(count);
		}
	}
}

