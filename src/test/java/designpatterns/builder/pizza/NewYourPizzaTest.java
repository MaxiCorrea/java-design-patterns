package designpatterns.builder.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

public class NewYourPizzaTest {

  @Test
  public void shouldBeAbleToSetTheSize() {
    NewYourPizza newYourPizza1 = new NewYourPizza.NewYourBuilder(Size.SMALL).build();
    assertEquals(Size.SMALL, newYourPizza1.getSize());
    NewYourPizza newYourPizza2 = new NewYourPizza.NewYourBuilder(Size.MEDIUM).build();
    assertEquals(Size.MEDIUM, newYourPizza2.getSize());
    NewYourPizza newYourPizza3 = new NewYourPizza.NewYourBuilder(Size.LARGE).build();
    assertEquals(Size.LARGE, newYourPizza3.getSize());
  }

  @Test
  public void shouldBeAbleToAddToppings() {
    NewYourPizza newYourPizza = new NewYourPizza.NewYourBuilder(Size.SMALL).addTopping(Topping.HAM)
        .addTopping(Topping.ONION).build();
    assertFalse(newYourPizza.getToppings().isEmpty());
    assertEquals(2 , newYourPizza.getToppings().size());
    assertTrue(newYourPizza.getToppings().contains(Topping.HAM));
    assertTrue(newYourPizza.getToppings().contains(Topping.ONION));
  }

}
