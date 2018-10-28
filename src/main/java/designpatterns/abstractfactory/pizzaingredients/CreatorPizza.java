package designpatterns.abstractfactory.pizzaingredients;

import designpatterns.abstractfactory.pizzaingredients.city.PizzaIngredientsFactory;

public class CreatorPizza {

  private final PizzaIngredientsFactory factory;

  public CreatorPizza(PizzaIngredientsFactory factory) {
    this.factory = factory;
  }

  public void build() {
    factory.createCheese();
    factory.createDough();
    factory.createPepperon();
    factory.createSauce();
    factory.createVeggies();
  }

}
