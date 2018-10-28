package designpatterns.prototype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ClientTest extends Prototype {

  private boolean capyOfSelfCalled;
  
  @Before
  public void setup() {
    capyOfSelfCalled = false;
  }
  
  @Test
  public void shouldCallTheCopyMethodFromThePrototype() {
    assertFalse(capyOfSelfCalled);
    Client client = new Client(this);
    client.operation();
    assertTrue(capyOfSelfCalled);
  }

  @Override
  Object copyOfSelf() {
    capyOfSelfCalled = true;
    return null;
  }

}
