/**
 * @author patrick
 * @date 17.11.2023
 * @version 1.2
 * 
 * Palindromzahl ausrechnen mit gespiegelter Zahl.
 */
public class Palindromzahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		
		System.out.println(spiegeln(n));
		
		System.out.println(spiegelAddieren(n));
		
		System.out.println(palindromZahl(n));
	}
	
	public static int spiegeln(int zahl) {
		int gespiegelteZahl = 0;
		int temp;
		
		while (zahl > 0) {
			temp = zahl % 10;								/* temp: die niedrigste Zahl */
			zahl /= 10;
			gespiegelteZahl = gespiegelteZahl * 10 + temp;		/* x = x * y + z */
		}
		return gespiegelteZahl;
	}
	
	public static int spiegelAddieren(int zahl) {
		return spiegeln(zahl) + zahl;
	}
	
	public static boolean palindromTest(int zahl) {
		return zahl == spiegeln(zahl);
	}
	
	public static int palindromZahl(int zahl) {
		while (!palindromTest(zahl)) {
			zahl = spiegelAddieren(zahl);
		}
		return zahl;
	}

}

