import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int schluessel = sc.nextInt();
		
		char buchstabe = sc.next().charAt(0);
		
		sc.close();
		
		// Index des Buchstaben anlegen
		int bindex = buchstabe - 'A';
		
		// Der Wert den ich brauche um von 'A' zu den encryped Buchstaben zu kommen
		bindex = (schluessel + bindex) % 26;
		
		// 
		char buchstabe_verschluesselt = (char) (bindex + 'A');
		
		System.out.println(buchstabe_verschluesselt);
	}

}

