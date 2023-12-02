/**
 * @author patrick
 * @date 12.11.2023
 * @version 1.3
 * 
 */
import java.util.Scanner;

public class IbanBerechnen {

	public static void main(String[] args) {
		// Scanner öffnen
		Scanner sc = new Scanner(System.in);
		String lk = sc.next();
		String blz = sc.next();
		String nr = sc.next();
		
		// Scanner schließen
		sc.close();
		
		String iban = erzeugeIban(lk,blz,nr);
		
		System.out.println(iban);
	}

	public static String normalisieren(String nummer) {
		/**
		 * @param nummer: eine Kontonummer unter < 10
		 * @return genormteNummer: gibt eine 10-stellige mit null befüllten nummer aus
		 * 
		 * 1.
		 */
		// ausrechnen von differenz zu 10
		int zaehler = (10 - nummer.length());
		
		if (zaehler == 0) {
			return nummer;
		}
		
		String null_ = "";
		for (int i=1; i <= zaehler; i++) {
			null_ += "0";
		}
		return null_.concat(nummer);	
	}

	public static String moduloBban(String bban) {
		/**
		 * @param bban: Die bban ist die Bankleitzahl mit der Normalisierten Kontonummer ( 10 Stellig )
		 * @return die die geschnittende bban % 97
		 */
		if (bban.length() < 9) {
			int zahl = Integer.valueOf(bban) % 97;	/* zahl: wird als int gecastet für mod 97 */
			return Integer.toString(zahl);
		}
		String pz = bban.substring(0, 9); 		/* pz: speicher die ersten 9 zahlen der bban */
		int y = Integer.valueOf(pz) % 97; 		/* y: wird als int gecastet für mod 97 */
		
		String neueBban = Integer.toString(y) + bban.substring(9);
		
		return moduloBban(neueBban);

	}
	
	public static String erzeugeIban(String laenderkennung, String bankleitzahl, String kontonummer) {
		// UpperCase
		laenderkennung = laenderkennung.toUpperCase();
		
		// 1. die normalizeKontonummer Funktion wird gerufen
		kontonummer = normalisieren(kontonummer);
		
		// 2. Die zwei Buchstaben werden als zahlen codiert DE - 131400
		int firstChar = laenderkennung.charAt(0) - 'A' + 10;
		int secondChar = laenderkennung.charAt(1) - 'A' + 10;
		String codierterCode = "" + firstChar + "" + secondChar + "00";
		
		// 3. Die Bankleitzahl und nummer werden zusammen gefügt
		String bban = bankleitzahl + kontonummer;
//		System.out.println(bban);
		
		// 4. ''  mit dem codierten aus 2.
		String erweiterterBban = bban + codierterCode;
		
		// 5. Zweiteilige Rechnung der 24-stelligen String
		int x = Integer.valueOf(moduloBban(erweiterterBban));
		
		// 6. Prüfzahl die nach der laenderkennung angezeigt wird
		int pruefzahl = 98 - x;
		String pz = pruefzahl < 10 
				? "0" + Integer.toString(pruefzahl) 
				: Integer.toString(pruefzahl);
		
		// Die gesamte Iban wird ausgegeben
		return laenderkennung+pz+bban;
	}
	
}

