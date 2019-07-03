package fruittest2;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class BananaTestLower {

	@Test
	public void passBananaLowercase() {
		FruitTest test = new FruitTest();
		boolean result = test.banana("banana");
		assertTrue(result);
	}
}
