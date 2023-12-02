package Ubung4;
import java.util.*;

public class U4_A4_Ceasar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int schluessel = sc.nextInt();
		String wort = sc.next();
		
		
		wort = wort.toUpperCase();
		
		sc.close();
		
		// bekomm den Index des Buchstabens
		
		for (int x = 0; x < wort.length();x++ ) {
			
			char c = wort.charAt(x);
			

			int bindex = c - 'A';
			bindex = (schluessel + bindex) % 26;
			
			// 
			char buchstabe_verschluesselt = (char) (bindex + 'A');
			
			// 
			System.out.println("Buchstabe " + wort.charAt(x) + " verschlüsselt " + buchstabe_verschluesselt);
		}
		
	}

}
