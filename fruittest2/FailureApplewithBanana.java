package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class FailureApplewithBanana {

	@Test
	public void failureApplewithBanana() {
		FruitTest test = new FruitTest();
		boolean result = test.apple("banana");
		assertFalse(result);
	}
}