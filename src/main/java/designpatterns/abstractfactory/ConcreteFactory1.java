package designpatterns.abstractfactory;

class ConcreteFactory1 extends AbstractFactory {

  @Override
  AbstractProductA createProductA() {
    return new ConcreteProductA1();
  }

  @Override
  AbstractProductB createProductB() {
    return new ConcreteProductB1();
  }

}
