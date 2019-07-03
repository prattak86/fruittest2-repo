package fruittest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fruittest2.FruitTest;

public class FailureBananawithOrange {

	@Test
	public void failureBananawithOrange() {
		FruitTest test = new FruitTest();
		boolean result = test.banana("orange");
		assertFalse(result);
	}
}