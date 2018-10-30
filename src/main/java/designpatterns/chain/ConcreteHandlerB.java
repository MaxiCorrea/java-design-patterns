package designpatterns.chain;

public class ConcreteHandlerB extends Handler {

  public ConcreteHandlerB(Handler next) {
    super(next);
  }

  @Override
  public void handleRequest(Request request) {
    if(request.hasType(RequestType.TYPE_B)) {
      request.markHandled();
    } else {
      super.handleRequest(request);     
    }
  }
  
}
