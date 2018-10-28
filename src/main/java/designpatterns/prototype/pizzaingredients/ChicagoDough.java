package designpatterns.prototype.pizzaingredients;

public class ChicagoDough extends DoughPrototype {

  public ChicagoDough() {}

  public ChicagoDough(ChicagoDough other) {}

  @Override
  public DoughPrototype copy() {
    return new ChicagoDough(this);
  }

}
