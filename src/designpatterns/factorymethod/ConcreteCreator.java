package designpatterns.factorymethod;

class ConcreteCreator extends AbstractCreator {

  @Override
  AbstractProduct factoryMethod() {
    return new ConcreteProduct();
  }

}
