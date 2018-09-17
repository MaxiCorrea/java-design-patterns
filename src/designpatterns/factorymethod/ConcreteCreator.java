package designpatterns.factorymethod;

class ConcreteCreator extends AbstractCreator {

  @Override
  AbstractProduct create() {
    return new ConcreteProduct();
  }

}
