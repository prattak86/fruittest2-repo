package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class OrangeTestUpper {

	@Test
	public void passOrangeUppercase() {
		FruitTest test = new FruitTest();
		boolean result = test.orange("ORANGE");
		assertTrue(result);
	}
}