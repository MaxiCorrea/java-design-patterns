package designpatterns.abstractfactory.pizzaingredients.city;

public interface PizzaIngredientsFactory {

  Cheese createCheese();

  Dough createDough();

  Pepperon createPepperon();

  Sauce createSauce();

  Veggies[] createVeggies();

}
