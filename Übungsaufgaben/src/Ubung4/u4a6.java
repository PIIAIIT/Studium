package Ubung4;

public class u4a6 {
	
	public static int[] ikleinergleichj(int i, int j) {
		int temp;
		if (j<i) {
			temp=i; 
			i=j;
			j=temp;
		}
		int[] output = {i,j};
		
		return output;
	}
	
	public static void main(String[]args) {
		int[] x = ikleinergleichj(5,7);
		
		System.out.println(x);
	}
}
