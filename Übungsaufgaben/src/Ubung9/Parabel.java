package Ubung9;

public class Parabel extends Function{

	// 2.
	private double a;
	private double b;
	private double c;
	
	public Parabel(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double map(double x) {
		return a * x * x + b * x + c;
	}


}
