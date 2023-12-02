package Ubung9;

public class Function {

	// 1.
	public double map(double x) {
		return x;
	}
	
	// 4.
	public void print(double startX, double endX, double step) {
		System.out.println("x\tf(x)");
		
		for (double x = startX; x <= endX; x+=step) {
			double y = map(x);
			System.out.println(Math.round(x*100)/100. + "\t" + y);
		}
	}
	
	public double[][] werte(double startX, double endX, double step) {
		int laenge = (int) ( (Math.abs(startX) + Math.abs(endX)) / step);
		double[][] werte = new double[laenge][2];
		
		int count = 0;
		for (double x= startX; x < endX; x+=step) {
			double y = map(x);
			
			werte[count][0] = x;
			werte[count][1] = y;
			
			count++;
		}
		return werte;
	}
	
}
