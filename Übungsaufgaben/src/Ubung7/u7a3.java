package Ubung7;

public class u7a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] r = {1,2,2,4,3,2,2,12,2,3,1,2,4,5,1};
		int w = 2;
		
		PrintList pr = new PrintList();
		
		// (a)
		System.out.println(feldInWert(r,w));
		// (b)
		pr.printList(umgekehrt(r));
		// (c)
		pr.printList(umkehrung(r));
	
	}
	/**
	 * Aufgabe 3 a
	 * @param feld
	 * @param wert
	 * @return die anzahl des wertes in dem feld
	 */
	public static int feldInWert(int[] feld, int wert) {
		int counter = 0;
		for (int i=0; i < feld.length; i++) {
			if (feld[i] == wert) {
				counter++;
			}
		}
		return counter;
	}
	/**
	 * Aufgabe 3 b
	 * @param feld
	 * @return reverse: umgekehrtes feld mit inhaltsgleichen var
	 */
	public static int[] umgekehrt(int[] feld) {
		int[] reverse = new int[feld.length];
		for (int i = 0; i < feld.length; i++) {
			reverse[i] = feld[feld.length - 1 - i];
		}
		return reverse;
	}
	/**
	 * Aufgabe 3 c
	 * @param feld
	 * @return feld: feld mit referenzen umgekehrt
	 */
	public static int[] umkehrung(int[] feld) {
		for (int i = 0; i < feld.length/2; i++) {
			int temp = feld[i];
			feld[i] = feld[feld.length-i-1];
			feld[feld.length-i-1] = temp;
		}
		return feld;
		
	}
	
}
