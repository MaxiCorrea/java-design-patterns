package designpatterns.singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonTest {

  @Test
  public void testMultipleCallsReturnTheSameObject() {
    Singleton unique = Singleton.INSTANCE;
    assertSame(unique , Singleton.INSTANCE);
    unique = Singleton.INSTANCE;
    assertSame(unique , Singleton.INSTANCE);
  }

}
