package designpatterns.adapter;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AdapterObjectTest extends Adaptee {

  private boolean specificRequestCalled;
  private AdapterObject adapter;
  
  @Before
  public void setup() {
    specificRequestCalled = false;
    adapter = new AdapterObject(this);
  }
  
  @Test
  public void testDelegateRequest() {
    assertFalse(specificRequestCalled);
    adapter.request();
    assertTrue(specificRequestCalled); 
  }

  @Override
  public void specificRequest() {
    specificRequestCalled = true;
  }
  
}
