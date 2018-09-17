package designpatterns.factorymethod;

abstract class AbstractCreator {

  void anOperation() {
    AbstractProduct product = factoryMethod();
    product.operation();
  }
  
  abstract AbstractProduct factoryMethod();
  
}
