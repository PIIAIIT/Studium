package Ubung6;

public class Oberflaechenentfernung {
	// Oberflaechenentfernung

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = entfernung(
				7.0,  11.0, 1.0,  'O',
				50.0, 46.0, 50.0, 'N',
				6.0,  5.0,  50.0, 'O',
				50.0, 47.0, 28.0, 'N');
//		double[] pos1 = {50.70931560146345, 7.052514421792418};
//		double[] pos2 = {50.77973189248734, 7.182837788579505};
//		double e = entfernung(pos1,pos2);
		
		System.out.print("Die Oberflaechenentfernung zwischen den beiden Punkten ist " + e + " km.");
	}
	
	public static double entfernung(
			double laengeGrad1, double laengeMinute1, double laengeSekunde1, char laengeRichtung1,
			double breiteGrad1, double breiteMinute1, double breiteSekunde1, char breiteRichtung1,
			double laengeGrad2, double laengeMinute2, double laengeSekunde2, char laengeRichtung2,
			double breiteGrad2, double breiteMinute2, double breiteSekunde2, char breiteRichtung2) {
		final double ERDRADIUS = 6378.137;
		
		// 1. GPS-Angaben in Grad mit Nachkommaanzeil
		double laengeWert1 = laengeGrad1 + (laengeMinute1 / 60) 
				+ (laengeSekunde1 / 3600);
		double breiteWert1 = breiteGrad1 + (breiteMinute1 / 60) 
				+ (breiteSekunde1 / 3600);
		double laengeWert2 = laengeGrad2 + (laengeMinute2 / 60) 
				+ (laengeSekunde2 / 3600);
		double breiteWert2 = breiteGrad2 + (breiteMinute2 / 60) 
				+ (breiteSekunde2 / 3600);
		
		if (laengeRichtung1 == 'W' || laengeRichtung1 == 'S') {
			laengeWert1 *= -1;
		}
		if (breiteRichtung1 == 'W' || laengeRichtung1 == 'S') {
			breiteWert1 *= -1;
		}
		if (laengeRichtung2 == 'W' || laengeRichtung1 == 'S') {
			laengeWert2 *= -1;
		}
		if (laengeRichtung2 == 'W' || laengeRichtung1 == 'S') {
			breiteWert2 *= -1;
		}
		
		double dist = distanz(laengeWert1, breiteWert1, laengeWert2, breiteWert2);
		
		if (dist >= 0) {
			return ERDRADIUS * dist;
		}
		return ERDRADIUS * (dist + Math.PI);
	}

	public static double entfernung(
			double[] position1,
			double[] position2) {
		/**
		 * @param: position ist ein array mit zwei positionen jeweils als grad angabe
		 */
		// Konstante var die den ERDRADIUS angibt in km
		final double ERDRADIUS = 6378.137;
		
		// 1. GPS-Angaben in Grad mit Nachkommaanzeil
		double laengeWert1 = toRadiant(position1[0]);
		double breiteWert1 = toRadiant(position1[1]);
		double laengeWert2 = toRadiant(position2[0]);
		double breiteWert2 = toRadiant(position2[1]);
		
		
		double dist = distanz(laengeWert1, breiteWert1, laengeWert2, breiteWert2);
		
		if (dist >= 0) {
			return ERDRADIUS * dist;
		}
		return ERDRADIUS * (dist + Math.PI);
	}
	
	// 2. Grad to Radiant
	public static double toRadiant(double grad) {
		return grad * Math.PI/180;
	}

	public static double distanz(
			double lw1, double bw1, 
			double lw2, double bw2) {
		double ersteR = Math.sin(bw1) * Math.sin(bw2);
		double zweiteR = Math.cos(bw1) * Math.cos(bw2) * Math.cos(lw2 - lw1);
		return Math.acos(ersteR+zweiteR);
	}

}
