package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class OrangeTestCamel {

	@Test
	public void passOrangeCamelcase() {
		FruitTest test = new FruitTest();
		boolean result = test.orange("Orange");
		assertTrue(result);
	}
}