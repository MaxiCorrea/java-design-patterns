package designpatterns.abstractfactory;

public class Main {

  public static void main(String[] args) {
    Client client = new Client(new ConcreteFactory1());
    client.usingAbstractProductA();
    client.usingAbstractProductB();
  }

}
