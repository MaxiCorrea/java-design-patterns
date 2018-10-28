package designpatterns.builder.pizza;

public class CalzonePizza extends AbstractPizza {

  private boolean anyBoolean;

  private CalzonePizza(CalzoneBuilder builder) {
    super(builder);
    this.anyBoolean = builder.anyBoolean;
  }

  boolean getAnyBoolean() {
    return anyBoolean;
  }

  static class CalzoneBuilder extends AbstractPizza.AbstractBuilder<CalzoneBuilder> {

    private boolean anyBoolean;

    CalzoneBuilder() {
      anyBoolean = false;
    }

    final CalzoneBuilder anyBooleanTrue() {
      anyBoolean = true;
      return self();
    }

    @Override
    CalzoneBuilder self() {
      return this;
    }

    @Override
    CalzonePizza build() {
      return new CalzonePizza(this);
    }

  }

}
