package designpatterns.abstractfactory.pizzaingredients.city.chicago;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NewYorkPizzaIngredientsFactoryTest {

  private NewYorkPizzaIngredientsFactory factory;

  @Before
  public void setup() {
    factory = new NewYorkPizzaIngredientsFactory();
  }

  @Test
  public void testCreateCheese() {
    assertNotNull(factory.createCheese());
  }

  @Test
  public void testCreateDough() {
    assertNotNull(factory.createDough());
  }

  @Test
  public void testCreatePepperon() {
    assertNotNull(factory.createPepperon());
  }

  @Test
  public void testCreateSauce() {
    assertNotNull(factory.createSauce());
  }

  @Test
  public void testCreateVeggies() {
    assertNotNull(factory.createVeggies());
  }

}
