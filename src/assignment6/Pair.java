package assignment6;

public class Pair implements IPair {
	 double x1, x2;

	public Pair() {
		x1 = Double.NaN;
		x2 = Double.NaN;
	}

	public  Pair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
	}

	public void setPair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
	}

	public double getX() {
		return x1;
	}

	public double getY() {
		return x2;
	}
	public Pair solveQuadratic(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		double x1 = 0,x2 = 0;
		if (discriminant < 0)
		
			x1=((-b + Math.sqrt(discriminant)) / (2 * a));
		 x2=((-b - Math.sqrt(discriminant)) / (2 * a));
		  
		    

		Pair p=new Pair(x1,x2);
		return p;
}
}
	
	
	    

