package designpatterns.prototype.pizzaingredients;

public interface PizzaIngredientsFactory {

  CheesePrototype createCheese();

  DoughPrototype createDough();

  PepperonPrototype createPepperon();

}
