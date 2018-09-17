package designpatterns.factorymethod;

abstract class AbstractCreator {

  void anOperation() {
    AbstractProduct product = create();
    product.operation();
  }
  
  abstract AbstractProduct create();
  
}
