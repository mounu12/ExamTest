package assignment6;

public class Quad implements IQuad{
	private double x1, x2, x3, x4;

	public Quad() {
		x1 = Double.NaN;
		x2 = Double.NaN;
		x3 = Double.NaN;
		x4 = Double.NaN;
	}

	public Quad(double newX1, double newX2, double newX3, double newX4) {
		x1 = newX1;
		x2 = newX2;
		x3 = newX3;
		x4 = newX4;
	}

	public void Biquadratic(double newX1, double newX2, double newX3, double newX4) {
		{
			x1 = newX1;
			x2 = newX2;
			x3 = newX3;
			x4 = newX4;
		}
	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}

	public double getX3() {
		return x3;
	}

	public double getX4() {
		return x4;
	}

	public Quad solveQuadratic(double a, double b, double c) {
		Pair p = new Pair();
		Pair newpair=p.solveQuadratic(a, b, c);
		double x1 = newpair.getX();
		double x2 = newpair.getY();
		if (x1 == Double.NaN && x2 == Double.NaN)
			return new Quad();
		else
			return new Quad(-Math.sqrt(x1), Math.sqrt(x1), -Math.sqrt(x2), Math.sqrt(x2));

	}
}
