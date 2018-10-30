package designpatterns.chain;

public abstract class Handler {

  private Handler next;
  
  public Handler(Handler next) {
    this.next = next;
  }
  
  public void handleRequest(Request request) {
    if(next != null) {
      next.handleRequest(request);
    }
  }
}
