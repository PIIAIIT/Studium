package Ubung8;

public class u8a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] feld = {"Hello", "world"};
		System.out.println(doppeltSoGroß(feld)[0]);
	}
	
	public static String[] doppeltSoGroß(String[] feld) {
		String[] res = new String[feld.length*2];
		for (int i = 0; i < res.length; i++) {
			res[i*2] = feld[i];
				
		}
		return res;
	}

}
