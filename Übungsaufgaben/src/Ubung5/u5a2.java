package Ubung5;

public class u5a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PInaeherung1();
		PInaeherung2();
		PInaeherung3();
	}
	
	public static void PInaeherung1() {
		double pi = 0.;
		double vorzeichen = -1.;
		
		for (double i = 0.; i<=100000.;i++) {
			double sum = 1. / ((2.*i) + 1.);
			
			pi += sum * (vorzeichen *= -1.) ;
		}
		
		System.out.println("Endergebnis = " + pi*4.);
	}
	
	public static void PInaeherung2() {
		double epsilon = 0.0000001;
		double fehler = 0.;
		double pi = 0.;
		double vorzeichen = -1.;
		double i = 0.;

		do {
			double sum = 1. / ((2.*i++) + 1.);
			
			pi += sum * (vorzeichen *= -1.) ;
	
			fehler = Math.abs(sum);
			
			
		} while(fehler > epsilon);
		
		System.out.println("Endergebnis = " + pi*4.);
	}

	public static void PInaeherung3() {
		double epsilon = 1.0E-8;
		double i = 0.;
		double pi = 0.;
		double vorzeichen = -1.;
	
		do {
			double sum = 1 / ((2.*i++) + 1);
			
			pi += sum * (vorzeichen *= -1.) ;
		
//			fehler = Math.abs(sum);
			
			
		} while(Math.abs(Math.PI - 4 * pi) > epsilon);
		
		System.out.println("Endergebnis = "+pi*4.);
	}
}
