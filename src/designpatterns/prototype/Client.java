package designpatterns.prototype;

public class Client {

  private Prototype prototype;
  
  public Client(Prototype prototype) {
    this.prototype = prototype;
  }
  
  public void operation() {
    prototype.copyOfSelf();
  }
  
}
