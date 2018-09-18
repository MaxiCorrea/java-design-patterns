package designpatterns.prototype.pizzaingredients;

public abstract class DoughPrototype implements Prototype {

  @Override
  public abstract DoughPrototype copy();

}
