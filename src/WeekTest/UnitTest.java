package WeekTest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment6.Kitten;
import assignment6.Person;

public class UnitTest {

	@Test
	public void test() {
		Person p = new Person("gregor");
		Kitten k = new Kitten("Bob", p);
		int p1 = k.getAge();
		assertEquals(p1, 0);
		k.haveBirthday();
		
		
		String s = "Bob the Feline is 1 and belongs to Gregor";

		String result = k.toString();
		assertEquals(s, result);
	}

}
