package designpatterns.decorator.starbuzz;

public class Whip extends CondimentDecorator {

  public Whip(Beverage decorated) {
    super(decorated);
  }

  @Override
  public String getDescription() {
    return getDecorated().getDescription() + ", Whip";
  }
  
  @Override
  public double cost() {
    return .15 + getDecorated().cost();
  }

}
