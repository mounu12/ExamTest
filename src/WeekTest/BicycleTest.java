package WeekTest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment6.Bicycle;

public class BicycleTest {

	@Test
	public void test() {
	Bicycle b=new Bicycle(1);
	b.decreaseSpeed();
	 boolean result=b.ismoving();
	assertEquals(true,result);
	}
	
	public void IncreasingSpeed() {
		Bicycle b=new Bicycle(10);
		b.decreaseSpeed();
	 boolean result=b.ismoving();
	
	
	assertEquals(true,result);
	}
	public void decreasing() {
		Bicycle b=new Bicycle(-1);
		b.decreaseSpeed();
	 boolean result=b.ismoving();
	
	
	assertEquals(true,result);
	}

}
