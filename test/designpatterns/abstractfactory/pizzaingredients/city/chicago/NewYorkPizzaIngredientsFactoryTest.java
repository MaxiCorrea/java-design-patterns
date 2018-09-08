package designpatterns.abstractfactory.pizzaingredients.city.chicago;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import designpatterns.abstractfactory.pizzaingredients.city.Cheese;
import designpatterns.abstractfactory.pizzaingredients.city.Dough;
import designpatterns.abstractfactory.pizzaingredients.city.Pepperon;
import designpatterns.abstractfactory.pizzaingredients.city.Sauce;
import designpatterns.abstractfactory.pizzaingredients.city.Veggies;

public class NewYorkPizzaIngredientsFactoryTest {

  private NewYorkPizzaIngredientsFactory factory;

  @Before
  public void setup() {
    factory = new NewYorkPizzaIngredientsFactory();
  }

  @Test
  public void testCreateCheese() {
    Cheese cheese = factory.createCheese();
    assertNotNull(cheese);
    assertTrue(cheese instanceof ReggianoCheese);
  }

  @Test
  public void testCreateDough() {
    Dough dough = factory.createDough();
    assertNotNull(dough);
    assertTrue(dough instanceof ThinCrustDough);
  }

  @Test
  public void testCreatePepperon() {
    Pepperon pepperon = factory.createPepperon();
    assertNotNull(pepperon);
    assertTrue(pepperon instanceof NewYorkPepperon);
  }

  @Test
  public void testCreateSauce() {
    Sauce sauce = factory.createSauce();
    assertNotNull(sauce);
    assertTrue(sauce instanceof MarinaraSauce);
  }

  @Test
  public void testCreateVeggies() {
    Veggies[] veggies = factory.createVeggies();
    assertNotNull(veggies);
    assertTrue(veggies[0] instanceof NewYorkVeggies);
  }

}
