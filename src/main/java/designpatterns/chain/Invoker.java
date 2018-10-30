package designpatterns.chain;

public class Invoker {

  private Handler chain;

  public Invoker() {
    buildChain();
  }

  private void buildChain() {
    chain = new ConcreteHandlerA(new ConcreteHandlerB(null));
  }

  public void makeRequest(Request request) {
    chain.handleRequest(request);
  }

}
