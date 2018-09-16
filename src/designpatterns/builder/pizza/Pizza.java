package designpatterns.builder.pizza;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {

  private Set<Topping> toppings;

  Pizza(Builder<?> builder) {
    toppings = builder.toppings.clone();
  }

  Set<Topping> getToppings() {
    return toppings;
  }

  static abstract class Builder<T> {

    private EnumSet<Topping> toppings;

    Builder() {
      toppings = EnumSet.noneOf(Topping.class);
    }

    final T addTopping(Topping topping) {
      toppings.add(topping);
      return self();
    }

    abstract T self();

    abstract Pizza build();

  }

}
