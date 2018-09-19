package designpatterns.singleton.threadsafe;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonLazyLoadedTest {

  @Test
  public void testMultipleCallsReturnTheSameObject() {
    SingletonLazyLoaded unique = SingletonLazyLoaded.getInstance();
    assertSame(unique , SingletonLazyLoaded.getInstance());
    unique = SingletonLazyLoaded.getInstance();
    assertSame(unique , SingletonLazyLoaded.getInstance());
  }

}
