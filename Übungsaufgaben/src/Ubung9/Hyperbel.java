package Ubung9;

public class Hyperbel extends Function {
	
	// 3.
	private double a;
	
	public Hyperbel(double a) {
		this.a = a;
	}
	
	public double map(double x) {
		return a / x;
	}
}
