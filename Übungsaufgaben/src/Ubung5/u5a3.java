package Ubung5;

public class u5a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flugbahn(80,60);	
	}
	
	public static void flugbahn(double v, double omegawinkel) {
		Zeichenblatt zb = new Zeichenblatt(600,600);
		zb.benutzerkoordinaten(0, 0, 100, 100);
		
		final double G = 9.8;		// Graitationskonstante
		final double C = 0.002;		// Widerstandkonstante
		
		double x = 0.;
		double y = 0.;
		double theta = 0.0001;

		double vx;
		double vy;
		double ax;
		double ay;
		
		omegawinkel = Math.toRadians(omegawinkel);

		do {
			zb.rechteck(x, y, 1.5, 1.5);
		
			vx = v*Math.cos(omegawinkel);
			vy = v*Math.sin(omegawinkel);
			
			ax = -C * v * vx;
			ay = -G-C * v * vy;
			
			vx += (ax * theta);//
			vy += (ay * theta);//
			
			x += (vx + theta)/1000;
			y += (vy + theta)/1000;
			zb.pause(1);
			zb.anzeigen();
			
			System.out.println(x+"|"+y);
			
			theta += 0.002;
		}
		while (y >= 0);
		
		
	}

}
