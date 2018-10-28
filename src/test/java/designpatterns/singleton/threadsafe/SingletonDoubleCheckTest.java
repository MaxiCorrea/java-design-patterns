package designpatterns.singleton.threadsafe;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonDoubleCheckTest {

  @Test
  public void testMultipleCallsReturnTheSameObject() {
    SingletonDoubleCheck unique = SingletonDoubleCheck.getInstance();
    assertSame(unique ,  SingletonDoubleCheck.getInstance());
    unique = SingletonDoubleCheck.getInstance();
    assertSame(unique ,  SingletonDoubleCheck.getInstance());
  }

}
