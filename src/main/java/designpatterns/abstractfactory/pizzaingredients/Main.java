package designpatterns.abstractfactory.pizzaingredients;

import designpatterns.abstractfactory.pizzaingredients.city.PizzaIngredientsFactory;
import designpatterns.abstractfactory.pizzaingredients.city.newyork.NewYorkPizzaIngredientsFactory;

public class Main {

  public static void main(String[] args) {
    PizzaIngredientsFactory factory = new NewYorkPizzaIngredientsFactory();
    CreatorPizza creatorPizza = new CreatorPizza(factory);
    creatorPizza.build();
  }

}
