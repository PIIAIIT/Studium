import java.util.Scanner;

public class DatumErweiterung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int jahr = sc.nextInt();
		int monat = sc.nextInt();
		int tage = sc.nextInt();
		int stunde = sc.nextInt();
		int minuten = sc.nextInt();
		int eingabe_min = sc.nextInt();
		sc.close();
		
		for (int x=1; x<=(minuten+eingabe_min)/60; x++) {
			stunde += 1;
			if (stunde>=24) 
			{
				tage+=1;
				stunde = 0;
				switch(monat) { // 28: 2 ;  30: 4,6,9,11 ; 31: 1,3,5,7,8,10,12
					default: if (tage>31) {monat+=1;tage=1;}break;
					case 2: if (tage>28) {monat+=1;tage=1;}break;
					case 4,6,9,11: if (tage>30) {monat+=1;tage=1;}break;
				}
			}
			if (monat>12) {
				jahr +=1;
				monat = 1;
			}
		}
		minuten = (minuten+eingabe_min)%60; //Endbetrag Minuten

		System.out.println(jahr+" "+monat+" "+tage+" "+stunde+" "+minuten);
		
	}

}
