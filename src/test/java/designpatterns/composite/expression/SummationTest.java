package designpatterns.composite.expression;

import static org.junit.Assert.*;
import org.junit.Test;

public class SummationTest {

  @Test
  public void testOperation() {
    Number numerator = new Number(2);
    Number denominator = new Number(4);
    Summation sum = new Summation(numerator, denominator);
    assertEquals(6, sum.operate());
  }

  @Test
  public void testToString() {
    Number numerator = new Number(2);
    Number denominator = new Number(4);
    Summation sum = new Summation(numerator, denominator);
    assertEquals("(2+4)", sum.toString());
  }

}
