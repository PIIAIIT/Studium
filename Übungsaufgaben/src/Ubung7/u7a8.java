package Ubung7;

public class u7a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToString(20));
	}
	
	public static String intToString(int x) {
		if (x < 20 || x > 99) {
			return "Fehler bei der Eingabe, Zahlen nur zwischen 20 und 99 erlaubt.";
		}
		String decodedString = "";
		switch (x%10) {
			case 1:
				decodedString += "ein";
				break;
			case 2:
				decodedString += "zwei";
				break;
			case 3:
				decodedString += "drei";
				break;
			case 4:
				decodedString += "vier";
				break;
			case 5:
				decodedString += "fuenf";
				break;
			case 6:
				decodedString += "sechs";
				break;
			case 7:
				decodedString += "sieben";
				break;
			case 8:
				decodedString += ("acht");
				break;
			case 9:
				decodedString += ("neun");
				break;
		}
		if (x%10!= 0) {
			decodedString += "und";
		}
		
		switch (x/10) {
			case 2:
				decodedString += ("zwanzig");
				break;
			case 3:
				decodedString += ("dreizig");
				break;
			case 4:
				decodedString += ("vierzig");
				break;
			case 5:
				decodedString += ("fuenfzig");
				break;
			case 6:
				decodedString += ("sechzig");
				break;
			case 7:
				decodedString += ("siebzig");
				break;
			case 8:
				decodedString += ("achtzig");
				break;
			case 9:
				decodedString += ("neunzig");
				break;
		
		}
		return decodedString;
	}

}
