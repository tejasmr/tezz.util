package tezz.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  Calculator calc;
  
  @BeforeEach
  public void setUp() {
    calc = new Calculator();
  }
  
  @Test
  @DisplayName("Sample case max element should be found")
  void simpleMaxTest() {
    assertTrue(10, calc.max({1, 2, 3, 10}));
  }
}
