package Ubung8;

public class u8a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] M = new String[] {"3","4","4","5"};
		
		String[] exchM = exchangeAll(M,"4","6");
		
		for (String s: exchM) {
			System.out.print(s+" ");
		}
	}
	
	public static String[] exchangeAll(String[] M, String a, String b) {
		for (int i = 0; i < M.length; i++) {
			if (M[i].equals(a)) {
				M[i] = b;
			}
		}
		return M;
	}

}
