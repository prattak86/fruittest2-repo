package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class AppleTestCamel {

	@Test
	public void passAppleCamelcase() {
		FruitTest test = new FruitTest();
		boolean result = test.apple("Apple");
		assertTrue(result);
	}
}
