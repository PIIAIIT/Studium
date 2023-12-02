package testklausur1;

import java.util.Scanner;

public class a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int anzahl = sc.nextInt();
		String artikel = sc.next();
		
		float netto = 0;
		float mwst = 0;
		float brutto = 0;
		
		sc.close();
		
		switch (artikel) {
			case "Gummibaerchen":
			{
				brutto = anzahl * 0.05f;
				mwst = brutto / 107 * 7;
				break;
			}
			case "Lakritzstangen":
			{
				brutto = anzahl * 0.3f;
				mwst = brutto / 107 * 7;
				break;
			}
			case "Playstation":
			{
				brutto = anzahl * 199;
				mwst = brutto / 107 * 19;
				break;
			}
			default:
				netto = -1;
				System.out.println("Fehler: Falscher Artikelname eingegeben!");
				break;
		}
		
		if (netto != -1)
		{
			netto = brutto / 107 * 100;
			System.out.println("Netto ohne MwSt: " + netto);
			System.out.println("MwSt " + mwst);
			System.out.println("Zu Bezahlen: " + brutto);
		
		}
		
		
	}

}
