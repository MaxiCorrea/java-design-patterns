package designpatterns.factorymethod.parameterized;

import static org.junit.Assert.*;
import org.junit.Test;

public class DefaultCreatorTest {

  @Test
  public void testCreate() {
    DefaultCreator creator = new DefaultCreator();
    AbstractProduct myProduct = creator.create(ProductID.MINE);
    assertNotNull(myProduct);
    assertTrue(myProduct instanceof MyProduct);
    AbstractProduct yourProduct = creator.create(ProductID.YOURS);
    assertNotNull(yourProduct);
    assertTrue(yourProduct instanceof YourProduct);
  }

  @Test(expected = IllegalArgumentException.class) 
  public void testIllegalProductID() {
    DefaultCreator creator = new DefaultCreator();
    creator.create(ProductID.THEIRS);
  }
  
}
