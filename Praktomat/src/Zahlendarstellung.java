
public class Zahlendarstellung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ermittleZiffern(1234,16);
//		printList(ermittleZiffern(1234,16));
	}
	
	public static int[] ermittleZiffern(int x, int b) {
		// temp var um die zahl x zu speichern
		int zahl = x;
		// Fall x=0 ist möglich return [0]
		if (x == 0) {
			return new int[] {0};
		}
		
		int stellen = 0;
		// stellen berechnen
		while ( x != 0) {
			stellen++;
			x /= b;
		}
		// result list erstellen um die zahlen zu sammeln
		int[] result = new int[stellen];
		
		// zahlen in umgedrehter reihenfolge in die list reingeben
		for (int i = 0; i < stellen; i++){
			result[i] = zahl % b;
			zahl /= b;
		}
		
		// Gebe das Ergebnis aus
		return result;
	}

	public static void printList(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
}

