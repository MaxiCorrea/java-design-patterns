package designpatterns.prototype.pizzaingredients;

public abstract class PepperonPrototype implements Prototype {

  @Override
  public abstract PepperonPrototype copy();
   
}
