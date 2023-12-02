package Ubung8;

public class u8a9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] M = new String[] {"a","b","c","d"};
		String m = "e";
		
		boolean b = istenthalten(M,m);
		System.out.print(b);
	}
	
	public static boolean istenthalten(String[] folge, String a) {
		if (folge.length == 0) {
			return false;
		}
		if (folge[0].equals(a)) {
			return true;
		}
		String[] new_f = new String[folge.length-1];
		for (int i = 0; i < folge.length-1; i++) {
			new_f[i] = folge[i+1];
		}
		return istenthalten(new_f,a);
	}

}
