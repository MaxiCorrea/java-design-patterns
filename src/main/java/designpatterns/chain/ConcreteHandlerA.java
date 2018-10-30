package designpatterns.chain;

public class ConcreteHandlerA extends Handler {

  public ConcreteHandlerA(Handler next) {
    super(next);
  }

  @Override
  public void handleRequest(Request request) {
    if (request.hasType(RequestType.TYPE_A)) {
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }
}
