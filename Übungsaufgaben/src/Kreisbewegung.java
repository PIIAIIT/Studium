
public class Kreisbewegung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int periode = 10; // s -- Zeit eines Umlaufes vom Körper
		int frequenz = 20; // Hz -- wie viele Umläufe der Körper pro Sekunde
		int radius = 1; // cm
		kreisfrequenz(frequenz);
		winkelgeschwindigkeit(periode);
		bahngeschwindigkeit(radius, periode);
	}
	
	public static double kreisfrequenz(double frequenz /*Hz*/) {
		// klein omega
		return 2 * Math.PI * frequenz; // pro sekunde
	}

	public static double winkelgeschwindigkeit(double periode) {
		return ( 2 * Math.PI ) / periode;
	}
	
	public static double bahngeschwindigkeit(double radius, double periode) {
		return (2 * Math.PI * radius) / periode;
	}


}


