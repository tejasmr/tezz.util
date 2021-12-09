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

  @Test
  public void simpleMinTest() throws NoElementException {
    assertEquals(1, (int) Calculator.min(new Integer[]{1, 2, 3, 10}));
  }

  @Test
  public void oneElementMinTest() throws NoElementException {
    assertEquals(1, (int) Calculator.min(new Integer[]{1}));
  }

  @Test
  public void duplicateMinValuesTest() throws NoElementException {
    assertEquals(1, (int) Calculator.min(new Integer[]{1, 1}));
  }
}

