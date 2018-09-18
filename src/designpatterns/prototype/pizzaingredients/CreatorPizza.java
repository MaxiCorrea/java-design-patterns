package designpatterns.prototype.pizzaingredients;

public class CreatorPizza {
  
  private final PizzaIngredientsFactory factory;

  public CreatorPizza(PizzaIngredientsFactory factory) {
    this.factory = factory;
  }

  public void build() {
    factory.createCheese();
    factory.createDough();
    factory.createPepperon();
  }
  
}
