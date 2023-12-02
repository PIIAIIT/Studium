package Ubung9;

public class Composed extends Function {

	// 6.
	private Function f;
	private Function g;
	
	public Composed(Function f, Function g) {
		this.f = f;
		this.g = g;
	}
	
	public double map(double x) {
		double y = f.map(x);
		return g.map(y);
	}

}


