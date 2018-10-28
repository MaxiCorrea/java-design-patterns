package designpatterns.composite.expression;

import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionTest {

  @Test
  public void testOperation() {
    Division division = new Division(new Number(10), new Number(2));
    assertEquals(5, division.operate());
  }

  @Test
  public void testToString() {
    Division division = new Division(new Number(3), new Number(3));
    assertEquals("(3/3)", division.toString());
  }

}
