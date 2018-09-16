package designpatterns.builder.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalzonePizzaTest {

  @Test
  public void shouldBeAbleToAddToppings() {
    CalzonePizza newYourPizza = new CalzonePizza.CalzoneBuilder().addTopping(Topping.HAM)
        .addTopping(Topping.ONION).build();
    assertFalse(newYourPizza.getToppings().isEmpty());
    assertEquals(2 , newYourPizza.getToppings().size());
    assertTrue(newYourPizza.getToppings().contains(Topping.HAM));
    assertTrue(newYourPizza.getToppings().contains(Topping.ONION));
  }
}
