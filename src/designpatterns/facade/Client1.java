package designpatterns.facade;

public class Client1 {

  private Facade facade;
  
  public Client1(Facade facade) {
    this.facade = facade;
  }
  
  public void operation() {
    facade.operation();
  }
  
}
