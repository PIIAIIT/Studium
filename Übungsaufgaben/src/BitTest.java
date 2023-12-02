/** spiele mit ints und Bits rum
 * @author Rudolf Berrendorf
 */
public class BitTest {

	/** gibt einen int-Wert in dezimaler und binaerer Schreibweise aus
	 * @param x int-Wert
	 */
	public static void showInt(int x) {
		// gebe Dezimalwert aus
		System.out.print("dezimal " + x + " = binaer ");
		// extrahiere jeweils einen Bit-Wert (vom hoechstwertigsten zum niederwertigsten)
		for(int i=31; i>=0; i--) {
			System.out.print((x >> i) & 0x1);
		}
		// beende Zeile
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int a = 0;
		showInt(a);
		a = 1 & 31;
		showInt(a);
		a = 1 | 31;
		showInt(a);
		a = 31 >> 1;
		showInt(a);
		a = (-1);
		showInt(a);
		a = (1<< 31);
		showInt(a);			 //  1000
		a = (1<< 31) + (-1); // +1111
		showInt(a);			 //1|0111
		a = (1<<31) >>> 1;
		showInt(a);
		
	}

}