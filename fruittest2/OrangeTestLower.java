package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class OrangeTestLower {

	@Test
	public void passOrangeLowercase() {
		FruitTest test = new FruitTest();
		boolean result = test.orange("orange");
		assertTrue(result);
	}
}