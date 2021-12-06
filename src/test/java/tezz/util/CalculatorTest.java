package tezz.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

  @Test
  void simpleMaxTest() {
    assertTrue(10, Calculator.max(new Integer[]{1, 2, 3, 10}));
  }

}

