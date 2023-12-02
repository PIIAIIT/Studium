package Ubung7;

public class u7a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 0, 4, 2, 1};
		int[] b = inversePermutation(a);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

	public static int[] inversePermutation(int[] a) {
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for (int j = 0; j < b.length; j++) {
			b[j] = j;
		}
		
		for (int i = 0; i < a.length; i++) {
			c[a[i]] = b[i];
		}
		
		return c;
	}
}
