package designpatterns.prototype;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConcretePrototype2Test {

  @Test
  public void testCopyOFSelf() {
    ConcretePrototype2 prototype = new ConcretePrototype2("A");
    ConcretePrototype2 copy = prototype.copyOfSelf();
    assertEquals(copy.getStr() , prototype.getStr());
    assertNotSame(copy , prototype);
  }

}
