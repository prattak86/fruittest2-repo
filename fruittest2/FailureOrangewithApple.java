package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class FailureOrangewithApple {

	@Test
	public void failureOrangewithApple() {
		FruitTest test = new FruitTest();
		boolean result = test.orange("apple");
		assertFalse(result);
	}
}