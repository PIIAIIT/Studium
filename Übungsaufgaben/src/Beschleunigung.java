import java.util.Scanner;

public class Beschleunigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * @param weg: Ort int zeitabhänigkeit
		 * @param zeit: 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Gebe mir zwei Eingaben und eine die gesucht werden soll (?).");
		System.out.println("Gib mir zuerst den Weg.");
		
		double weg = sc.nextDouble();
		System.out.println("Gib mir jetzt die Zeit.");
		double zeit = sc.nextDouble();
		System.out.println("Gib mir noch die Geschwindigkeit.");
		double v = sc.nextDouble();
			
		sc.close();
		
		
	}
	
}
