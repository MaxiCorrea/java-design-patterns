package designpatterns.decorator.starbuzz;

import static org.junit.Assert.*;
import org.junit.Test;

public class CondimentDecoratorTest {

  @Test
  public void testCostOfEspressoWithMilk() {
    Beverage beverage = new Espresso();
    Milk milk = new Milk(beverage);
    double totalCost = milk.cost();
    assertEquals(.10 + 1.99, totalCost, 0.0);
  }

  @Test
  public void testCostOfDecafWithMilk() {
    Beverage beverage = new Decaf();
    Milk milk = new Milk(beverage);
    double totalCost = milk.cost();
    assertEquals(.10 + 1.05, totalCost, 0.0);
  }

  @Test
  public void testMixingCondiments() {
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    assertEquals(1.5399999999999998, beverage2.cost(), 0.0);
  }

  @Test
  public void testDescriptions() {
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    String expected = "House Blend Coffee, Soy, Mocha, Whip";
    assertEquals(expected , beverage3.getDescription());
  }

}
