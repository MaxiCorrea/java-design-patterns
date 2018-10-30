package designpatterns.chain;

public class Request {

  private RequestType type;
  private boolean handled;
  
  public Request(RequestType type) {
    this.type = type;
    handled = false;
  }
  
  public boolean hasType(RequestType another) {
    return this.type == another;
  }
  
  public void markHandled() {
    handled = true;
  }
  
  public boolean isHandled() {
    return handled;
  }
  
}
