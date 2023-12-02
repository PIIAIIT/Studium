public class ParityBit {

	public static void main(String[] args) {
		/** Praktomat Nr. 3*/
		
		int wert = 0x17;
		
		// Pruefziffer deklariert und vom 0b1 geshiftet
		int pruefziffer = wert & 0b1;
		wert = wert >> 0b1;
		
		int quersumme=0;
		
		for (int x=0; x<4; x++) {
			
			if ((wert & 0b1) == 0x1) {
				
				quersumme += 1;
				
			}
			wert = wert >> 0b1;
		}
		
		boolean ueberpruefung = quersumme%2 == pruefziffer;

		System.out.println(ueberpruefung);
		
		System.out.println(quersumme);
		
		System.out.println(pruefziffer);
	}

}
