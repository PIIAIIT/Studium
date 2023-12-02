package Ubung7;

public class u7a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1,1,1,1};
		int[] b = {4,5,6,0,2,4,1,2,2};
		PrintList pr = new PrintList();
		pr.printList(listAdd(a,b));
	}
	
	public static int[] listAdd(int[] f1, int[] f2) {
		int[] neues_feld = new int[f1.length + f2.length];

		for (int i = 0; i < f1.length; i++) {
			neues_feld[i] = f1[i];
		}
		for (int i = 0; i < f2.length; i++) {
			neues_feld[i+f1.length] = f2[i];
		}
		return neues_feld;
	}

	
}
