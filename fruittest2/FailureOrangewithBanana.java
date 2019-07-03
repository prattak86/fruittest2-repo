package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class FailureOrangewithBanana {

	@Test
	public void failureOrangewithBanana() {
		FruitTest test = new FruitTest();
		boolean result = test.orange("banana");
		assertFalse(result);
	}
}