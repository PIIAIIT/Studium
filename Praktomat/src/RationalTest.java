import java.util.Scanner;

public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int zaehler = sc.nextInt();
		int nenner = sc.nextInt();
		Rational endBruch = new Rational(zaehler, nenner);
		
		while (true) {
			if (sc.hasNext()) {
				char opr = sc.next().charAt(0);
				if ( opr == '.') {
					break;
				}
				int bruch1_zaheler = sc.nextInt();
				int bruch1_nenner = sc.nextInt();
				Rational bruch2 = new Rational(bruch1_zaheler, bruch1_nenner);
				
				switch (opr) {
					case '+': 
						endBruch = endBruch.add(bruch2);
						break;
					case '-': 
						endBruch = endBruch.sub(bruch2);
						break;
					case '*': 
						endBruch = endBruch.mul(bruch2);
						break;
					case '/': 
						endBruch = endBruch.div(bruch2);
						break;
				}
			}
		}
		sc.close();
		System.out.println(endBruch.toString());
		
	}
}

