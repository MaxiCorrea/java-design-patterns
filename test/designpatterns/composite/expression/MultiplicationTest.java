package designpatterns.composite.expression;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationTest {

  @Test
  public void testOperation() {
    Number numerator = new Number(4);
    Number denominator = new Number(4);
    Multiplication multiplication;
    multiplication = new Multiplication(numerator, denominator);
    assertEquals(16 , multiplication.operate());
  }
  
  @Test
  public void testToString() {
    Number numerator = new Number(4);
    Number denominator = new Number(4);
    Multiplication multiplication;
    multiplication = new Multiplication(numerator, denominator);
    assertEquals("(4*4)" , multiplication.toString());
  }

}
