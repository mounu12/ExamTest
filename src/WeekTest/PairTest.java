package WeekTest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment6.Pair;

public class PairTest {

	@Test
	public void test() {
	Pair p=new Pair();
	Pair p1=p.solveQuadratic(1.0, 5.0, 6.0);
	double x1=p1.getX();
	double X2=p1.getY();
	assertEquals(0,x1,0);
	assertEquals(-3,X2,-2);
	
	}
	@Test
	public void testchangingvalues() {
		Pair p=new Pair();
		Pair p1=p.solveQuadratic(1.0, 3.0, 0);
		double x1=p1.getX();
		double X2=p1.getY();
		assertEquals(0,x1,0);
		assertEquals(-3,X2,0);
		
		}

}
