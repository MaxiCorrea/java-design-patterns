package designpatterns.decorator.starbuzz;

public class Milk extends CondimentDecorator {

  public Milk(Beverage decorated) {
    super(decorated);
  }

  @Override
  public String getDescription() {
    return getDecorated().getDescription() + ", Milk";
  }

  @Override
  public double cost() {
    return .10 + getDecorated().cost();
  }

}
