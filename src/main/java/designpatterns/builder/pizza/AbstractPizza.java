package designpatterns.builder.pizza;

import java.util.EnumSet;
import java.util.Set;

public abstract class AbstractPizza {

  private Set<Topping> toppings;

  AbstractPizza(AbstractBuilder<?> builder) {
    toppings = builder.toppings.clone();
  }

  Set<Topping> getToppings() {
    return toppings;
  }

  static abstract class AbstractBuilder<T> {

    private EnumSet<Topping> toppings;

    AbstractBuilder() {
      toppings = EnumSet.noneOf(Topping.class);
    }

    final T addTopping(Topping topping) {
      toppings.add(topping);
      return self();
    }

    abstract T self();

    abstract AbstractPizza build();

  }

}
