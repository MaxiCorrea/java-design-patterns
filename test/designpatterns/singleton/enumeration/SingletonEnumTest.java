package designpatterns.singleton.enumeration;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonEnumTest {

  @Test
  public void testMultipleCallsReturnTheSameObject() {
    SingletonEnum unique = SingletonEnum.INSTANCE;
    assertSame(unique , SingletonEnum.INSTANCE);
    unique = SingletonEnum.INSTANCE;
    assertSame(unique , SingletonEnum.INSTANCE);
  }

}
