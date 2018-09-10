package designpatterns.templatemethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AbstractClassTest extends AbstractClass {

  private boolean primitiveOperation1Called;
  private boolean primitiveOperation2Called;

  @Before
  public void setup() {
    primitiveOperation1Called = false;
    primitiveOperation2Called = false;
  }

  @Test
  public void theTemplateMethodShouldCallTheAbstractMethods() {
    assertFalse(primitiveOperation1Called);
    assertFalse(primitiveOperation2Called);
    super.templateMethod();
    assertTrue(primitiveOperation1Called);
    assertTrue(primitiveOperation2Called);
  }

  @Override
  void primitiveOperation1() {
    primitiveOperation1Called = true;
  }

  @Override
  void primitiveOperation2() {
    primitiveOperation2Called = true;
  }

}
