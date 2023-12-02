
public class Vertauschen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inhalt = vertauscheInhalt(args);
		String[] referenz = vertauscheReferenz(args);

		// Tests:
		// beide muessen gleiche Inhalte haben
		if (!testInhaltGleich(inhalt,referenz)) {
			System.out.println("Fehler: Inhalte stimmen nicht ueberein!");
		}
		// aber beide muessen unterschiedliche Referenzen haben
		if (testReferenzGleich(inhalt,referenz)) {
			System.out.println("Fehler: Referenzen muessen unterschiedlich sein!");
		}
		printList(args);
		printList(inhalt);
		printList(referenz);
	}
	
	public static String[] vertauscheInhalt(String[] args) {
		String[] neues_feld = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			String inhalt = args[args.length-1-i];
			neues_feld[i] = inhalt;
		}
		return neues_feld;
		
	}
	
	public static String[] vertauscheReferenz(String[] args) {
		String[] neues_feld = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			neues_feld[i] = args[args.length-1-i];
		}
		return neues_feld;
		
	}
	
	public static boolean testInhaltGleich(String[] args1, String[] args2) {
		boolean gleich = true;
		for (int i = 0; i < args1.length;i++) {
			if (args1[i].equals(args2[i])) {
				gleich = false;
			}
		}
		return gleich;
	}
	
	public static boolean testReferenzGleich(String[] args1, String[] args2) {
		boolean gleich = true;
		for (int i = 0; i < args1.length;i++) {
			if (args1[i] == args2[i]) {
				gleich = false;
			}
		}
		return gleich;
	}
	
	
	
	/**
	 * Methode um eine Liste auf dem Bildschirm auszugeben.
	 * 
	 * @param a: die Liste die ausgegeben wird
	 * 
	 */
	public static void printList(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("  "+a);
	}
}

