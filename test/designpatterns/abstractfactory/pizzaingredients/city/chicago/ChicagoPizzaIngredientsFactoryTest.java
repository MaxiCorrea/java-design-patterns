package designpatterns.abstractfactory.pizzaingredients.city.chicago;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import designpatterns.abstractfactory.pizzaingredients.city.Cheese;
import designpatterns.abstractfactory.pizzaingredients.city.Dough;
import designpatterns.abstractfactory.pizzaingredients.city.Pepperon;
import designpatterns.abstractfactory.pizzaingredients.city.Sauce;
import designpatterns.abstractfactory.pizzaingredients.city.Veggies;

public class ChicagoPizzaIngredientsFactoryTest {

  private ChicagoPizzaIngredientsFactory factory;

  @Before
  public void setup() {
    factory = new ChicagoPizzaIngredientsFactory();
  }

  @Test
  public void testCreateCheese() {
    Cheese cheese = factory.createCheese();
    assertNotNull(cheese);
    assertTrue(cheese instanceof MozzarellaCheese);
  }

  @Test
  public void testCreateDough() {
    Dough dough = factory.createDough();
    assertNotNull(dough);
    assertTrue(dough instanceof ThickCrustDough);
  }

  @Test
  public void testCreatePepperon() {
    Pepperon pepperon = factory.createPepperon();
    assertNotNull(pepperon);
    assertTrue(pepperon instanceof ChicagoPepperon);
  }

  @Test
  public void testCreateSauce() {
    Sauce sauce = factory.createSauce();
    assertNotNull(sauce);
    assertTrue(sauce instanceof PlumTomatoSauce);
  }

  @Test
  public void testCreateVeggies() {
    Veggies[] veggies = factory.createVeggies();
    assertNotNull(veggies);
    assertTrue(veggies[0] instanceof ChicagoVeggies);
  }


}
