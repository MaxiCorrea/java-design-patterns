package designpatterns.adapter;

public class Client {

  private Target target;
  
  public Client(Target target) {
    this.target = target;
  }
  
  public void operation() {
    target.request();
  }
  
}
