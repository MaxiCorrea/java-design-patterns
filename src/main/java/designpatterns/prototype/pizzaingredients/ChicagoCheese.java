package designpatterns.prototype.pizzaingredients;

public class ChicagoCheese extends CheesePrototype {

  public ChicagoCheese() {}

  public ChicagoCheese(ChicagoCheese other) {}
  
  @Override
  public CheesePrototype copy() {
    return new ChicagoCheese(this);
  }

}
