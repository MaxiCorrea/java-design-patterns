package designpatterns.bridge;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AbstractionTest extends Implementor {

  private boolean operationImplCalled;
  private int operationImplInteractions;

  @Before
  public void setup() {
    operationImplCalled = false;
    operationImplInteractions = 0;
  }

  @Test
  public void testOperation() {
    Abstraction abstraction = new Abstraction(this) {};
    assertFalse(operationImplCalled);
    assertEquals(0, operationImplInteractions);
    abstraction.operation();
    assertTrue(operationImplCalled);
    assertEquals(1, operationImplInteractions);
  }

  @Override
  public void operationImpl() {
    operationImplCalled = true;
    operationImplInteractions++;
  }

}
