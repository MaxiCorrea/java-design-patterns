package designpatterns.adapter;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ClientTest implements Target {

  private boolean requestCalled;
  private Client client;
  
  @Before
  public void setup() {
    requestCalled = false;
    client = new Client(this);
  }
  
  @Test
  public void testDelegateOperation() {
    assertFalse(requestCalled);
    client.operation();
    assertTrue(requestCalled);
  }

  @Override
  public void request() {
    requestCalled = true;
  }

}
