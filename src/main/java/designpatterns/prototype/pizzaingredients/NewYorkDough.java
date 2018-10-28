package designpatterns.prototype.pizzaingredients;

public class NewYorkDough extends DoughPrototype {

  public NewYorkDough() {}

  public NewYorkDough(NewYorkDough other) {}

  @Override
  public DoughPrototype copy() {
    return new NewYorkDough(this);
  }

}
