package designpatterns.prototype.pizzaingredients;

public class ChicagoPepperon extends PepperonPrototype {

  public ChicagoPepperon() {}

  public ChicagoPepperon(ChicagoPepperon other) {}

  @Override
  public PepperonPrototype copy() {
    return new ChicagoPepperon(this);
  }

}
