package designpatterns.prototype.pizzaingredients;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ConcretePizzaIngredientsFactoryTest {

  private PizzaIngredientsFactory chicagoFactory;
  private PizzaIngredientsFactory newYorkFactory;

  @Before
  public void setup() {
    chicagoFactory = new ConcretePizzaIngredientsFactory(new ChicagoCheese(), new ChicagoDough(),
        new ChicagoPepperon());
    newYorkFactory = new ConcretePizzaIngredientsFactory(new NewYorkCheese(), new NewYorkDough(),
        new NewYorkPepperon());
  }

  @Test
  public void testCreateCheese() {
    assertTrue(chicagoFactory.createCheese() instanceof ChicagoCheese);
    assertTrue(newYorkFactory.createCheese() instanceof NewYorkCheese);
  }

  @Test
  public void testCreateDough() {
    assertTrue(chicagoFactory.createDough() instanceof ChicagoDough);
    assertTrue(newYorkFactory.createDough() instanceof NewYorkDough);
  }

  @Test
  public void testCreatePepperon() {
    assertTrue(chicagoFactory.createPepperon() instanceof ChicagoPepperon);
    assertTrue(newYorkFactory.createPepperon() instanceof NewYorkPepperon);
  }

}
