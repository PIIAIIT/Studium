package Ubung9;

public class RueckgabeautomatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rueckgabeautomat r = new Rueckgabeautomat(new int[] {2,2,2,2,2,2,2,2});
		Rueckgabeautomat d = new Rueckgabeautomat(new int[] {5,2,3,1,2,23,6,2});

		// eingabe nur in Euro
		r.einzahlen(1);
		d.einzahlen(1);

		System.out.println(r);
		int[] s = r.zahlbetrag(.57);
		System.out.println(r.intString(s));
		System.out.println(r);

		System.out.println();

		System.out.println(d);
		s = d.zahlbetrag(.57);
		System.out.println(d.intString(s));
		System.out.println(d);

		
		
		

	}

}
