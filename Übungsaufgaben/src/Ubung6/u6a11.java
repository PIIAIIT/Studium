package Ubung6;

public class u6a11 {
	// Oberflaechenentfernung

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = entfernung(
				7.0,  11.0, 1.0,  'O',
				50.0, 46.0, 50.0, 'N',
				6.0,  5.0,  50.0, 'O',
				50.0, 47.0, 28.0, 'N');
		
		System.out.print("Die Oberflaechenentfernung zwischen den beiden Punkten ist " + e + " km.");
	}
	
	public static double entfernung(
			double laengeGrad1, double laengeMinute1, double laengeSekunde1, char laengeRichtung1,
			double breiteGrad1, double breiteMinute1, double breiteSekunde1, char breiteRichtung1,
			double laengeGrad2, double laengeMinute2, double laengeSekunde2, char laengeRichtung2,
			double breiteGrad2, double breiteMinute2, double breiteSekunde2, char breiteRichtung2) {
		final double ERDRADIUS = 6378.137;
		double laengeWert1 = laengeGrad1 + (laengeMinute1 / 60) + (laengeSekunde1 / 3600);
		if (laengeRichtung1 == 'W' || laengeRichtung1 == 'S') {
			laengeWert1 *= -1;
		}
		double breiteWert1 = breiteGrad1 + (breiteMinute1 / 60) + (breiteSekunde1 / 3600);
		if (breiteRichtung1 == 'W' || laengeRichtung1 == 'S') {
			breiteWert1 *= -1;
		}
		double laengeWert2 = laengeGrad2 + (laengeMinute2 / 60) + (laengeSekunde2 / 3600);
		if (laengeRichtung2 == 'W' || laengeRichtung1 == 'S') {
			laengeWert2 *= -1;
		}
		double breiteWert2 = breiteGrad2 + (breiteMinute2 / 60) + (breiteSekunde2 / 3600);
		if (laengeRichtung2 == 'W' || laengeRichtung1 == 'S') {
			breiteWert2 *= -1;
		}
		
		
		double dist = distanz(laengeWert1, breiteWert1, laengeWert2, breiteWert2);
		
		if (dist >= 0) {
			return ERDRADIUS * dist;
		}
		return ERDRADIUS * (dist + Math.PI);
	}
	
	public static double toRadiant(double grad) {
		return grad * Math.PI/180;
	}

	public static double distanz(double lw1, double bw1, double lw2, double bw2) {
		double ersteR = Math.sin(bw1) * Math.sin(bw2);
		double zweiteR = Math.cos(bw1) * Math.cos(bw2) * Math.cos(lw2 - lw1);
		return Math.acos(ersteR+zweiteR);
	}

}
