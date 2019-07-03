package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class AppleTestLower {

	@Test
	public void passAppleLowercase() {
		FruitTest test = new FruitTest();
		boolean result = test.apple("apple");
		assertTrue(result);
	}
}
