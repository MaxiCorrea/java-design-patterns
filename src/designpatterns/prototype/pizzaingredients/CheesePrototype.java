package designpatterns.prototype.pizzaingredients;

public abstract class CheesePrototype implements Prototype {

  @Override
  public abstract CheesePrototype copy();

}
