package designpatterns.builder.pizza;

public class CalzonePizza extends Pizza {

  private boolean anyBoolean;

  private CalzonePizza(Builder builder) {
    super(builder);
    this.anyBoolean = builder.anyBoolean;
  }

  boolean getAnyBoolean() {
    return anyBoolean;
  }

  static class Builder extends Pizza.Builder<Builder> {

    private boolean anyBoolean;

    Builder() {
      anyBoolean = false;
    }

    final Builder anyBooleanTrue() {
      anyBoolean = true;
      return self();
    }

    @Override
    Builder self() {
      return this;
    }

    @Override
    CalzonePizza build() {
      return new CalzonePizza(this);
    }

  }

}
