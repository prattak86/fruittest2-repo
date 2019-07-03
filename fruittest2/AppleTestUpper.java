package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class AppleTestUpper {

	@Test
	public void passAppleUppercase() {
		FruitTest test = new FruitTest();
		boolean result = test.apple("APPLE");
		assertTrue(result);
	}
}
