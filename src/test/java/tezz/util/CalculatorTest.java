package tezz.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void simpleMaxTest() {
    Integer[] arr = new Integer[]{1, 2, 3, 10};
    Integer maxVal = Calculator.max(arr);
    assertTrue("Random sample test", 10 == maxVal);
  }

}

