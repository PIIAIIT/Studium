package Ubung4;
import java.util.Scanner;

public class u4a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String vn = sc.next(); // vor | nach
		char c = sc.next().charAt(0); // Zeichen nach dem gesucht wird.
		String word = sc.nextLine().substring(4); // "in " wird am string start gelöscht.
		sc.close();
		
		String output = "";
		
		int index_of_c;
		
		// 
		
		if (!(word.contains(String.valueOf(c)))) System.out.println(output);
		
		else if (word.contains(" ")) System.out.println("Word darf kein Leerzeichen enthalten."); 
		
		
		// Unterscheidung: "vor" | "nach"
		else if (vn.equals("vor")) {
			index_of_c = word.lastIndexOf(c);
			output = word.substring(0, index_of_c);
		}
		
		else if (vn.equals("nach")) {
			index_of_c = word.indexOf(c);
			output = word.substring(index_of_c+1);
		}
		
		else System.out.println("Erstes Wort darf nur \"vor\" oder \"nach\" sein.");
	
		
		// Print output
		System.out.println(output);
		
	}

}
