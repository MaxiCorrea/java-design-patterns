package designpatterns.composite.expression;

import static org.junit.Assert.*;
import org.junit.Test;

public class SubtractionTest {

  @Test
  public void testOperation() {
    Number numerator = new Number(4);
    Number denominator = new Number(2);
    Subtraction subtraction;
    subtraction = new Subtraction(numerator, denominator);
    assertEquals(2, subtraction.operate());
  }

  @Test
  public void testToString() {
    Number numerator = new Number(4);
    Number denominator = new Number(2);
    Subtraction subtraction;
    subtraction = new Subtraction(numerator, denominator);
    assertEquals("(4-2)", subtraction.toString());
  }

}
