import java.util.Scanner;

public class DatumErweiterung2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (Sie können sich ja einmal überlegen, welche zusätzliche Komplexität durch den
		// Einbezug von Schaltjahren und durch größere m2 -Werte hinzukommen würde).
		Scanner sc = new Scanner(System.in);
		int jahr = sc.nextInt();
		int monat = sc.nextInt();
		int tage = sc.nextInt();
		int stunde = sc.nextInt();
		int minuten = sc.nextInt();
		int eingabe_min = sc.nextInt();
		sc.close();
		
		// check if schaltjahr dann 29 sonst 28 tage für feb.
		int schaltjahr_mtage = ((jahr%4==0 && (jahr%100!=0)) || jahr%400==0) ? 29 : 28;
		
		// Loop over all minutes / 60
		for (int x=1; x<=(minuten+eingabe_min)/60; x++) {
			stunde += 1;
			if (stunde>=24) 
			{
				tage+=1;
				stunde = 0;
				switch(monat) { // 28: 2 ;  30: 4,6,9,11 ; 31: 1,3,5,7,8,10,12
					case 1: if (tage>31) {monat+=1;tage=1;}break;
					case 2: if (tage>schaltjahr_mtage) {monat+=1;tage=1;}break;
					case 3: if (tage>31) {monat+=1;tage=1;}break;
					case 4: if (tage>30) {monat+=1;tage=1;}break;
					case 5: if (tage>31) {monat+=1;tage=1;}break;
					case 6: if (tage>30) {monat+=1;tage=1;}break;
					case 7: if (tage>31) {monat+=1;tage=1;}break;
					case 8: if (tage>31) {monat+=1;tage=1;}break;
					case 9: if (tage>30) {monat+=1;tage=1;}break;
					case 10: if (tage>31) {monat+=1;tage=1;}break;
					case 11: if (tage>30) {monat+=1;tage=1;}break;
					case 12: if (tage>31) {monat+=1;tage=1;}break;
				}
			}
			if (monat>12) {
				jahr +=1;
				monat = 1;
				schaltjahr_mtage = ((jahr%4==0 && (jahr%100!=0)) || jahr%400==0) ? 29 : 28;
				System.out.println(schaltjahr_mtage);
			}

		}
		minuten = (minuten+eingabe_min)%60; //Endbetrag Minuten

		System.out.println(jahr+" "+monat+" "+tage+" "+stunde+" "+minuten);
		
	}

}