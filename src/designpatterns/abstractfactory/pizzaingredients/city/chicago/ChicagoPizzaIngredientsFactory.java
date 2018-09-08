package designpatterns.abstractfactory.pizzaingredients.city.chicago;

import designpatterns.abstractfactory.pizzaingredients.city.Cheese;
import designpatterns.abstractfactory.pizzaingredients.city.Dough;
import designpatterns.abstractfactory.pizzaingredients.city.Pepperon;
import designpatterns.abstractfactory.pizzaingredients.city.PizzaIngredientsFactory;
import designpatterns.abstractfactory.pizzaingredients.city.Sauce;
import designpatterns.abstractfactory.pizzaingredients.city.Veggies;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Pepperon createPepperon() {
    return new ChicagoPepperon();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[] {new ChicagoVeggies()};
  }

}
