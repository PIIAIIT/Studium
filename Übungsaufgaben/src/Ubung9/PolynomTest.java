package Ubung9;

public class PolynomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynom p = new Polynom(new double[] {1,3});
		Polynom q = new Polynom(new double[] {0,2,3});
		
		// 1.
		System.out.println(p);
		System.out.println(q);
		
		Polynom r = p.addieren(q);
		
		System.out.println(r);
		System.out.println();

		// 2.
		p = new Polynom(new double[] {7,5,1,2});
		p = p.ableiten();
		
		System.out.println(p);

		// 3.
		q = new Polynom(new double[] {4,3,2,1,});
		r = q.addieren(p);
		Polynom r1 = r.ableiten();
		Polynom r2 = r.ableiten();
		
		System.out.println();
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);

		System.out.println(r.auswerten(4711));
		System.out.println(r1.auswerten(4711));
		System.out.println(r2.auswerten(4711));
		
		System.out.println(Polynom.getAnzahl());
		
		//Aufgabe 7
		// (1)
		p = new Polynom(new double[] {3,2,1});
		q = new Polynom(new double[] {1,2,7});
		Polynom kl = p.multiplizieren(q);
		System.out.println(kl);
		
		// (2)
		r = new Polynom(new double[] {-3,0,2});
		Polynom R = r.integrieren();
		System.out.println(r);
		System.out.println(R);
	}

}
