package tezz.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
  @Test
  @DisplayName("Sample case max element should be found")
  void simpleMaxTest() {
    assertTrue(10, Calculator.max(new int[]{1, 2, 3, 10}));
  }
}
