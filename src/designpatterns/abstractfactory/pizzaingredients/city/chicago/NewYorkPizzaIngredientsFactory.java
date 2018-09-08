package designpatterns.abstractfactory.pizzaingredients.city.chicago;

import designpatterns.abstractfactory.pizzaingredients.city.Cheese;
import designpatterns.abstractfactory.pizzaingredients.city.Dough;
import designpatterns.abstractfactory.pizzaingredients.city.Pepperon;
import designpatterns.abstractfactory.pizzaingredients.city.PizzaIngredientsFactory;
import designpatterns.abstractfactory.pizzaingredients.city.Sauce;
import designpatterns.abstractfactory.pizzaingredients.city.Veggies;

public class NewYorkPizzaIngredientsFactory implements PizzaIngredientsFactory {

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Pepperon createPepperon() {
    return new NewYorkPepperon();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[] {new NewYorkVeggies()};
  }

}
