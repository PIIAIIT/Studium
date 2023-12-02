package Ubung6;

public class u6a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		a = a++; 	// a wird mit dem alten Wert den a bei a++ zugewiesen und bleibt somit bei 5
		System.out.println(a);
		int b = 5;
		++b; 		// hier wird ein Fehler angezeigt wenn man versucht ++b zuzuweisen, weil kein 
					// Wert ist sondern eine Anweisung die b um eins erhöht
		System.out.println(b);
	}

}
