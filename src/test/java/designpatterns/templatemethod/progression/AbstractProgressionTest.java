package designpatterns.templatemethod.progression;

import static org.junit.Assert.*;
import org.junit.Test;

public class AbstractProgressionTest extends AbstractProgression {

  private boolean advanceMethodCalled = false;
  
  @Test
  public void theNextValueTemplateMethodShouldCallTheAbstractMethodOfItsSubclass() {
    assertFalse(advanceMethodCalled);
    nextValue();
    assertTrue(advanceMethodCalled);
  }

  @Override
  int advance() {
    advanceMethodCalled = true;
    return 0;
  }

}
