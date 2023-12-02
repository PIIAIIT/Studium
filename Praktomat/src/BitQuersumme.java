/**
 * @version 1.0
 * @author patrick
 * 
 */
public class BitQuersumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe_zahl = Integer.parseInt(args[0]);
		int quersumme = 0;
		
		for (int i = 0;i <= 15;  i++) {
			int maske = (1 << i);
			int maskierterWert = eingabe_zahl & maske;
			int bit = maskierterWert >> i;
			quersumme += bit;
//			quersumme += eingabe_zahl & 0b1;
//			
//			eingabe_zahl >>= 0b1;
		
		}
		System.out.println(quersumme);
	}

}

