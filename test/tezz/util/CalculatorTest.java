package tezz.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  @DisplayName("Sample case max element should be found")
  void simpleMaxTest() {
    assertTrue(10, Calculator.max(new int[]{1, 2, 3, 10}));
  }
}
