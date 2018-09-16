package designpatterns.builder.pizza;

public class NewYourPizza extends Pizza {

  private Size size;

  private NewYourPizza(Builder builder) {
    super(builder);
    size = builder.size;
  }

  Size getSize() {
    return size;
  }

  static class Builder extends Pizza.Builder<Builder> {

    private Size size;

    Builder(Size size) {
      this.size = size;
    }

    @Override
    Builder self() {
      return this;
    }

    @Override
    NewYourPizza build() {
      return new NewYourPizza(this);
    }

  }

}
