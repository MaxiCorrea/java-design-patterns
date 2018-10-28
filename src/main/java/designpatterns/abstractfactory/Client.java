package designpatterns.abstractfactory;

class Client {

  private final AbstractFactory abstractFactory;

  Client(AbstractFactory abstractFactory) {
    this.abstractFactory = abstractFactory;
  }

  void usingAbstractProductA() {
    AbstractProductA abstractProductA = abstractFactory.createProductA();
    System.out.println(abstractProductA.getClass().getSimpleName());
  }

  void usingAbstractProductB() {
    AbstractProductB abstractProductB = abstractFactory.createProductB();
    System.out.println(abstractProductB.getClass().getSimpleName());
  }

}
