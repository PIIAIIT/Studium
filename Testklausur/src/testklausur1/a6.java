package testklausur1;

public class a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		// Formel von Heron von Alexandria
		double s = (a+b+c) / 2;
		
		double inner = s * (s - a) * (s - b) * (s - c);
		
		double flaecheninhalt = Math.sqrt(inner);
		
		System.out.println(flaecheninhalt);
	}

}
