package designpatterns.composite.expression;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExpressionTest {

  // ((3-((4/2)*3))+4)

  private Expression expression = new Summation(
      new Subtraction(new Number(3),
          new Multiplication(new Division(new Number(4), new Number(2)), new Number(3))),
      new Number(4));


  @Test
  public void testingCompoundOperation() {
    assertEquals(1 , expression.operate());
  }

  @Test
  public void testingToStringOfCompoundOperation() {
    assertEquals("((3-((4/2)*3))+4)" , expression.toString());
  }

}
