package designpatterns.prototype;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConcretePrototype1Test {

  @Test
  public void testCopyOfSelf() {
    ConcretePrototype1 prototype = new ConcretePrototype1("A");
    ConcretePrototype1 copy = prototype.copyOfSelf();
    assertEquals(copy.getStr() , prototype.getStr());
    assertNotSame(copy , prototype);
  }

}
