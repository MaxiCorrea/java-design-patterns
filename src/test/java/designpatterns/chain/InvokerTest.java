package designpatterns.chain;

import static org.junit.Assert.*;
import org.junit.Test;

public class InvokerTest {

  private final static Request REQUESTS [] = {
     new Request(RequestType.TYPE_A),
     new Request(RequestType.TYPE_B),
     new Request(RequestType.TYPE_A),
     new Request(RequestType.TYPE_B)
  };
  
  @Test
  public void testMakeRequests() {
    Invoker invoker = new Invoker();
    for(Request request : REQUESTS) {
        invoker.makeRequest(request);
        assertTrue(request.isHandled());
    }
  }

}
