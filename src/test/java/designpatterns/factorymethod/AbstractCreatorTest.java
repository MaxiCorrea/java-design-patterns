package designpatterns.factorymethod;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class AbstractCreatorTest {

  private boolean createMethodCalled;
  private AbstractProduct aProduct;
  
  @Before
  public void setup() {
    createMethodCalled = false;
    aProduct = new AbstractProduct() {
      @Override
      void operation() {}
    };
  }
  
  @Test
  public void shouldDelegateTheCreationOfAProductToTheSubclass() {
    AbstractCreator creator = new CreatorTestable();
    assertFalse(createMethodCalled);
    creator.anOperation();
    assertTrue(createMethodCalled);
  }

  private class CreatorTestable extends AbstractCreator {

    @Override
    AbstractProduct factoryMethod() {
      createMethodCalled = true;
      return aProduct;
    }
    
  }
  
}
