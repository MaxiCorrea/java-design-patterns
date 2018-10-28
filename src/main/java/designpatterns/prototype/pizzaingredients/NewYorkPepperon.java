package designpatterns.prototype.pizzaingredients;

public class NewYorkPepperon extends PepperonPrototype {

  public NewYorkPepperon() {}

  public NewYorkPepperon(NewYorkPepperon other) {}

  @Override
  public PepperonPrototype copy() {
    return new NewYorkPepperon(this);
  }

}
