package Ubung9;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 5.
		Parabel f = new Parabel(5,-2,4);
//		f.print(-5, 5, 0.1);
		
		// 7.
		Hyperbel h = new Hyperbel(1);
		
		Composed c = new Composed(f, h);
		c.print(-20, 20, 0.1);
		
		double[][] w = c.werte(-20, 20, 0.1);
		
		// zusätzlich -- mit Zeichenblatt visuell ausgeben
		double mx = 0;
		for (int i = 0; i < w.length;i++) {
			if (w[i][1] > mx) {
				mx = w[i][1];
			}
		}
		
		Zeichenblatt zb = new Zeichenblatt(500, 500);
		zb.benutzerkoordinaten(w[0][0]*0.6, mx * 2, -w[0][0]*0.6, -mx*2);
		
		for (double[] e: w) {
			zb.linie(e[0], -e[1]);
			
			zb.pause(5);
			zb.anzeigen();
		}
		
	}

}
