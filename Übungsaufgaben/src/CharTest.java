/** spiele mit chars rum
 * @author Rudolf Berrendorf
 */
public class CharTest {

	/** gibt einen int-Wert in dezimaler und binaerer Schreibweise sowie als Character aus
	 * @param x int-Wert
	 */
	public static void showInt(int x) {
		// gebe Dezimalwert aus
		System.out.print("dezimal " + x + " = binaer ");
		// extrahiere jeweils einen Bit-Wert (vom hoechstwertigsten zum niederwertigsten)
		for(int i=31; i>=0; i--) {
			System.out.print((x >> i) & 0x1);
		}
		// gebe Character aus, der zu diesem Code-Wert gehoert
		System.out.println(" = char " + (char)x);
	}
	
	public static void main(String[] args) {
		char c = 'A';
		for (int x=(int)c; x<=(int)c+57; x++) {
			showInt(x);
		}
	}

}