
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+recursive(0,2));
	}
	
	public static int recursive(int monat, int ratte) {
//		System.out.println(x);
		int temp = ratte/2;
		if (monat>5) {
			return ratte;
		}
		System.out.println(monat+" "+ratte+" "+temp+" ");
		if (monat!=0) {
			ratte += 12*temp;
		}
		
		return recursive(monat+1,ratte);
		
	}
}
