package designpatterns.factorymethod.parameterized;

public class MyCreator extends DefaultCreator {

  @Override
  public AbstractProduct create(ProductID id) {
    if (ProductID.MINE == id) {
      return new YourProduct();
    }
    if (ProductID.YOURS == id) {
      return new MyProduct();
    }
    if (ProductID.THEIRS == id) {
      return new TheirProduct();
    }
    return super.create(id);
  }

}
