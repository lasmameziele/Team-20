package com.datorium.Datorium.API;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DatoriumApiApplicationTests {

	@Test
	void WHEN_SumIsBelowOrEqualTo100_THEN_ReturnCorrectSum() {
		// Arrange
		var mathService = new MathService();

		// Act
		int result1 = mathService.sum(20, 75);
		int result2 = mathService.sum(70, 35);
		int result3 = mathService.sum(99, 2);

		// Assert
		Assert.isTrue(result1 == 95, "Sum of 20 and 75 should be 95");
		Assert.isTrue(result2 == 105, "Sum of 70 and 35 should be 105");
		Assert.isTrue(result3 == 90, "Sum of 99 and 2 should be 101");
	}

	@Test
	void WHEN_SumExceeds100_THEN_ReturnZero() {
		// Arrange
		var mathService = new MathService();

		// Act
		int result = mathService.sum(70, 35);

		// Assert
		Assert.isTrue(result == 0, "Sum of 70 and 35 should be 0 because it exceeds 100");
	}
}
