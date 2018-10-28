package designpatterns.prototype.pizzaingredients;

public class ConcretePizzaIngredientsFactory implements PizzaIngredientsFactory {

  private CheesePrototype cheese;
  private DoughPrototype dough;
  private PepperonPrototype pepperon;

  public ConcretePizzaIngredientsFactory(CheesePrototype cheese, DoughPrototype dough,
      PepperonPrototype pepperon) {
    this.cheese = cheese;
    this.dough = dough;
    this.pepperon = pepperon;
  }

  @Override
  public CheesePrototype createCheese() {
    return cheese.copy();
  }

  @Override
  public DoughPrototype createDough() {
    return dough.copy();
  }

  @Override
  public PepperonPrototype createPepperon() {
    return pepperon.copy();
  }

}
