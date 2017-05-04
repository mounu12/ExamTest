package assignment6;

public interface IQuad {
	public void Biquadratic(double newX1, double newX2, double newX3, double newX4);
	public double getX1();
	public double getX2();
	public double getX3();
	public double getX4();
	public Quad solveQuadratic(double a, double b, double c);
}
