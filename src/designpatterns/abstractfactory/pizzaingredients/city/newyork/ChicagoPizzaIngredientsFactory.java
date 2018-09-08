package designpatterns.abstractfactory.pizzaingredients.city.newyork;

import designpatterns.abstractfactory.pizzaingredients.city.Cheese;
import designpatterns.abstractfactory.pizzaingredients.city.Dough;
import designpatterns.abstractfactory.pizzaingredients.city.Pepperon;
import designpatterns.abstractfactory.pizzaingredients.city.PizzaIngredientsFactory;
import designpatterns.abstractfactory.pizzaingredients.city.Sauce;
import designpatterns.abstractfactory.pizzaingredients.city.Veggies;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

  @Override
  public Cheese createCheese() {
    return null;
  }

  @Override
  public Dough createDough() {
    return null;
  }

  @Override
  public Pepperon createPepperon() {
    return null;
  }

  @Override
  public Sauce createSauce() {
    return null;
  }

  @Override
  public Veggies[] createVeggies() {
    return null;
  }

}
