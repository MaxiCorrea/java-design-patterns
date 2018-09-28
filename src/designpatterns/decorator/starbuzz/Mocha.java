package designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage decorated) {
    super(decorated);
  }

  @Override
  public String getDescription() {
    return getDecorated().getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return .20 + getDecorated().cost();
  }

}
