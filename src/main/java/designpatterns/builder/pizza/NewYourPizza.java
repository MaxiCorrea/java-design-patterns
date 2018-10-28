package designpatterns.builder.pizza;

public class NewYourPizza extends AbstractPizza {

  private Size size;

  private NewYourPizza(NewYourBuilder builder) {
    super(builder);
    size = builder.size;
  }

  Size getSize() {
    return size;
  }

  static class NewYourBuilder extends AbstractPizza.AbstractBuilder<NewYourBuilder> {

    private Size size;

    NewYourBuilder(Size size) {
      this.size = size;
    }

    @Override
    NewYourBuilder self() {
      return this;
    }

    @Override
    NewYourPizza build() {
      return new NewYourPizza(this);
    }

  }

}
