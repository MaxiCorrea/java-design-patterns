package designpatterns.abstractfactory;

class ConcreteFactory2 extends AbstractFactory {

  @Override
  AbstractProductA createProductA() {
    return new ConcreteProductA2();
  }

  @Override
  AbstractProductB createProductB() {
    return new ConcreteProductB2();
  }

}
