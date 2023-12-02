
public class ggt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ggT(10,5)); // 5
		System.out.println(ggT(10,3)); // 1
		System.out.println(ggT(1728,52)); // 4
	}

	public static int ggT(int wert1, int wert2) {
		int zw;
		while (wert2 != 0) {
			zw = wert1 % wert2;
			
			wert1 = wert2;
			wert2 = zw;
		}
		return wert1;
	}
}