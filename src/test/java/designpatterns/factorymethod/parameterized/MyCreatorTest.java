package designpatterns.factorymethod.parameterized;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyCreatorTest {

  @Test
  public void testCreate() {
    MyCreator creator = new MyCreator();
    AbstractProduct myProduct = creator.create(ProductID.YOURS);
    assertNotNull(myProduct);
    assertTrue(myProduct instanceof MyProduct);
    AbstractProduct yourProduct = creator.create(ProductID.MINE);
    assertNotNull(yourProduct);
    assertTrue(yourProduct instanceof YourProduct);
    AbstractProduct theirsProduct = creator.create(ProductID.THEIRS);
    assertNotNull(theirsProduct);
    assertTrue(theirsProduct instanceof TheirProduct);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIllegalProductID() {
    MyCreator creator = new MyCreator();
    creator.create(ProductID.UNKNOWN);
  }
}
