package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class FailureApplewithOrange {

	@Test
	public void failureApplewithOrange() {
		FruitTest test = new FruitTest();
		boolean result = test.apple("orange");
		assertFalse(result);
	}
}