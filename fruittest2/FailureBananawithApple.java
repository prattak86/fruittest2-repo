package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class FailureBananawithApple {

	@Test
	public void failureBananawithApple() {
		FruitTest test = new FruitTest();
		boolean result = test.banana("apple");
		assertFalse(result);
	}
}