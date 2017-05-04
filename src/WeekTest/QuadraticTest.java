package WeekTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assignment6.Quad;

public class QuadraticTest {
	@Test
	public void test() {
	Quad q=new Quad();
	Quad q1=q.solveQuadratic(1,5,6);
	double x1=q1.getX1();
	double X2=q1.getX2();
	double x3=q1.getX3();
	double x4=q1.getX4();
	assertEquals(0,x1,0);
	assertEquals(0,X2,0);
	assertEquals(Double.NaN,x3,0);
	assertEquals(Double.NaN,x4,0);
	}
	public void test1() {
		Quad q=new Quad();
		Quad q1=q.solveQuadratic(1.0, 3.0, 0);
		double x1=q1.getX1();
		double X2=q1.getX2();
		double x3=q1.getX3();
		double x4=q1.getX4();
		assertEquals(0,x1,0);
		assertEquals(0,X2,0);
		assertEquals(-3,x3,0);
		assertEquals(3,x4,0);
		}
}
