package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class BananaTestUpper {

	@Test
	public void passBananaUppercase() {
		FruitTest test = new FruitTest();
		boolean result = test.banana("BANANA");
		assertTrue(result);
	}
}
