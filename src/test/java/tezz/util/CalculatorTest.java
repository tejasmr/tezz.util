package tezz.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void simpleMaxTest() throws NoElementException {
    assertEquals(10, (int) Calculator.max(new Integer[]{1, 2, 3, 10}));
  }

  @Test
  public void oneElementMaxTest() throws NoElementException {
    assertEquals(1, (int) Calculator.max(new Integer[]{1}));
  }

  @Test
  public void duplicateMaxValuesTest() throws NoElementException {
    assertEquals(1, (int) Calculator.max(new Integer[]{1, 1}));
  }
}

