/**
 * @author patrick
 * @version 1.1
 * @date 13.11.2023
 * 
 * 
 */
public class Parasitenzahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long m = Long.parseLong(args[0]);
		istParasitenzahl(m);
		
		for (int i = 1; i <=m; i ++) {
			if (istParasitenzahl(i)) {
				System.out.println(i);
				
			}
		}
		
	}
	
	public static boolean istParasitenzahl(long zahl) {
		long faktor = zahl%10;
		long zahlEnde = zahl / 10;
		long gesuchteZahl = faktor * zahl;
		
		int zaehler = 1;
		
		while (zahl != 0) {
			zahl /= 10;
			zaehler*=10;
		}
		
		zaehler /= 10;
		long zahl1 = (faktor * zaehler) + zahlEnde;

		return zahl1 == gesuchteZahl;
	}

}

