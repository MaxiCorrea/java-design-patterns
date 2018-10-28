package designpatterns.factorymethod.parameterized;

public class DefaultCreator {
  
  public AbstractProduct create(ProductID id) {
    if (ProductID.MINE == id) {
      return new MyProduct();
    }
    if (ProductID.YOURS == id) {
      return new YourProduct();
    }
    throw new IllegalArgumentException();
  }

}
