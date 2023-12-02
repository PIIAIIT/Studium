package Ubung4;
import java.util.*;
import java.io.*;

public class u4a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method1(args);
//		Method2();
		Method3();
	}
	
	public static void Method1 (String[] args) {
		// Drei zahlen über die Konsole anlegen
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// Die Summe der Zahlen ausgeben
		System.out.println(a+b+c);
	}
	
	public static void Method2 () {
		System.out.println("Geben Sie drei Zahlen ein.");
		
		// Scanenr von der Tastatur anlegen
		Scanner sc = new Scanner(System.in);
		// drei Zahlen unter Scanner lesen
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// Scanner schließen
		sc.close();
		
		// Gebe die Summe von den drei Zahlen aus
		System.out.println(a+b+c);
	}
	
	public static void Method3 () {
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("./src/u4a2_text.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("Datei nicht vorhanden.");
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// Scanner schließen
		sc.close();
		
		// Gebe die Summe von den drei Zahlen aus
		System.out.println(a+b+c);
		
	}

}
