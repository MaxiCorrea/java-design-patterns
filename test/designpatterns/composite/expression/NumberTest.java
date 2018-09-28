package designpatterns.composite.expression;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberTest {

  @Test
  public void test() {
    Number n = new Number(5);
    assertEquals(5 , n.operate());
  }

}
