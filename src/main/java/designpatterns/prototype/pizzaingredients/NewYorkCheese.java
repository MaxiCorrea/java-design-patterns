package designpatterns.prototype.pizzaingredients;

public class NewYorkCheese extends CheesePrototype {

  public NewYorkCheese() {}

  public NewYorkCheese(NewYorkCheese other) {}

  @Override
  public CheesePrototype copy() {
    return new NewYorkCheese(this);
  }

}
