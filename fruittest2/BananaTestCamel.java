package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class BananaTestCamel {

	@Test
	public void passBananaCamelcase() {
		FruitTest test = new FruitTest();
		boolean result = test.banana("Banana");
		assertTrue(result);
	}
}
